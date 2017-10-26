/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.WRITAManagement;

import java.util.ArrayList;
import java.util.List;
import static mediadif.WRITAManagement.Intervention.INTER_STATE_SENT;
import static mediadif.WRITAManagement.Intervention.INTER_STATE_VALIDATED;

/**
 *
 * @author Sergio
 */
public class WRITA {

    public final static int WRITA_STATE_CREATED = 1;
    public final static int WRITA_STATE_SENT = 2;
    public final static int WRITA_STATE_EXPL_WAITING = 3;

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
    //                                    Others                                   //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////
    public void addIntervention(Intervention inter) {
        listIntervention.add(inter);
    }

    public void removeIntervention(Intervention inter) {
        listIntervention.remove(inter);
    }

    public boolean areInterventionsValidated() {
        boolean allInterventionsValidated = true;
        for (int i = 0; i < this.getListIntervention().size(); i++) {
            if (!isInterventionValidated(this.getListIntervention().get(i))) {
                allInterventionsValidated = false;
            }
        }
        return allInterventionsValidated;
    }

    public boolean isInterventionValidated(Intervention inter) {
        return inter.getInterState() == INTER_STATE_VALIDATED;
    }

    public void sendWRITA() throws Exception {
        if (areInterventionsValidated()) {
            this.setStateWRITA(WRITA_STATE_SENT);
        } else {
            throw new Exception("Error : All interventions must be validated before sending a WRITA");
        }
    }
}
