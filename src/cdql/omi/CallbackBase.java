/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.omi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author ali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callbackbase")
@XmlSeeAlso({
    RestCallBack.class
})
public class CallbackBase {
    @XmlAttribute(name = "format")
    private CallbackType callBackType;

    public CallbackBase() {
    }

    public CallbackBase(CallbackType callBackType) {
        this.callBackType = callBackType;
    }

    public CallbackType getCallBackType() {
        return callBackType;
    }

    public void setCallBackType(CallbackType callBackType) {
        this.callBackType = callBackType;
    }
    
}
