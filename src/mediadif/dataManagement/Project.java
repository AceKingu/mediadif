/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.dataManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sergio
 */
public class Project {

    private final String projCode;
    private final String projdesc;
    private final String projName;
    private final String projObj;
    private final Date projStarting;
    private final Integer projLong;
    private final ProjectManager projManager;
    private Map<Activity, Expected> expectedHours;
    private ArrayList<Scheduled> scheduledHours;

    public Project(String ProjCode, String Projdesc, String ProjName, String ProjObj, Date ProjStarting, Integer ProjLong, ProjectManager ProjMan) {
        this.projCode = ProjCode;
        this.projdesc = Projdesc;
        this.projName = ProjName;
        this.projObj = ProjObj;
        this.projStarting = ProjStarting;
        this.projLong = ProjLong;
        this.projManager = ProjMan;
        this.expectedHours = new HashMap();
        this.scheduledHours = new ArrayList();
    }

    public Project(String ProjCode, String Projdesc, String ProjName, String ProjObj, Date ProjStarting, Integer ProjLong, ProjectManager ProjMan, HashMap<Activity, Expected> expectedHours, ArrayList<Scheduled> scheduledHours) {
        this(ProjCode, Projdesc, ProjName, ProjObj, ProjStarting, ProjLong, ProjMan);
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
        return projCode;
    }

    /**
     * Operation allowing to get the description of a project
     *
     * @return the project's description
     */
    public String getProjdesc() {
        return projdesc;
    }

    /**
     * Operation allowing to get the name of a project
     *
     * @return the project's name
     */
    public String getProjName() {
        return projName;
    }

    /**
     * Operation allowing to get the objective of a project
     *
     * @return the project's objective
     */
    public String getProjObj() {
        return projObj;
    }

    /**
     * Operation allowing to get the starting date of a project
     *
     * @return the project's starting date
     */
    public Date getProjStarting() {
        return projStarting;
    }

    /**
     * Operation allowing to get the duration of a project
     *
     * @return the project's duration
     */
    public Integer getProjLong() {
        return projLong;
    }

    /**
     * Operation allowing to get the expected hours of an activity for the
     * current project.
     *
     * @return the project's duration
     */
    public Map<Activity, Expected> getExpectedHours() {
        return expectedHours;
    }
}
