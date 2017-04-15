package cdql.cqe.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ali on 14/02/2017.
 */
public class RelationalFunction extends ContextFunction {

    private List<EntityType> arguments;

    private RelationType relationType;

    public RelationalFunction(String functionTitle) {
        super(functionTitle);
        this.arguments = new ArrayList<EntityType>();
    }

    public RelationalFunction(String functionTitle,  RelationType relationType) {
        super(functionTitle);
        this.arguments = new ArrayList<EntityType>();
        this.relationType = relationType;
    }

    public List<EntityType> getArguments() {
        return arguments;
    }

    public void setArguments(List<EntityType> arguments) {
        this.arguments = arguments;
    }

    public RelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationType relationType) {
        this.relationType = relationType;
    }

    public void addArgument(EntityType arg)
    {
        arguments.add(arg);
    }
}
