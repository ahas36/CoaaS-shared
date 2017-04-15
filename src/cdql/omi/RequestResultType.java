package cdql.omi;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Result of a request.
 * 
 * <p>Java class for requestResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{omi.xsd}returnType"/&gt;
 *         &lt;element name="requestID" type="{omi.xsd}idType" minOccurs="0"/&gt;
 *         &lt;element ref="{omi.xsd}msg" minOccurs="0"/&gt;
 *         &lt;element name="nodeList" type="{omi.xsd}nodesType" minOccurs="0"/&gt;
 *         &lt;element ref="{omi.xsd}omiEnvelope" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="msgformat" type="{omi.xsd}schemaID" /&gt;
 *       &lt;attribute name="targetType" default="node"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="device"/&gt;
 *             &lt;enumeration value="node"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestResultType", propOrder = {
    "_return",
    "requestID",
    "msg",
    "nodeList",
    "omiEnvelope"
})
public class RequestResultType {

    @XmlElement(name = "return", required = true)
    protected ReturnType _return;
    protected IdType requestID;
    protected Object msg;
    protected NodesType nodeList;
    protected OmiEnvelope omiEnvelope;
    @XmlAttribute(name = "msgformat")
    protected String msgformat;
    @XmlAttribute(name = "targetType")
    protected String targetType;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnType }
     *     
     */
    public ReturnType getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnType }
     *     
     */
    public void setReturn(ReturnType value) {
        this._return = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setRequestID(IdType value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMsg(Object value) {
        this.msg = value;
    }

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
     * Present if the sender wants to submit a new request to the receiver. This is useful for engaging direct dialogs" while the connection is alive. It is also especially useful for communicating with firewall/NAT-protected nodes.
     * 
     * @return
     *     possible object is
     *     {@link OmiEnvelope }
     *     
     */
    public OmiEnvelope getOmiEnvelope() {
        return omiEnvelope;
    }

    /**
     * Sets the value of the omiEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link OmiEnvelope }
     *     
     */
    public void setOmiEnvelope(OmiEnvelope value) {
        this.omiEnvelope = value;
    }

    /**
     * Gets the value of the msgformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgformat() {
        return msgformat;
    }

    /**
     * Sets the value of the msgformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgformat(String value) {
        this.msgformat = value;
    }

    /**
     * Gets the value of the targetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetType() {
        if (targetType == null) {
            return "node";
        } else {
            return targetType;
        }
    }

    /**
     * Sets the value of the targetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetType(String value) {
        this.targetType = value;
    }

}
