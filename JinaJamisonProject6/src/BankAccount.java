/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmjamison
 */
public abstract class BankAccount {
    // declare fields
    String name;   
    String[] fullname = name.split(" ");
    String fname = fullname[0];
    String lname = fullname[1];
    String ssNumber;
    float amount;
    //private String customerName;
    //private long accountNumber;
    //protected float balance;
        
        
    
    /** constructor  */
    public BankAccount (String name, String ssNumber, float amount)
    {
        this.name = name;
        this.ssNumber = ssNumber;
        this.amount = amount;
        
        this.fname = fname;
        this.lname = lname;
        
        
         
    }
    
    abstract void applyInterest();     
        
}