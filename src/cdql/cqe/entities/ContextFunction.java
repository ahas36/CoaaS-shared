package cdql.cqe.entities;

/**
 * Created by ali on 14/02/2017.
 */
public class ContextFunction {
    private String functionTitle;

    public String getFunctionTitle() {
        return functionTitle;
    }

    public void setFunctionTitle(String functionTitle) {
        this.functionTitle = functionTitle;
    }

    public ContextFunction(String functionTitle) {
        this.functionTitle = functionTitle;
    }
}
