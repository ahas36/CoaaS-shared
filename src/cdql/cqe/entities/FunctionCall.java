package cdql.cqe.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ali on 13/02/2017.
 */
public class FunctionCall {
    private String functionName;
    private List<Operand> arguments=new ArrayList<Operand>();

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<Operand> getArguments() {
        return arguments;
    }

    public void setArguments(List<Operand> arguments) {
        this.arguments = arguments;
    }

    public FunctionCall(String functionName) {
        this.functionName = functionName;
    }

    public void addOperand(Operand operand)
    {
        arguments.add(operand);
    }
}
