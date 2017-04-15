package cdql.odf.entities;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@XmlRootElement
@Entity
@Table(name = "OBJECT")
public class OdfObject {
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    
    @OneToMany(mappedBy = "parentObject")
    private Collection<OdfInfoItem> infoItems = new ArrayList<>();
    
    @JoinColumn(name = "PARENT", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private OdfObject parent;
    
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private Collection<OdfObject> objects = new ArrayList<>();

    public String getId() {
        return id;
    }

    @XmlElement(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public Collection<OdfInfoItem> getInfoItems() {
        return infoItems;
    }

    @XmlElement(name = "InfoItem")
    public void setInfoItems(Collection<OdfInfoItem> infoItems) {
        this.infoItems = infoItems;
    }

    public Collection<OdfObject> getObjects() {
        return objects;
    }

    public OdfObject getParent() {
        return parent;
    }

    public void setParent(OdfObject parent) {
        this.parent = parent;
    }

    @XmlElement(name = "Object")
    public void setObjects(Collection<OdfObject> objects) {
        this.objects = objects;
    }

}
