package cdql.odf.entities;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.HashSet;
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
@Table(name = "METADATA")

public class OdfMetaData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    
    @JoinColumn(name = "INFO_ITEM_ID", referencedColumnName = "ID")
    @ManyToOne
    private OdfInfoItem parentInfoItem;
    
    @OneToMany(mappedBy = "parentMetaData")
    private Collection<OdfInfoItem> infoItems;

    public Collection<OdfInfoItem> getInfoItems() {
        return infoItems;
    }

    @XmlElement(name = "InfoItem")
    public void setInfoItems(Collection<OdfInfoItem> infoItems) {
        this.infoItems = infoItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OdfInfoItem getParentInfoItem() {
        return parentInfoItem;
    }

    public void setParentInfoItem(OdfInfoItem parentInfoItem) {
        this.parentInfoItem = parentInfoItem;
    }

    

}
