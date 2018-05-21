/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 *  exception when an invalid Social Security Number is passed 
 *      to the Customer constructor
 */
public class InvalidCustomerException extends Exception {
    // define attributes
    String ssNumber;
    String fname;
    String lname;
    //constructor
   
    InvalidCustomerException (String ssNumber, String fname, String lname)
    {
        super();
        // this.attributes - 
        this.ssNumber = ssNumber;
        this.fname = fname;
        this.lname = lname;
    }
    
    @Override
    public String getMessage()
    {
        return "Invalid Social Security Number: " + ssNumber + " for " + fname + " " + lname + ".";
    }
}