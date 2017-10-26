/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif.dataManagement;

/**
 *
 * @author Sergio
 */
public class Activity {
    
    private String actCode;
    private String actDesc;
    private String actName;

    /**Operation allowing to get the code of an activity
     * 
     * @return the activity's code
     */
    public String getActCode() {
        return actCode;
    }

    /**Operation allowing to get the description of an activity
     * 
     * @return the activity's description
     */
    public String getActDesc() {
        return actDesc;
    }

    /**Operation allowing to get the name of an activity
     * 
     * @return the activity's name
     */
    public String getActName() {
        return actName;
    }  
}
