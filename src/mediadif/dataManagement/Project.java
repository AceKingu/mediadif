/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.dataManagement;

import java.util.Date;

/**
 *
 * @author Sergio
 */
public class Project {
    
    private String projCode;
    private String projdesc;
    private String projName;
    private String projObj;
    private Date projStarting;
    private Integer projLong;

    /**Operation allowing to get the code of a project
     * 
     * @return the project's code
     */
    public String getProjCode() {
        return projCode;
    }

    /**Operation allowing to get the description of a project
     * 
     * @return the project's description
     */
    public String getProjdesc() {
        return projdesc;
    }

    /**Operation allowing to get the name of a project
     * 
     * @return the project's name
     */
    public String getProjName() {
        return projName;
    }

    /**Operation allowing to get the objective of a project
     * 
     * @return the project's objective
     */
    public String getProjObj() {
        return projObj;
    }

    /**Operation allowing to get the starting date of a project
     * 
     * @return the project's starting date
     */
    public Date getProjStarting() {
        return projStarting;
    }

    /**Operation allowing to get the duration of a project
     * 
     * @return the project's duration
     */
    public Integer getProjLong() {
        return projLong;
    }
}
