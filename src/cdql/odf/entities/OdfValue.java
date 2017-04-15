package cdql.odf.entities;

import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "value")
@Entity
@Table(name = "VALUE")
public class OdfValue<T> {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    
    @JoinColumn(name = "INFO_ITEM_ID", referencedColumnName = "ID")
    @ManyToOne
    private OdfInfoItem infoItem;
    
    @Column(name = "datetime")
    private Timestamp datetime;
    
    @Column(name = "type")
    private String  type;
    
    @Column(name = "datavalue")
    private T datavalue;

    public Timestamp getDatetime() {
        return datetime;
    }

    @XmlAttribute(name = "dateTime")
    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }

    public T getDatavalue() {
        return datavalue;
    }

    @XmlValue
    public void setDatavalue(T datavalue) {
        this.datavalue = datavalue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OdfInfoItem getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(OdfInfoItem infoItem) {
        this.infoItem = infoItem;
    }

    
    
}
