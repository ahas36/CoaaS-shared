package cdql.cqe;

import cdql.cqe.entities.Operand;
import cdql.cqe.entities.ContextAttribute;
import cdql.cqe.entities.ContextEntity;
import cdql.cqe.entities.EntityType;
import cdql.cqe.entities.SituationAcceptedValue;
import cdql.cqe.entities.SetAcceptedValue;
import cdql.cqe.entities.Situation;
import cdql.cqe.entities.AggregationFunction;
import cdql.cqe.entities.RelationalFunction;
import cdql.cqe.entities.RangeAcceptedValue;
import cdql.cqe.entities.RelationType;
import cdql.cqe.entities.OperandType;
import cdql.cqe.entities.ContextFunction;
import cdql.cqe.entities.FunctionCall;
import cdql.cqe.entities.SituationalFunction;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Created by ali on 13/02/2017.
 */
public class CDQLVisitor extends  CDQLBaseVisitor<String> {
    private Map<String,ContextEntity> definedEntities;
    private Map<String,ContextFunction> definedFunctions;
    private Map<String,HashSet<String>> definedContextAttributes;
    private List<ContextAttribute> selectAttribute;
    private List<FunctionCall> selectFunctionCalls;
    private Set<String> usedContextEntities;
    private Set<String> calledFunctions;
    public CDQLVisitor() {
        definedEntities = new HashMap<>();
        definedFunctions=new HashMap<>();
        selectAttribute = new ArrayList<>();
        selectFunctionCalls = new ArrayList<>();
        calledFunctions=new HashSet<>();
        usedContextEntities=new HashSet<>();
        definedContextAttributes=new HashMap<>();
    }

    @Override
    public String visitEntity_title(CDQLParser.Entity_titleContext ctx) {
        usedContextEntities.add(ctx.getText());
        return super.visitEntity_title(ctx);
    }

    @Override
    public String visitSelect_context_attribute(CDQLParser.Select_context_attributeContext ctx) {
        ParseTree child = ctx.getChild(0);
        String entityName=child.getChild(0).getChild(0).getText();
        ContextAttribute ctxAttribute=new ContextAttribute(entityName);
        int childCount = child.getChildCount();
        for (int i=2;i<childCount;i+=2)
            ctxAttribute.AddElements(child.getChild(i).getChild(0).getText());
        selectAttribute.add(ctxAttribute);
        return super.visitSelect_context_attribute(ctx);
    }

    @Override
    public String visitFunction_call(CDQLParser.Function_callContext ctx) {
        String functionTitle= ctx.getChild(0).getChild(0).getText();
        calledFunctions.add(functionTitle);
        if(ctx.getParent().getClass().equals(CDQLParser.Select_clauseContext.class)) {
            FunctionCall fCall = new FunctionCall(ctx.getChild(0).getChild(0).getText());
            int childCount = ctx.getChildCount();
            for (int i = 2; i < childCount; i += 2) {
                Operand operand = new Operand();
                ParseTree arg = ctx.getChild(i);
                ParseTree argType = arg.getChild(0);
                if (argType.getClass().equals(CDQLParser.Entity_titleContext.class)) {
                    operand.setType(OperandType.CONTEXT_ENTITY);
                    operand.setValue(argType.getText());
                } else if (argType.getClass().equals(CDQLParser.Context_attributeContext.class)) {
                    operand.setType(OperandType.CONTEXT_ATTRIBUTE);
                    operand.setValue(argType.getText());
                }
                fCall.addOperand(operand);
            }
            selectFunctionCalls.add(fCall);
        }
        return super.visitFunction_call(ctx);
    }



    @Override
    public String visitContext_entity(CDQLParser.Context_entityContext ctx) {
        String contextTitle=ctx.getChild(1).getText();
        EntityType entityType=EntityType.valueOf(ctx.getChild(3).getText().replace("$","").toUpperCase());
        ParseTree conds = ctx.getChild(5);
        definedEntities.put(contextTitle,new ContextEntity(entityType,contextTitle,conds));
        return super.visitContext_entity(ctx);
    }


    @Override
    public String visitAggregation_function(CDQLParser.Aggregation_functionContext ctx)
    {
        AggregationFunction aFunction=new AggregationFunction(ctx.getChild(1).getText());
        aFunction.setURL(ctx.getChild(3).getText());
        definedFunctions.put(aFunction.getFunctionTitle(),aFunction);
        return super.visitAggregation_function(ctx);
    }

