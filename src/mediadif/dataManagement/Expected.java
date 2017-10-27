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
public final class Expected {

    private int expectedHours;
    private Project project;
    private Activity activity;

    /**
     * Builder
     * @param expectedHours
     * @param project
     * @param activity
     * @param member 
     */
    public Expected(int expectedHours, Project project, Activity activity) {
        this.setExpectedHours(expectedHours);
        this.setProject(project);
        this.setActivity(activity);
    }

    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Getters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////
    public final int getExpectedHours() {
        return expectedHours;
    }

    public Project getProject() {
        return project;
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
    private void setExpectedHours(int expectedHours) {
        this.expectedHours = expectedHours;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

}
