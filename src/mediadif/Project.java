/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif;

import java.util.Date;

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

    /**Operation allowing to get the code of a project
     * 
     * @return the project's code
     */
    public String getProjCode() {
        return ProjCode;
    }

    /**Operation allowing to get the description of a project
     * 
     * @return the project's description
     */
    public String getProjdesc() {
        return Projdesc;
    }

    /**Operation allowing to get the name of a project
     * 
     * @return the project's name
     */
    public String getProjName() {
        return ProjName;
    }

    /**Operation allowing to get the objective of a project
     * 
     * @return the project's objective
     */
    public String getProjObj() {
        return ProjObj;
    }

    /**Operation allowing to get the starting date of a project
     * 
     * @return the project's starting date
     */
    public Date getProjStarting() {
        return ProjStarting;
    }

    /**Operation allowing to get the duration of a project
     * 
     * @return the project's duration
     */
    public Integer getProjLong() {
        return ProjLong;
    }
}
