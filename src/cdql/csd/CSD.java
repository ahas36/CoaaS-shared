/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.csd;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali
 */
public class CSD {
    @SerializedName("@context")
    private List<String> context;
    
    private long CSD_ID;
    
    private ContextServiceModel csm;
    
    private ContextServiceGrounding csg;
    
    private ContextServiceProfile csp;

    public CSD(long CSD_ID, ContextServiceModel csm, ContextServiceGrounding csg) {
        this.CSD_ID = CSD_ID;
        this.csm = csm;
        this.csg = csg;
    }

    public CSD() {
        context=new ArrayList<>();
    }

    public long getCSD_ID() {
        return CSD_ID;
    }

    public void setCSD_ID(long CSD_ID) {
        this.CSD_ID = CSD_ID;
    }

    public ContextServiceModel getCsm() {
        return csm;
    }

    public void setCsm(ContextServiceModel csm) {
        this.csm = csm;
    }

    public ContextServiceGrounding getCsg() {
        return csg;
    }

    public void setCsg(ContextServiceGrounding csg) {
        this.csg = csg;
    }

    public List<String> getContext() {
        return context;
    }

    public void setContext(List<String> context) {
        this.context = context;
    }

    public ContextServiceProfile getCsp() {
        return csp;
    }

    public void setCsp(ContextServiceProfile csp) {
        this.csp = csp;
    }
    
    
}
