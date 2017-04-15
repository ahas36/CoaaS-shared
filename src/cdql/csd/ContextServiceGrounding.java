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
public class ContextServiceGrounding {

    private AccessType accessType;

    private AccsessMethod accessMetohd;

    public ContextServiceGrounding(AccessType accessType) {
        this.accessType = accessType;
        switch (accessType) {
            case GCM:
                break;
            case HTTP_GET:
                accessMetohd = new RestAccessMethod(RestAccessType.GET, "");
                break;
            case HTTP_POST:
                accessMetohd = new RestAccessMethod(RestAccessType.POST, "");
                break;
        }
    }

    public ContextServiceGrounding() {
    }
    
    
    
    public ContextServiceGrounding(AccessType accessType, AccsessMethod accessMetohd) {
        this.accessType = accessType;
        this.accessMetohd = accessMetohd;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }

    public AccsessMethod getAccessMetohd() {
        return accessMetohd;
    }

    public void setAccessMetohd(AccsessMethod accessMetohd) {
        this.accessMetohd = accessMetohd;
    }

}
