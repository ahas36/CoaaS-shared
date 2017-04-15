package cdql.odf;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the parsing.xmlGen.odf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Object_QNAME = new QName("odf.xsd", "Object");
    private final static QName _InfoItem_QNAME = new QName("odf.xsd", "InfoItem");
    private final static QName _Value_QNAME = new QName("odf.xsd", "value");
    private final static QName _Objects_QNAME = new QName("odf.xsd", "Objects");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: parsing.xmlGen.odf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InfoItemType }
     * 
     */
    public InfoItemType createInfoItemType() {
        return new InfoItemType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link ValueType }
     * 
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link ObjectsType }
     * 
     */
    public ObjectsType createObjectsType() {
        return new ObjectsType();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link QlmID }
     * 
     */
    public QlmID createQlmID() {
        return new QlmID();
    }

    /**
     * Create an instance of {@link InfoItemType.MetaData }
     * 
     */
    public InfoItemType.MetaData createInfoItemTypeMetaData() {
        return new InfoItemType.MetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "odf.xsd", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "odf.xsd", name = "InfoItem")
    public JAXBElement<InfoItemType> createInfoItem(InfoItemType value) {
        return new JAXBElement<InfoItemType>(_InfoItem_QNAME, InfoItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "odf.xsd", name = "value")
    public JAXBElement<ValueType> createValue(ValueType value) {
        return new JAXBElement<ValueType>(_Value_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "odf.xsd", name = "Objects")
    public JAXBElement<ObjectsType> createObjects(ObjectsType value) {
        return new JAXBElement<ObjectsType>(_Objects_QNAME, ObjectsType.class, null, value);
    }

}
