/**
 *
 * @author jmjamison
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */
public class CheckingAccount extends BankAccount {
    
    public String fname;
    public String lname;
    public String ssNumber;
    public float balance;
    public String customer;
    public String accountNumber;
    
         
    /**  constructor    */
    CheckingAccount(String customer, String accountNumber, float balance)
    {
        
        this.fname = fname;
        this.lname = lname;
        this.ssNumber = ssNumber;
        this.balance = balance;
        
        this.customer = fname + " " + lname;
        
        Customer customer1 = new Customer(fname, lname, ssNumber);
    }
    
    
    
    
    
    
}