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
public class Staff {
    
    private String staffCode;
    private String sMFirstName;
    private String sMLastName;

    /**Builder of Staff
     * 
     * @param code the staff's code
     * @param firstName the staff's first name
     * @param lastName the staff's las name
     */
    public Staff(String code, String firstName, String lastName) {
        this.staffCode = code;
        this.sMFirstName = firstName;
        this.sMLastName = lastName;
    }
    
    /**Operation allowing to get the staff's code
     * 
     * @return the staff's code
     */
    public String getStaffCode() {
        return staffCode;
    }

    /**Operation allowing to get the staff's first name
     * 
     * @return the staff's first name
     */
    public String getSMFirstName() {
        return sMFirstName;
    }

    /**Operation allowing to get the staff's last name
     * 
     * @return the staff's last name
     */
    public String getSMLastName() {
        return sMLastName;
    }
}
