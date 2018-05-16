/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmjamison
 */
abstract class BankAccount {
    /**  protected private fields   */
    private Customer customer;
    private String customerName;
    private long accountNumber;
    protected float balance;
    private float amount;
    private String ssNumber;
        
        
    
    /** constructor  */
    public BankAccount (String fname, String lname, String ssNumber, float amount)
    {
        customer = new Customer(fname, lname, ssNumber);
        customerName = fname + " " + lname;
        accountNumber = (long)(Math.random() * 9e9 + 1e9);
        balance = amount;
        System.out.println("Successfully created account for " + fname + " " + lname + " Account Number " + accountNumber);
        printInfo();
        
    }
    
     public void printInfo()
    {
        System.out.println(customerName + ", " + ssNumber + " " + amount);
    }
     
    public void deposit(float amount)
    {
        balance += amount; 
        
        System.out.println(customerName + " deposited $" + amount + ".  Current balance is $" + balance);
       
               
    } 
    
    public void withdraw(float amount)
    {
              
        if (amount < balance)
        {
            balance -= amount; 
             System.out.println(customerName + "  withdrew $" + amount + ".  Current balance is $" + balance);
        }
        else
        {
            System.out.println("Unable to withdraw $" + amount + " for "  + customerName + " due to Insufficient Funds.");
        }
        
       
    }
    
    public void applyInterest()
    {
        System.out.println("apply interest method");
    }
    
    public void checkBalance()            
    {
        System.out.println(customerName + ", Balance $" + balance);
    }
        
}