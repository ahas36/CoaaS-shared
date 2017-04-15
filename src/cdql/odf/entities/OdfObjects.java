package cdql.odf.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

@XmlRootElement
public class OdfObjects {

    private Collection<OdfObject> objects;

    public Collection<OdfObject> getObjects() {
        return objects;
    }

    @XmlElement(name = "Object")
    public void setObjects(Collection<OdfObject> objects) {
        this.objects = objects;
    }
}
