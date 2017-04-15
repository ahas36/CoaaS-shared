package cdql.odf.entities;



import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@XmlRootElement
@Entity
@Table(name = "INFOITEM")
public class OdfInfoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    
    @Column
    private String name;
    
    @Column
    private String description;
    
    @JoinColumn(name = "OBJECT_ID", referencedColumnName = "ID")
    @ManyToOne
    private OdfObject parentObject;
    
    @JoinColumn(name = "METADATA_ID", referencedColumnName = "ID")
    @ManyToOne
    private OdfMetaData parentMetaData;
    
    @OneToMany(mappedBy = "infoItem")
    private Collection<OdfValue<Object>> values = new ArrayList<>();
    
    @OneToMany(mappedBy = "parentInfoItem")
    private Collection<OdfMetaData> metaData = new ArrayList<>();

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public Collection<OdfValue<Object>> getValues() {
        return values;
    }

    @XmlElement(name = "value")
    public void setValues(Collection<OdfValue<Object>> values) {
        this.values = values;
    }

    public Collection<OdfMetaData> getMetaData() {
        return metaData;
    }

    @XmlElement(name = "MetaData")
    public void setMetaData(Collection<OdfMetaData> metaData) {
        this.metaData = metaData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OdfObject getParentObject() {
        return parentObject;
    }

    public void setParentObject(OdfObject parentObject) {
        this.parentObject = parentObject;
    }

    public OdfMetaData getParentMetaData() {
        return parentMetaData;
    }

    public void setParentMetaData(OdfMetaData parentMetaData) {
        this.parentMetaData = parentMetaData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
