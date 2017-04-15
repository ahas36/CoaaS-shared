package cdql.cqe.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ali on 14/02/2017.
 */
public class Situation {
    private String situationTitle;
    private Map<String,SituationAcceptedValue> situationDef;

    public Situation(String situationTitle) {
        this.situationTitle = situationTitle;
        situationDef=new HashMap<String, SituationAcceptedValue>();
    }

    public String getSituationTitle() {
        return situationTitle;
    }

    public void setSituationTitle(String situationTitle) {
        this.situationTitle = situationTitle;
    }

    public Map<String, SituationAcceptedValue> getSituationDef() {
        return situationDef;
    }

    public void setSituationDef(Map<String, SituationAcceptedValue> situationDef) {
        this.situationDef = situationDef;
    }

    public void addSituationDef(String attribute, SituationAcceptedValue values)
    {
        situationDef.put(attribute,values);
    }
}
