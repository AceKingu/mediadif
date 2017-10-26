/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.dataManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Sergio
 */
public class Project {

    private String ProjCode;
    private String Projdesc;
    private String ProjName;
    private String ProjObj;
    private Date ProjStarting;
    private Integer ProjLong;
    private HashMap<Activity, Expected> expectedHours;
    private ArrayList<Scheduled> scheduledHours;

    public Project(String ProjCode, String Projdesc, String ProjName, String ProjObj, Date ProjStarting, Integer ProjLong, HashMap<Activity, Expected> expectedHours, ArrayList<Scheduled> scheduledHours) {
        this.ProjCode = ProjCode;
        this.Projdesc = Projdesc;
        this.ProjName = ProjName;
        this.ProjObj = ProjObj;
        this.ProjStarting = ProjStarting;
        this.ProjLong = ProjLong;
        this.expectedHours = expectedHours;
        this.scheduledHours = scheduledHours;
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Getters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////
    /**
     * Operation allowing to get the code of a project
     *
     * @return the project's code
     */
    public String getProjCode() {
        return ProjCode;
    }

    /**
     * Operation allowing to get the description of a project
     *
     * @return the project's description
     */
    public String getProjdesc() {
        return Projdesc;
    }

    /**
     * Operation allowing to get the name of a project
     *
     * @return the project's name
     */
    public String getProjName() {
        return ProjName;
    }

    /**
     * Operation allowing to get the objective of a project
     *
     * @return the project's objective
     */
    public String getProjObj() {
        return ProjObj;
    }

    /**
     * Operation allowing to get the starting date of a project
     *
     * @return the project's starting date
     */
    public Date getProjStarting() {
        return ProjStarting;
    }

    /**
     * Operation allowing to get the duration of a project
     *
     * @return the project's duration
     */
    public Integer getProjLong() {
        return ProjLong;
    }

    /**
     * Operation allowing to get the expected hours of an activity for the
     * current project.
     *
     * @return the project's duration
     */
    public HashMap<Activity, Expected> getScheduledHours() {
        return expectedHours;
    }

}
