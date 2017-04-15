package cdql.omi;

import cdql.odf.ObjectsType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestBaseType", propOrder = {
    "nodeList",
    "requestID",
    "callback",
    "msg"
})
@XmlSeeAlso({
    ReadRequest.class,
    WriteRequest.class
})
public class RequestBaseType {

    protected NodesType nodeList;
    protected List<IdType> requestID;
    protected ObjectsType msg;
    @XmlElement(name = "callback")
    protected CallbackBase callback;
    @XmlAttribute(name = "msgformat")
    protected String msgformat;
    @XmlAttribute(name = "targetType")
    protected String targetType;

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

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public ObjectsType getMsg() {
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
    public void setMsg(ObjectsType value) {
        this.msg = value;
    }

    /**
     * Gets the value of the callback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public CallbackBase getCallback() {
        return callback;
    }

    /**
     * Sets the value of the callback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallback(CallbackBase value) {
        this.callback = value;
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
