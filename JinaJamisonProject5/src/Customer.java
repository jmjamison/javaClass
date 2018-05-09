/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */
public class Customer {
    
    /** protected private fields     */
    private String fname;
    private String lname;
    private String ssNumber;
    
    /** constructor     */
    Customer(String fname, String lname, String ssNumber)
    {
        this.fname = fname;
        this.lname = lname;
        this.ssNumber = ssNumber;
    }
        
    public void setFname(String fname)
    {
        this.fname = fname;
    }
    
    public void setLname(String lname)
    {
        this.lname = lname;
        
    }
    
    public void setSSN(String ssNumber) 
    {
        this.ssNumber = ssNumber;
    }
    
    
}
