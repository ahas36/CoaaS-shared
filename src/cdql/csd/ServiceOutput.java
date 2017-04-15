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
public class ServiceOutput {

    private List<IOArgument> outputs;

    public ServiceOutput() {
        outputs=new ArrayList<>();
    }

    public ServiceOutput(List<IOArgument> outputs) {
        this.outputs = outputs;
    }

    public List<IOArgument> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<IOArgument> outputs) {
        this.outputs = outputs;
    }

}
