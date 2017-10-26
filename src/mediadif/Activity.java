/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadif;

/**
 *
 * @author Sergio
 */
public class Activity {
    
    private String ActCode;
    private String ActDesc;
    private String ActName;

    /**Operation allowing to get the code of an activity
     * 
     * @return the activity's code
     */
    public String getActCode() {
        return ActCode;
    }

    /**Operation allowing to get the description of an activity
     * 
     * @return the activity's description
     */
    public String getActDesc() {
        return ActDesc;
    }

    /**Operation allowing to get the name of an activity
     * 
     * @return the activity's name
     */
    public String getActName() {
        return ActName;
    }  
}
