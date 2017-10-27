/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.dataManagement;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class CSVReader {

    private final static String DEFAULT_DIRECTORY_PATH = "data/";

    private List<Activity> listOfActivities;
    private List<Project> listOfProjects;
    private List<Staff> listOfStaff;
    private List<ProjectManager> listOfProjectManagers;
    private List<BusinessUnit> listOfBU;

    public CSVReader() {
        this.listOfActivities = new ArrayList();
        this.listOfProjects = new ArrayList();
        this.listOfStaff = new ArrayList();
        this.listOfProjectManagers = new ArrayList();
        this.listOfBU = new ArrayList();
    }

    public List<Activity> getListOfActivities() {
        return listOfActivities;
    }

    public List<Project> getListOfProjects() {
        return listOfProjects;
    }

    public List<Staff> getListOfStaff() {
        return listOfStaff;
    }

    public List<ProjectManager> getListOfProjectManagers() {
        return listOfProjectManagers;
    }

    public List<BusinessUnit> getListOfBU() {
        return listOfBU;
    }

    public void readFile() throws IOException {
        try {
            this.createListOfActivity();
            this.createListOfStaff();
            this.createListOfBU();
            this.createListOfProjects();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("fuck off");
        }
    }

    /**
     * Operation allowing to fill the list of activities using a .csv file with
     * the different activities
     *
     * @param filepath the path to the .csv file
     * @throws FileNotFoundException when the file is not found at the given
     * path
     */
    private void createListOfActivity() throws FileNotFoundException, IOException {
        String actCode;
        String actDesc;
        String actName;
        String activityFilePath = getClass().getResource(DEFAULT_DIRECTORY_PATH + "activity.csv").getPath();
        System.out.println(activityFilePath);
        try {
            try (BufferedReader inputStream = new BufferedReader(new FileReader(activityFilePath))) {
                String s;
                inputStream.readLine();
                while ((s = inputStream.readLine()) != null) {
                    String[] line = s.split(";");

                    actCode = line[0];
                    actDesc = line[1];
                    actName = line[2];
                    this.listOfActivities.add(new Activity(actCode, actDesc, actName));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found !");
        }
    }

    /**
     * Operation allowing to fill the list of project using a .csv file with the
     * different projects
     *
     * @param filepath the path to the .csv file
     * @throws FileNotFoundException when the file is not found at the given
     * path
     */
    private void createListOfProjects() throws FileNotFoundException, ParseException, IOException {
        String projCode;
        String projDesc;
        String projName;
        String projObj;
        int projLong;
        String managerCode;
        Date projStarting = null;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        String projectsFilePath = getClass().getResource(DEFAULT_DIRECTORY_PATH + "projects.csv").getPath();

        try {
            try (BufferedReader inputStream = new BufferedReader(new FileReader(projectsFilePath))) {
                String s;
                inputStream.readLine();
                while ((s = inputStream.readLine()) != null) {
                    String[] line = s.split(";");

                    projCode = line[0];
                    projDesc = line[1];
                    projName = line[2];
                    projObj = line[3];
                    try {
                        projStarting = format.parse(line[4]);
                    } catch (ParseException ex) {
                        Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    projLong = Integer.valueOf(line[5]);
                    managerCode = line[6];
                    listOfProjects.add(new Project(projCode, projDesc, projName, projObj, projStarting, projLong, getProjectManager(managerCode)));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found !");
        }
    }

    private ProjectManager getProjectManager(String managerCode) {
        ProjectManager tempPM = null;
        for (int i = 0; i < this.listOfProjectManagers.size(); i++) {
            if (this.listOfProjectManagers.get(i).getStaffCode().equals(managerCode)) {
                tempPM = this.listOfProjectManagers.get(i);
            }
        }
        return tempPM;
    }

    /**
     * Operation allowing to fill the list of Staff using a .csv file with the
     * different Staff
     *
     * @param filepath the path to the .csv file
     * @throws FileNotFoundException when the file is not found at the given
     * path
     */

    private void createListOfStaff() throws FileNotFoundException, IOException {
        String staffCode;
        String sMFirstName;
        String sMLastName;
        String isProjectManager;
        String staffFilePath = getClass().getResource(DEFAULT_DIRECTORY_PATH + "staff.csv").getPath();
        try {
            try (BufferedReader inputStream = new BufferedReader(new FileReader(staffFilePath))) {
                String s;
                inputStream.readLine();
                while ((s = inputStream.readLine()) != null) {
                    String[] line = s.split(";");

                    staffCode = line[0];
                    sMFirstName = line[1];
                    sMLastName = line[2];
                    isProjectManager = line[3];
                    System.out.println(staffCode);
                    System.out.println(sMFirstName);
                    System.out.println(sMLastName);
                    System.out.println(isProjectManager);
                    if (isProjectManager.equals("True")) {
                        this.listOfProjectManagers.add(new ProjectManager(staffCode, sMFirstName, sMLastName));
                        System.out.println("new Proj man");
                    } else {

                        this.listOfStaff.add(new ProjectManager(staffCode, sMFirstName, sMLastName));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found !");
        }

    }

    /**
     * Operation allowing to get the index of a project using the project's code
     *
     * @param projCode the project's code
     * @return the index of the project in the list of projects
     * @throws Exception when the projcode is not associated to any project
     */
    private int getProjectIndex(String projCode) throws Exception {
        int i = 0;
        boolean found = false;
        while ((i < this.listOfProjects.size()) && (!found)) {
            if (this.listOfProjects.get(i).getProjCode() == projCode) {
                found = true;
            }
            i++;
        }
        if (found) {
            return i - 1;
        } else {
            throw new Exception("The project does not exist");
        }
    }

    /**
     * Operation allowing to know if a Business Unit exists in the list of
     * Business Units
     *
     * @param unitCode the code of searched the Business Unit
     * @return a true if the Business Unit was found and false otherways
     */
    private void createListOfBU() throws FileNotFoundException, IOException {
        String unitCode;
        String unitName;
        String BUFilePath = getClass().getResource(DEFAULT_DIRECTORY_PATH + "businessunits.csv").getPath();
        try {
            try (BufferedReader inputStream = new BufferedReader(new FileReader(BUFilePath))) {
                String s;
                inputStream.readLine();
                while ((s = inputStream.readLine()) != null) {
                    String[] line = s.split(";");

                    unitCode = line[0];
                    unitName = line[1];

                    listOfBU.add(new BusinessUnit(unitCode, unitName));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found !");
        }
        System.out.println("job's done");
    }
}
