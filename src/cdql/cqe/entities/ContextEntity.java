package cdql.cqe.entities;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * Created by ali on 13/02/2017.
 */
public class ContextEntity {
    private EntityType type;
    private String entityID;
    private Condition condition;

    public ContextEntity(EntityType type, String entityID, ParseTree conds) {
        this.type = type;
        this.entityID = entityID;
        if(conds!=null) {
            this.condition = new Condition(conds);
            this.condition.getDependency().remove(entityID);
        }
    }

    public EntityType getType() {
        return type;
    }

    public void setType(EntityType type) {
        this.type = type;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }


    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }


}
