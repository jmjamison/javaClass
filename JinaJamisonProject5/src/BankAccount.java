/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmjamison
 */
public class BankAccount {
    /**  protected private fields   */
    //private String customer;
    private Customer customer;
    private String customerName;
    private long accountNumber;
    protected float balance;
    //private float depositAmount;
    //private float withdrawAmount;
    
        
    
    /** constructor  */
    public BankAccount (String fname, String lname, String ssNumber, float amount)
    {
        //this.customer = customer;
        customer = new Customer(fname, lname, ssNumber);
        customerName = fname + " " + lname;
        accountNumber = (long)(Math.random() * 9e9 + 1e9);
        balance = amount;
        //this.depositAmount = depositAmount;
        //this.withdrawAmount = withdrawAmount;
        System.out.println("Successfully created account for " + fname + " " + lname + " Account Number " + accountNumber);
        
    }
    
    public void deposit(float amount)
    {
        //this.customer = customer;
        //this.balance = balance;
        //this.depositAmount = depositAmount;
        balance += amount; 
        
        System.out.println(customerName + " deposited $" + amount + ".  Current balance is $" + balance);
        //return(balance);
               
    } 
    
    public void withdraw(float amount)
    {
        //this.customer = customer;
        //this.balance = balance;
        //this.withdrawAmount = withdrawAmount;
        balance -= amount; 
        
        System.out.println(customerName + "  withdrew $" + amount + ".  Current balance is $" + balance);
        //return(this.balance);
    }
    
    public void applyInterest()
    {
        System.out.println("apply interest method");
    }
    
    public void checkBalance()            
    {
        //this.customer = customer;
        //this.balance = balance;
        System.out.println(customerName + ", Balance " + balance);
    }
        
}