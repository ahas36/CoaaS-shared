package cdql.omi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "read",
    "write",
    "response",
    "cancel"
})
@XmlRootElement(name = "omiEnvelope")
public class OmiEnvelope {

    protected ReadRequest read;
    protected WriteRequest write;
    protected ResponseListType response;
    protected CancelRequest cancel;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "ttl", required = true)
    protected double ttl;

    /**
     * Gets the value of the read property.
     * 
     * @return
     *     possible object is
     *     {@link ReadRequest }
     *     
     */
    public ReadRequest getRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadRequest }
     *     
     */
    public void setRead(ReadRequest value) {
        this.read = value;
    }

    /**
     * Gets the value of the write property.
     * 
     * @return
     *     possible object is
     *     {@link WriteRequest }
     *     
     */
    public WriteRequest getWrite() {
        return write;
    }

    /**
     * Sets the value of the write property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteRequest }
     *     
     */
    public void setWrite(WriteRequest value) {
        this.write = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseListType }
     *     
     */
    public ResponseListType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseListType }
     *     
     */
    public void setResponse(ResponseListType value) {
        this.response = value;
    }

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link CancelRequest }
     *     
     */
    public CancelRequest getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRequest }
     *     
     */
    public void setCancel(CancelRequest value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     */
    public double getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     */
    public void setTtl(double value) {
        this.ttl = value;
    }

}
