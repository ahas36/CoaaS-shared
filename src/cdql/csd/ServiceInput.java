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
public class ServiceInput {

    private List<IOArgument> mandatoryInputs;
    private List<IOArgument> optionalInputs;

    public ServiceInput() {
        mandatoryInputs = new ArrayList<>();
        optionalInputs = new ArrayList<>();

    }

    public ServiceInput(List<IOArgument> mandatoryInputs, List<IOArgument> optionalInputs) {
        this.mandatoryInputs = mandatoryInputs;
        this.optionalInputs = optionalInputs;
    }

    public List<IOArgument> getMandatoryInputs() {
        return mandatoryInputs;
    }

    public void setMandatoryInputs(List<IOArgument> mandatoryInputs) {
        this.mandatoryInputs = mandatoryInputs;
    }

    public List<IOArgument> getOptionalInputs() {
        return optionalInputs;
    }

    public void setOptionalInputs(List<IOArgument> optionalInputs) {
        this.optionalInputs = optionalInputs;
    }

}
