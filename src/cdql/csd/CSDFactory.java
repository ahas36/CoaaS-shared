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
public class CSDFactory {

    public static CSD createCSD() {
        return new CSD();
    }

    public static ContextServiceModel createContextServiceModel() {
        return new ContextServiceModel();
    }

    public static ServiceInput createContextServiceInput() {
        return new ServiceInput();
    }

    public static ServiceOutput createContextServiceOutput() {
        return new ServiceOutput();
    }

    public static IOArgument createIOArgument(String name, String type) {
        return new IOArgument(name, type);
    }

    public static ContextServiceGrounding createContextServiceGrounding() {
        return new ContextServiceGrounding();
    }

    public static AccsessMethod createAccessMethod(AccessType accessType) {
        switch (accessType) {
            case GCM:
                break;
            case HTTP_GET:
                return new RestAccessMethod(RestAccessType.GET, "");
            case HTTP_POST:
                return new RestAccessMethod(RestAccessType.POST, "");
        }
        return null;
    }

    public static ContextServiceProfile createContextServiceProfile() {
        return new ContextServiceProfile();
    }
    
    public static ServiceCost createServiceCost(String currency, double price)
    {
        return new ServiceCost(currency, price);
    }

}
