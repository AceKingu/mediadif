/*
 * 
 *  Le code est libre de droit et est destiné aux collègues de M2-IPM
 * 
 */
package mediadif.summaryManagement;

import java.util.ArrayList;
import mediadif.WRITAManagement.Intervention;

/**
 *
 * @author antnhu
 */
public class Summary {
    //Summary state
    private final static int SUM_STATE_CREATED = 1;
    private final static int SUM_STATE_PENDING = 2;
    private final static int SUM_STATE_VALIDATED = 3;
    
    private String sumCode;
    private int sumState;
    private ArrayList<Intervention> interventions;

    public Summary(String sumCode) {
        this.sumCode = sumCode;
        this.sumState = SUM_STATE_CREATED;
    }
    
    public void incrementState(){
        //Si MACHIN EN ETAT = 1
        //ALORS VERIFIER CONDITIONS POUR PASSER ETAT2
            //SI CONDITIONS VERIFIEES
            //ALORS MACHIN.SUMSTATE
    }
    
    public String getSumCode() {
        return sumCode;
    }

    public int getSumState() {
        return sumState;
    }

    public void setSumCode(String sumCode) {
        this.sumCode = sumCode;
    }

    private void incSumState(int sumState) {
        this.sumState++;
    }
    
    
}
