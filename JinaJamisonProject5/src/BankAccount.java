/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author jmjamison
 */
public class BankAccount {
    /**  protected private fields   */
    private String customer;
    private String accountNumber;
    private float balance;
    private float depositAmount;
    
    /** constructor  */
    BankAccount (String customer, String accountNumber, float balance)
    {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.depositAmount = depositAmount;
        
    }
    
    public void deposit(float depositAmount)
    {
        this.customer = customer;
        this.depositAmount = depositAmount;
        this.balance = balance + depositAmount; 
        
        System.out.println(this.customer + " deposited " + depositAmount + ".  Current balance is " + balance);
               
    } 
    
    public void withdraw()
    {
        System.out.println("withdraw method");
    }
    
    public void applyInterest()
    {
        System.out.println("apply interest method");
    }
    
    public void checkBalance(String customer)            
    {
        this.customer = customer;
        System.out.println(this.customer + ", Balance " + balance);
    }
    
    public void setCustomer()
    {
        //
        System.out.println(customer);
    }
    
    public String setAccountNumber()
    {
        
        accountNumber = "1234567898";
        //System.out.println(accountNumber);
        return(accountNumber);
    }
    
    public void setBalance()
    {
        //
        System.out.println(balance);
    }
    
}
