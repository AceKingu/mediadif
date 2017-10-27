/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.dataManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergio
 */
public class BusinessUnit {
    
    private String unitCode;
    private String unitName;
    private List<Project> submittedProject;

    /**Builder of Business Unit
     * 
     * @param code the code of the Business Unit
     * @param name the name of the Business Unit
     */
    public BusinessUnit(String code, String name) {
        this.unitCode = code;
        this.unitName = name;
        this.submittedProject = new ArrayList();
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Getters                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////

    /**Operation allowing to get the code of the Business Unit
     * 
     * @return the Business Unit's code
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**Operation allowing to get the name of the Business Unit
     * 
     * @return the Business Unit's name
     */
    public String getUnitName() {
        return unitName;
    }

    /**Operation allowing to get the list of projects submitted by the Business Unit
     * 
     * @return the list of the Business Unit's submitted projects
     */
    public List<Project> getSubmittedProject() {
        return submittedProject;
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    //                                                                             //
    //                                                                             //
    //                                    Others                                  //
    //                                                                             //
    //                                                                             //
    /////////////////////////////////////////////////////////////////////////////////
    
    /**Operation allowing to add a project to the list of projects submitted by 
     * the Business Unit
     * 
     * @param proj the project to be added
     */
    protected void addProject(Project proj) {
        this.submittedProject.add(proj);
    }
}
