/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.dataManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class FileReader {

    private List<Activity> listOfActivities;
    private List<Project> listOfProjects;
    private List<Staff> listOfStaff;
    private List<ProjectManager> listOfProjectManagers;
    private List<BusinessUnit> listOfBU;

    public FileReader() {
        this.listOfActivities = new ArrayList();
        this.listOfProjects = new ArrayList();
        this.listOfStaff = new ArrayList();
        this.listOfBU = new ArrayList();
    }
    
    

    /**
     * Operation allowing to fill the list of activities using a .csv file with
     * the different activities
     *
     * @param filepath the path to the .csv file
     * @throws FileNotFoundException when the file is not found at the given
     * path
     */
    public void createListOfActivity(String filepath) throws FileNotFoundException {
        String actCode;
        String actDesc;
        String actName;

        File thefile = new File(filepath);
        Scanner inputStream = new Scanner(thefile);
        inputStream.useDelimiter(";");
        inputStream.nextLine();
        while (inputStream.hasNext()) {
            actCode = String.valueOf(inputStream.next());
            actDesc = String.valueOf(inputStream.next());
            actName = String.valueOf(inputStream.next());
            listOfActivities.add(new Activity(actCode, actDesc, actName));
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
    private void createListOfProjects(String filepath) throws FileNotFoundException {
        String projCode;
        String projDesc;
        String projName;
        String projObj;
        int projLong;
        String managerCode;
        Date projStarting = null;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        File thefile = new File(filepath);
        Scanner inputStream = new Scanner(thefile);
        inputStream.useDelimiter(";");
        inputStream.nextLine();
        while (inputStream.hasNext()) {
            projCode = String.valueOf(inputStream.next());
            projDesc = String.valueOf(inputStream.next());
            projName = String.valueOf(inputStream.next());
            projObj = String.valueOf(inputStream.next());
            try {
                projStarting = format.parse(String.valueOf(inputStream.next()));
            } catch (ParseException ex) {
                Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            }
            projLong = Integer.valueOf(inputStream.next());
            managerCode = String.valueOf(inputStream.next());
            listOfProjects.add(new Project(projCode, projDesc, projName, projObj, projStarting, projLong, getProjectManager(managerCode)));
        }
    }
    
    public ProjectManager getProjectManager(String managerCode){
        ProjectManager tempPM = null;
        for (int i = 0; i < this.listOfProjectManagers.size(); i++){
            if (this.listOfProjectManagers.get(i).getStaffCode().equals(managerCode)){
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
    public void createListOfStaff(String filepath) throws FileNotFoundException {
        String staffCode;
        String sMFirstName;
        String sMLastName;
        String isProjectManager;

        File thefile = new File(filepath);
        Scanner inputStream = new Scanner(thefile);
        inputStream.useDelimiter(";");
        inputStream.nextLine();
        while (inputStream.hasNext()) {
            staffCode = String.valueOf(inputStream.next());
            sMFirstName = String.valueOf(inputStream.next());
            sMLastName = String.valueOf(inputStream.next());
            if(String.valueOf(inputStream.next()) == "True"){
                this.listOfProjectManagers.add(new ProjectManager(staffCode, sMFirstName, sMLastName));
            } else {
                this.listOfStaff.add(new ProjectManager(staffCode, sMFirstName, sMLastName));
            }
        }
    }

    /**
     * Operation allowing to get the index of a project using the project's code
     *
     * @param projCode the project's code
     * @return the index of the project in the list of projects
     * @throws Exception when the projcode is not associated to any project
     */
    public int getIndexProject(String projCode) throws Exception {
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
    //public boolean searchBU(String unitCode) {
    //}
    public void createListOfBU(String filepath) throws FileNotFoundException {
        String unitCode;
        String unitName;
        String projCode;

        File thefile = new File(filepath);
        Scanner inputStream = new Scanner(thefile);
        inputStream.useDelimiter(";");
        inputStream.nextLine();
        while (inputStream.hasNext()) {
            unitCode = String.valueOf(inputStream.next());
            unitName = String.valueOf(inputStream.next());
            projCode = String.valueOf(inputStream.next());
            //listOfBU.add(new BusinessUnit(unitCode, unitName));
        }
    }
}
