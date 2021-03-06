
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public Customer(String fname, String lname, String ssNumber)
    {
        this.fname = fname;
        this.lname = lname;
        
        testSSN(ssNumber);
    }
    
    public void testSSN(String ssNumber) 
    {
        this.ssNumber = ssNumber;
        // pattern - [0-9]{3}-[0-9]{2}-[0-9]{4}
        final String regex = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        final String string = ssNumber;

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find())
        {
            this.ssNumber = ssNumber;            
            //System.out.println("Social Security number is ok"); // debugging code
        }
        else
        {
            this.ssNumber = "Invalid_SSN";
            System.out.println("Successfully created account for " + fname + " " + lname + ". Invalid SSN!");

            
        }
    }

    
    
}
