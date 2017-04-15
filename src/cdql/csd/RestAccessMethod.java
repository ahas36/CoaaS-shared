/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.csd;

/**
 *
 * @author ali
 */
public class RestAccessMethod implements AccsessMethod{
    
    private RestAccessType restAccessType;
    
    private String URL;

    public RestAccessMethod(RestAccessType restAccessType, String URL) {
        this.restAccessType = restAccessType;
        this.URL = URL;
    }

    public RestAccessMethod() {
    }

    public RestAccessType getRestAccessType() {
        return restAccessType;
    }

    public void setRestAccessType(RestAccessType restAccessType) {
        this.restAccessType = restAccessType;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    
    
    
}
