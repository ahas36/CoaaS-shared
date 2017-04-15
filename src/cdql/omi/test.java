/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.omi;

import cdql.odf.InfoItemType;
import cdql.odf.ObjectType;
import cdql.odf.ObjectsType;
import cdql.odf.QlmID;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author ali
 */
public class test {
    public static void main(String[] args) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            ObjectsType objectsType = new ObjectsType(); 
            ObjectType obj=new ObjectType();
            QlmID qlmID = new QlmID();
            qlmID.setIdType("dbs");
            qlmID.setValue("asd");
            obj.getId().add(qlmID);
            obj.setType("asd");
            InfoItemType infoItemType = new InfoItemType();
            infoItemType.setNameAttribute("test");
            obj.getInfoItem().add(infoItemType);
            objectsType.getObject().add(obj);
            ReadRequest createReadRequest = OmiFactory.createReadRequest(0, objectsType, timestamp, timestamp, 0, 0, "http://www.thoughts-on-java.org/generate-your-jaxb-classes-in-second/");
            OmiEnvelope envelope=new OmiEnvelope();
            envelope.setTtl(0);
            envelope.setVersion("v1");
            envelope.setRead(createReadRequest);
            java.io.StringWriter sw = new StringWriter();
            
            JAXBContext context = JAXBContext.newInstance(OmiEnvelope.class);
            
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML
            marshaller.marshal(envelope, sw);
            System.out.println(sw.toString());
        } catch (JAXBException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
