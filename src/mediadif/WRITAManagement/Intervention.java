/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.WRITAManagement;

import mediadif.dataManagement.Activity;
import mediadif.dataManagement.Project;
import mediadif.dataManagement.Staff;

/**
 *
 * @author Sergio
 */
public class Intervention {
    
    private String interCode;
    private float interWeekHour;
    private String interComment;
    private Integer interYear;
    private Integer interWeek;
    private String interState;
    private Project interProj;
    private Activity interAct;
    private Staff interMemb;

    /**Builder of Intervention
     * 
     * @param weekHour the number of hour spent on the intervention
     * @param year the year the intervention was made
     * @param week the week the intervention was made
     * @param state the state of the intervention
     * @param proj the project on which the intervention was made
     * @param act the activity performed during the intervention
     * @param projMemb the project member that performed the intervention
     */
    public Intervention(float weekHour, Integer year, Integer week, String state, Project proj, Activity act, Staff memb) {
        interWeekHour = weekHour;
        interYear = year;
        interWeek = week;
        interState = state;
        interProj = proj;
        interAct = act;
        interMemb = memb;
        interCode = year.toString()+"-"+week.toString()+"-"+proj.getProjCode()+"-"+act.getActCode()+"-"+memb.getStaffCode();
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Getters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////

    /**Operation allowing to get the code of the intervention
     * 
     * @return the intervention's code
     */
    public String getInterCode() {
        return interCode;
    }

    /**Operation allowing to get the number of hours spent on the intervention
     * 
     * @return the number of hours spent on an intervention
     */
    public float getInterWeekHour() {
        return interWeekHour;
    }

    /**Operation allowing to get the comment made on the intervention
     * 
     * @return the comment made on the intervention
     */
    public String getInterComment() {
        if(interComment.isEmpty()) {
            return "No comment made";
        } else {
            return interComment;
        }
    }

    /**Operation allowing to get the year the intervention was made
     * 
     * @return the year the intervention was made
     */
    public Integer getInterYear() {
        return interYear;
    }

    /**Operation allowing to get the week the intervention was made
     * 
     * @return the week the intervention was made
     */
    public Integer getInterWeek() {
        return interWeek;
    }

    /**Operation allowing to get the state of the intervention
     * 
     * @return the state of the intervention
     */
    public String getInterState() {
        return interState;
    }

    /**Operation allowing to get the project on which the intervention was made
     * 
     * @return the project on which the intervention was made
     */
    public Project getInterProj() {
        return interProj;
    }

    /**Operation allowing to get the activity performed during the intervention
     * 
     * @return the activity performed during the intervention
     */
    public Activity getInterAct() {
        return interAct;
    }

    /**Operation allowing to get the project member that performed the intervention
     * 
     * @return the project member that performed the intervention
     */
    public Staff getInterMemb() {
        return interMemb;
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Setters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * 
     * @param weekHour 
     */
    public void setInterWeekHour(float weekHour) {
        this.interWeekHour = weekHour;
    }

    /**
     * 
     * @param comment 
     */
    public void setInterComment(String comment) {
        this.interComment = comment;
    }

    /**
     * 
     * @param state 
     */
    public void setInterState(String state) {
        interState = state;
    }
    
    
}
