package cdql.cqe;

// Generated from CDQL.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CDQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ICDQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CDQLParser#cdql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdql(CDQLParser.CdqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#pull_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull_clause(CDQLParser.Pull_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(CDQLParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#select_context_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_context_attribute(CDQLParser.Select_context_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#context_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_attribute(CDQLParser.Context_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#entity_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_title(CDQLParser.Entity_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#attribute_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_title(CDQLParser.Attribute_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(CDQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#function_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_title(CDQLParser.Function_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(CDQLParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#context_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_value(CDQLParser.Context_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#push_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_clause(CDQLParser.Push_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#subscriber_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriber_clause(CDQLParser.Subscriber_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#context_requester}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_requester(CDQLParser.Context_requesterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause(CDQLParser.When_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#occurrence_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOccurrence_clause(CDQLParser.Occurrence_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#condition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_clause(CDQLParser.Condition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_and(CDQLParser.Condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_not(CDQLParser.Condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#constraint_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_clause(CDQLParser.Constraint_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#left_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_element(CDQLParser.Left_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#right_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_element(CDQLParser.Right_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#target_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_element(CDQLParser.Target_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(CDQLParser.Relational_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#between_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_op(CDQLParser.Between_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#is_or_is_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_or_is_not(CDQLParser.Is_or_is_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#define_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_clause(CDQLParser.Define_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#context_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_entity(CDQLParser.Context_entityContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#entity_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_id(CDQLParser.Entity_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#context_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_function(CDQLParser.Context_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#aggregation_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_function(CDQLParser.Aggregation_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#relational_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_function(CDQLParser.Relational_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#situational_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSituational_function(CDQLParser.Situational_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#function_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_id(CDQLParser.Function_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#situation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSituation(CDQLParser.SituationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#situation_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSituation_id(CDQLParser.Situation_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(CDQLParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#entitiy_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitiy_type(CDQLParser.Entitiy_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(CDQLParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(CDQLParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(CDQLParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#hostnumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostnumber(CDQLParser.HostnumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(CDQLParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(CDQLParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(CDQLParser.SearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#searchparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchparameter(CDQLParser.SearchparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(CDQLParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(CDQLParser.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDQLParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(CDQLParser.PasswordContext ctx);
}