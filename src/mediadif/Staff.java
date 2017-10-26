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
public class Staff {
    
    private String StaffCode;
    private String SMFirstName;
    private String SMLastName;

    /**Operation allowing to get the staff's code
     * 
     * @return the staff's code
     */
    public String getStaffCode() {
        return StaffCode;
    }

    /**Operation allowing to get the staff's first name
     * 
     * @return the staff's first name
     */
    public String getSMFirstName() {
        return SMFirstName;
    }

    /**Operation allowing to get the staff's last name
     * 
     * @return the staff's last name
     */
    public String getSMLastName() {
        return SMLastName;
    }
}
