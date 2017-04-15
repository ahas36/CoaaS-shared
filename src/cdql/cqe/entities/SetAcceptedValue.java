package cdql.cqe.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ali on 14/02/2017.
 */
public class SetAcceptedValue  extends SituationAcceptedValue{
    private Set<String> acceptedValues;

    public SetAcceptedValue() {
        this.acceptedValues = new HashSet<String>();
    }

    public void addValue(String val)
    {
        acceptedValues.add(val);
    }

    public Set<String> getAcceptedValues() {
        return acceptedValues;
    }

    public void setAcceptedValues(Set<String> acceptedValues) {
        this.acceptedValues = acceptedValues;
    }
}