    @Override
    public String visitRelational_function(CDQLParser.Relational_functionContext ctx)
    {
        RelationalFunction rFunction=new RelationalFunction(ctx.getChild(1).getText());
        rFunction.setRelationType(RelationType.valueOf(ctx.getChild(3).getText().replace("$", "").toUpperCase()));
        for(int i=5;i<ctx.getChildCount();i+=2) {
            rFunction.addArgument(EntityType.valueOf(ctx.getChild(i).getText().replace("$", "").toUpperCase()));
        }
        definedFunctions.put(rFunction.getFunctionTitle(),rFunction);
        return super.visitRelational_function(ctx);
    }
    
    @Override
    public String visitContext_attribute(CDQLParser.Context_attributeContext ctx)
    {
        
        String value = ctx.getText();
        int indexOf = value.indexOf(".");
        String entity=value.substring(0, indexOf);
        String attribute=value.substring(indexOf);
        if(definedContextAttributes.containsKey(entity))
        {
            definedContextAttributes.get(entity).add(attribute);
        }
        else
        {
            HashSet<String> hashSet=new HashSet<>();
            hashSet.add(attribute);
            definedContextAttributes.put(entity, hashSet);
        }
        return super.visitContext_attribute(ctx);
    }
    
    @Override
    public String visitSituational_function(CDQLParser.Situational_functionContext ctx)
    {
        SituationalFunction sFunction=new SituationalFunction(ctx.getChild(1).getText());
        sFunction.addArgument(EntityType.valueOf(ctx.getChild(3).getText().replace("$", "").toUpperCase()));
        for(int i=5;i<ctx.getChildCount();i+=2) {
            ParseTree situationTree = ctx.getChild(i);
            Situation situation=new Situation(situationTree.getChild(1).getText());
            for(int j=3;j<situationTree.getChildCount();j+=4)
            {
                String attributeName=situationTree.getChild(j).getText();
                ParseTree acceptedValueTree=situationTree.getChild(j+2);
                SituationAcceptedValue acceptedValues;
                if (acceptedValueTree.getChild(0).getText().equals("["))
                {
                    acceptedValues=new RangeAcceptedValue();
                    ((RangeAcceptedValue)acceptedValues).setStart(Double.valueOf(acceptedValueTree.getChild(1).getText()));
                    ((RangeAcceptedValue)acceptedValues).setEnd(Double.valueOf(acceptedValueTree.getChild(3).getText()));
                }
                else
                {
                    acceptedValues=new SetAcceptedValue();
                    for(int z=1;z<acceptedValueTree.getChildCount();z+=2)
                    {
                        ((SetAcceptedValue)acceptedValues).addValue(acceptedValueTree.getChild(z).getText());
                    }
                }
                situation.addSituationDef(attributeName,acceptedValues);
            }
            sFunction.addSituation(situation);
        }
        definedFunctions.put(sFunction.getFunctionTitle(),sFunction);
        return super.visitSituational_function(ctx);
    }

    private void traverseConditions(ParseTree condition,Stack<String> conditionStack)
    {
        if (condition.getChildCount()==0) {
            conditionStack.push(condition.getText());
            return;
        }
        for(int i=0;i<condition.getChildCount();i++) {
                traverseConditions(condition.getChild(i),conditionStack);
        }
    }

    public Map<String, ContextEntity> getDefinedEntities() {
        return definedEntities;
    }

    public void setDefinedEntities(Map<String, ContextEntity> definedEntities) {
        this.definedEntities = definedEntities;
    }

    public Map<String, ContextFunction> getDefinedFunctions() {
        return definedFunctions;
    }

    public void setDefinedFunctions(Map<String, ContextFunction> definedFunctions) {
        this.definedFunctions = definedFunctions;
    }

    public List<ContextAttribute> getSelectAttribute() {
        return selectAttribute;
    }

    public void setSelectAttribute(List<ContextAttribute> selectAttribute) {
        this.selectAttribute = selectAttribute;
    }

    public List<FunctionCall> getSelectFunctionCalls() {
        return selectFunctionCalls;
    }

    public void setSelectFunctionCalls(List<FunctionCall> selectFunctionCalls) {
        this.selectFunctionCalls = selectFunctionCalls;
    }

    public Set<String> getUsedContextEntities() {
        return usedContextEntities;
    }

    public void setUsedContextEntities(Set<String> usedContextEntities) {
        this.usedContextEntities = usedContextEntities;
    }

    public Set<String> getCalledFunctions() {
        return calledFunctions;
    }

    public void setCalledFunctions(Set<String> calledFunctions) {
        this.calledFunctions = calledFunctions;
    }

    public Map<String, HashSet<String>> getDefinedContextAttributes() {
        return definedContextAttributes;
    }

    public void setDefinedContextAttributes(Map<String, HashSet<String>> definedContextAttributes) {
        this.definedContextAttributes = definedContextAttributes;
    }
    
    
}
