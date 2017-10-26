/*
 * 
 *  Le code est libre de droit et est destiné aux collègues de M2-IPM
 * 
 */
package mediadif.WRITAManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antnhu
 */
public class WRITA {
    private String codeWRITA;
    private int stateWRITA;
    private List<Intervention> listIntervention;

    public WRITA(int state) {
        this.stateWRITA = state;
        this.listIntervention = new ArrayList<Intervention>();
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
