/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.csd;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author ali
 */
public class IOArgument {

    private String ioName;
    
    @SerializedName("@type")
    private String ioType;

    public IOArgument() {
    }

    public IOArgument(String inputName, String inputType) {
        this.ioName = inputName;
        this.ioType = inputType;
    }

    public String getInputName() {
        return ioName;
    }

    public void setInputName(String inputName) {
        this.ioName = inputName;
    }

    public String getInputType() {
        return ioType;
    }

    public void setInputType(String inputType) {
        this.ioType = inputType;
    }

}
