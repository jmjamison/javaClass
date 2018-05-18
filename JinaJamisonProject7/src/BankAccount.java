/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */
abstract class BankAccount implements Comparable<BankAccount> {
    /**  protected private fields   */
    private Customer customer;
    String customerName;
    long accountNumber;
    protected float balance;
    private float amount;
    private String ssNumber;
    
        
        
    /** constructor  */
    public BankAccount (String fname, String lname, String ssNumber, float amount)
    {
        customer = new Customer(fname, lname, ssNumber);
        this.customerName = fname + " " + lname;
        this.amount = amount;
        this.balance = balance;
        this.ssNumber = ssNumber;
        accountNumber = (long)(Math.random() * 9e9 + 1e9);
        balance = amount;
        System.out.println("Successfully created account for " + fname + " " + lname + ", Account Number " + accountNumber);
        //printInfo();
        
    }
    
     
   abstract void applyInterest();
    
   // implement interface  accountList[i].balance
    
  
    @Override
    public int compareTo(BankAccount o)
    {
        // sort based on balance
        if (o == null)
        {
            return 0;
        }
        
        if (o instanceof BankAccount)  // checking or savings account return true
        {
            BankAccount other = (BankAccount) o;  
            if (balance < other.balance) { return -1; }
            if (balance > other.balance) { return 1; }
        }
        
            return 0;
        
        
    }
  

    
}