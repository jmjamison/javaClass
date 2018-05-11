/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */
public class SavingAccount extends BankAccount {
    
     /**  constructor    */
    public String fname;
    public String lname;
    public String ssNumber;
    public float balance;
    public Customer customer;
    public String customerName;
    public String accountNumber;
    
    public void setCustomer (String fname, String lname)
    {
        //this.customer = fname + " " + lname;
        //System.out.println("new customer: " + fname + " " + lname);
    }
        
    public Customer createCustomer(String fname, String lname, String ssNumber)
    {
        this.fname = fname;
        this.lname = lname;
        this.ssNumber = ssNumber;
        this.balance = balance;
        this.accountNumber = accountNumber;
       
        
        Customer customerNew = new Customer(fname, lname, ssNumber);
        customerNew.setFname(fname);
        customerNew.setLname(lname);
        customerNew.setSSN(ssNumber);
        
        this.accountNumber = this.setAccountNumber();
        
        System.out.println("Successfully created account for " + fname + " " + lname + " Account Number " + accountNumber);
        return(customerNew);
    }
    
    
    
    /**  constructor    */
    public SavingAccount(String fname, String lname, String ssNumber, float balance)
    {    
        // Call super class Constructor with proper args
        super(fname + " " + lname,ssNumber,balance);
        
        // Create customer object
        this.customer = this.createCustomer(fname, lname, ssNumber);
        this.ssNumber = ssNumber;
        this.balance = balance;
        this.customerName = fname + " " + lname;
        
        
        //System.out.println(customerName + ", Balance " + balance);
        super.checkBalance();
            
    }
    
    
}
