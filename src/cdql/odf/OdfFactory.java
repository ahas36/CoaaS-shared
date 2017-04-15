package cdql.odf;

import cdql.odf.entities.OdfInfoItem;
import cdql.odf.entities.OdfMetaData;
import cdql.odf.entities.OdfObject;
import cdql.odf.entities.OdfObjects;
import cdql.odf.entities.OdfValue;
import java.sql.Timestamp;
import java.util.Collection;
import javax.persistence.criteria.Path;

/**
 * Factory class for creating O-DF types used in Scala.
 */
public class OdfFactory {

    /**
     *
     * @param value Value inside of O-DF value element.
     * @param typeValue Type of value, one of built in XML Schema data types
     * specifed in
     * <a href="https://www.w3.org/TR/xmlschema-2/#built-in-datatypes">XML
     * Schema types</a>
     * Parameter value is cast to type specifed by typeValue parameter. If cast
     * fails, value's type will be String.
     * @param timestamp Timestamp when value was measured or received.
     */
    public static OdfValue<String> createOdfValue(
            String value,
            String typeValue,
            Timestamp timestamp
    ) {
        OdfValue<String> odfValue = new OdfValue<>();
        odfValue.setDatavalue(value);
        odfValue.setDatetime(timestamp);
        odfValue.setType(typeValue);
        return odfValue;

    }

    /**
     *
     * @param value Value inside of O-DF value element.
     * @param timestamp Timestamp when value was measured or received.
     */
    public static OdfValue<Object> createOdfValue(
            Object value,
            Timestamp timestamp
    ) {
        OdfValue<Object> odfValue = new OdfValue<>();
        odfValue.setDatavalue(value);
        odfValue.setDatetime(timestamp);
        return odfValue;
    }

    /**
     *
     * @param path Path of O-DF InfoItem.
     * @param values Values stored in InfoItew.
     * @param description Description of InfoItem.
     * @param metaData
     * @return 
     */
    public static OdfInfoItem createOdfInfoItem(
            Path path,
            Collection<OdfValue<Object>> values,
            String description,
            OdfMetaData metaData
    ) {
        OdfInfoItem infoItem=new OdfInfoItem();
        infoItem.setDescription(description);
        infoItem.setValues(values);
        infoItem.setParentMetaData(metaData);
        
        return infoItem;
    }

    /**
     *
     * @param path Path of O-DF InfoItem.
     * @param values Values stored in InfoItew.
     * @param description Description of InfoItem.
     */
    public static OdfInfoItem createOdfInfoItem(
            Path path,
            Collection<OdfValue<Object>> values,
            String description
    ) {
        OdfInfoItem infoItem=new OdfInfoItem();
        infoItem.setDescription(description);
        infoItem.setValues(values);
        
        return infoItem;
    }

    /**
     *
     * @param path Path of O-DF InfoItem.
     * @param values Values stored in InfoItew.
     */
    public static OdfInfoItem createOdfInfoItem(
            Path path,
            Collection<OdfValue<Object>> values
    ) {
        OdfInfoItem infoItem=new OdfInfoItem();
        infoItem.setValues(values);
        
        return infoItem;
    }

    /**
     *
     * @param path Path of O-DF InfoItem.
     * @param values Values stored in InfoItew.
     */
    public static OdfInfoItem createOdfInfoItem(
            Path path,
            Collection<OdfValue<Object>> values,
            OdfMetaData metaData
    ) {
        OdfInfoItem infoItem=new OdfInfoItem();
        infoItem.setValues(values);
        infoItem.setParentMetaData(metaData);
        return infoItem;
    }

    /**
     *
     * @param path Path of O-DF Object.
     * @param infoitems Child O-DF InfoItems of created O-DF Object.
     * @param objects Child O-DF Objects of created O-DF Object.
     * @param description Description of O-DF Object.
     * @param typeValue
     */
    public static OdfObject createOdfObject(
            QlmID id,
            Collection<OdfInfoItem> infoitems,
            Collection<OdfObject> objects,
            String description,
            String typeValue
    ) {
        
        OdfObject obj= new OdfObject();
        obj.setId(id.toString());
        obj.setInfoItems(infoitems);
        obj.setObjects(objects);
                       
        return obj;
    }

   
    public static OdfObjects createOdfObjects(
            Collection<OdfObject> objects,
            String version
    ) {
        OdfObjects odfObjects=new OdfObjects();
        odfObjects.setObjects(objects);
        return odfObjects;
    }

    

    public static OdfMetaData createOdfMetaData(
            Collection<OdfInfoItem> infoItems
    ) {
        OdfMetaData metaData=new OdfMetaData();
        metaData.setInfoItems(infoItems);
        return metaData;
    }

}
