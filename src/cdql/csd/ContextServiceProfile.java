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
public class ContextServiceProfile {

    private String serviceName;
    private String serviceType;
    private ServiceCost serviceCost;
    private String targetedEntities;

    public ContextServiceProfile(String serviceName, String serviceType, ServiceCost serviceCost,String targetedEntities) {
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.serviceCost = serviceCost;
        this.targetedEntities=targetedEntities;
    }

    public ContextServiceProfile() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ServiceCost getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(ServiceCost serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getTargetedEntities() {
        return targetedEntities;
    }

    public void setTargetedEntities(String targetedEntities) {
        this.targetedEntities = targetedEntities;
    }

    
}
