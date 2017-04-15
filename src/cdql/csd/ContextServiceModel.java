/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.csd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali
 */
public class ContextServiceModel {
    
    private List<String> supportedVocabs;
    
    private ServiceInput serviceInput;
    
    private ServiceOutput serviceOutput;

    public ContextServiceModel(List<String> supportedVocabs, ServiceInput serviceInput, ServiceOutput serviceOutput) {
        this.supportedVocabs = supportedVocabs;
        this.serviceInput = serviceInput;
        this.serviceOutput = serviceOutput;
    }

    public ContextServiceModel() {
        this(new ArrayList<>(),new ServiceInput(), new ServiceOutput());
    }

    public List<String> getSupportedVocabs() {
        return supportedVocabs;
    }

    public void setSupportedVocabs(List<String> supportedVocabs) {
        this.supportedVocabs = supportedVocabs;
    }

    public ServiceInput getServiceInput() {
        return serviceInput;
    }

    public void setServiceInput(ServiceInput serviceInput) {
        this.serviceInput = serviceInput;
    }

    public ServiceOutput getServiceOutput() {
        return serviceOutput;
    }

    public void setServiceOutput(ServiceOutput serviceOutput) {
        this.serviceOutput = serviceOutput;
    }
    
    
}
