/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.omi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author ali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callback",propOrder = "uri")
public class RestCallBack extends CallbackBase{
    @XmlElement(name= "uri")
    @XmlSchemaType(name = "anyURI")
    private String uri;
    public RestCallBack (String uri)
    {
        this.uri=uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
    
    
}
