/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.dataManagement;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class ProjectManager extends Staff{

    private ArrayList<Project> projects;
    
    public ProjectManager(String code, String firstName, String lastName) {
        super(code, firstName, lastName);
        projects = new ArrayList();
    }
    
    
}
