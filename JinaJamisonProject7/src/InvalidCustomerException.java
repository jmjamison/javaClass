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
class InvalidCustomerException extends Exception {
    // define attributes
    
    //constructor
   
    InvalidCustomerException (String s)
    {
        super(s);
        // this.attributes - 
    }
    
    @Override
    public String getMessage()
    {
        return "exception message";
    }
}
