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
