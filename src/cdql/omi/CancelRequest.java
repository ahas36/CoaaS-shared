package cdql.omi;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cancel request type.
 * 
 * <p>Java class for cancelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeList" type="{omi.xsd}nodesType" minOccurs="0"/&gt;
 *         &lt;element name="requestID" type="{omi.xsd}idType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelRequest", propOrder = {
    "nodeList",
    "requestID"
})
public class CancelRequest {

    protected NodesType nodeList;
    @XmlElement(required = true)
    protected List<IdType> requestID;

    /**
     * Gets the value of the nodeList property.
     * 
     * @return
     *     possible object is
     *     {@link NodesType }
     *     
     */
    public NodesType getNodeList() {
        return nodeList;
    }

    /**
     * Sets the value of the nodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodesType }
     *     
     */
    public void setNodeList(NodesType value) {
        this.nodeList = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdType }
     * 
     * 
     */
    public List<IdType> getRequestID() {
        if (requestID == null) {
            requestID = new ArrayList<IdType>();
        }
        return this.requestID;
    }

}
