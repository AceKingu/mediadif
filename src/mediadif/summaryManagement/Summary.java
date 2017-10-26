/*
 * 
 *  Le code est libre de droit et est destiné aux collègues de M2-IPM
 * 
 */
package mediadif.summaryManagement;

import java.util.ArrayList;
import java.util.List;
import mediadif.WRITAManagement.Intervention;
import static mediadif.WRITAManagement.Intervention.INTER_STATE_VALIDATED;

/**
 *
 * @author antnhu
 */
public class Summary {

    //Summary state
    private final static int SUM_STATE_CREATED = 1;
    private final static int SUM_STATE_VALIDATED = 2;

    private String sumCode;
    private int sumState;
    private List<Intervention> interventions;

    public Summary(String sumCode) {
        this.sumCode = sumCode;
        this.sumState = SUM_STATE_CREATED;
        interventions = new ArrayList();
    }

    public void incrementState() throws Exception {
        switch (this.getSumState()) {
            case SUM_STATE_CREATED:
                if (areInterventionsValidated()) {
                    this.sumState++;
                }
                break;
            case SUM_STATE_VALIDATED:
                throw new Exception("Error: Summary " + this.sumCode + " has already been validated.");
            default:
                break;

        }
    }

    public boolean areInterventionsValidated() {
        boolean allInterventionsValidated = true;
        for (int i = 0; i < this.getInterventions().size(); i++) {
            if (!isInterventionValidated(this.getInterventions().get(i))) {
                allInterventionsValidated = false;
            }
        }
        return allInterventionsValidated;
    }

    public boolean isInterventionValidated(Intervention inter) {
        return inter.getInterState() == INTER_STATE_VALIDATED;
    }

    public void addIntervention(Intervention intervention) throws Exception {
        if (this.getSumState() != SUM_STATE_VALIDATED) {
            this.getInterventions().add(intervention);
        } else {
            throw new Exception("Summary has been validated. Cannot add intervention anymore.");
        }
    }

    public List<Intervention> getInterventions() {
        return interventions;
    }

    public void removeIntervention(Intervention intervention) throws Exception {
        if (this.getSumState() != SUM_STATE_VALIDATED) {
            this.getInterventions().remove(intervention);
        } else {
            throw new Exception("Summary has been validated. Cannot remove interventions anymore.");
        }
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
}
