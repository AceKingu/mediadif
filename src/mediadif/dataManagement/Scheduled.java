/*
 * 
 *  Le code est libre de droit et est destiné aux collègues de M2-IPM
 * 
 */
package mediadif.dataManagement;

/**
 *
 * @author antnhu
 */
public class Scheduled {
    private int scheduledHours;
    private Staff member;
    private Activity activity;

    public Scheduled(int scheduledHours, Staff member, Activity activity) {
        this.scheduledHours = scheduledHours;
        this.member = member;
        this.activity = activity;
    }

    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Getters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////
    public int getScheduledHours() {
        return scheduledHours;
    }

    public Staff getMember() {
        return member;
    }

    public Activity getActivity() {
        return activity;
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Setters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////
    public void setScheduledHours(int scheduledHours) {
        this.scheduledHours = scheduledHours;
    }

    public void setMember(Staff member) {
        this.member = member;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Scheduled{" + "scheduledHours=" + scheduledHours + ", member=" + member + ", activity=" + activity + '}';
    }
    
    
}
