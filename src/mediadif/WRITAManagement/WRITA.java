/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.WRITAManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergio
 */
public class WRITA {
    
    private String codeWRITA;
    private int stateWRITA;
    private List<Intervention> listIntervention;

    public WRITA(int state) {
        this.stateWRITA = state;
        this.listIntervention = new ArrayList();
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Getters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////

    public String getCodeWRITA() {
        return codeWRITA;
    }

    public int getStateWRITA() {
        return stateWRITA;
    }

    public List<Intervention> getListIntervention() {
        return listIntervention;
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Setters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////

    public void setCodeWRITA(String code) {
        this.codeWRITA = code;
    }

    public void setStateWRITA(int state) {
        this.stateWRITA = state;
    }

    public void setListIntervention(List<Intervention> listInter) {
        this.listIntervention = listInter;
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Others                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////
    
    public void addIntervention(Intervention inter) {
        listIntervention.add(inter);
    }
    
    public void removeIntervention(Intervention inter) {
        listIntervention.remove(inter);
    }
}
