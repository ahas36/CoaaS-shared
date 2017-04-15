package cdql.cqe.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ali on 13/02/2017.
 */
public class ContextAttribute {
    private String entityName;
    private List<String> subElements;

    public ContextAttribute(String entityName) {
        this.entityName = entityName;
        this.subElements = new ArrayList<String>();
    }


    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public List<String> getSubElements() {
        return subElements;
    }

    public void setSubElements(List<String> subElements) {
        this.subElements = subElements;
    }

    public void AddElements(String element)
    {
        subElements.add(element);
    }
}
