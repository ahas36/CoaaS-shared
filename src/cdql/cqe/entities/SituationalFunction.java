package cdql.cqe.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ali on 14/02/2017.
 */
public class SituationalFunction extends ContextFunction {

    private List<EntityType> arguments;
    private List<Situation> situations;


    public SituationalFunction(String functionTitle) {
        super(functionTitle);
        this.arguments = new ArrayList<EntityType>();
        this. situations=new ArrayList<Situation>();
    }

    public List<EntityType> getArguments() {
        return arguments;
    }

    public void setArguments(List<EntityType> arguments) {
        this.arguments = arguments;
    }

    public List<Situation> getSituations() {
        return situations;
    }

    public void setSituations(List<Situation> situations) {
        this.situations = situations;
    }

    public void addSituation(Situation situation)
    {
        situations.add(situation);
    }

    public void addArgument(EntityType arg)
    {
        arguments.add(arg);
    }
}
