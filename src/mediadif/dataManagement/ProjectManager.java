/*
 * 
 *  Le code est libre de droit et est destiné aux collègues de M2-IPM
 * 
 */
package mediadif.dataManagement;

import java.util.ArrayList;

/**
 *
 * @author antnhu
 */
public class ProjectManager extends Staff{
    private ArrayList<Project> projects;

    public ProjectManager(String code, String firstName, String lastName) {
        super(code, firstName, lastName);
        projects = new ArrayList();
    }
    
    
}
