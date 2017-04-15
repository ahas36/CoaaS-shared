/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.message;

/**
 *
 * @author ali
 */
public class CdqlMessage implements ICdqlMessage{

    private CdqlMessageType messageType;
    
    private String token;
    
    private String payload;
    
    public CdqlMessage() {
    }

    public CdqlMessage(CdqlMessageType messageType) {
        this.messageType = messageType;
    }

    public CdqlMessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(CdqlMessageType messageType) {
        this.messageType = messageType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPayload() {
        return payload;
    }
    
    
    
}
