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
    private float withdrawAmount;
    
    /** constructor  */
    BankAccount (String customer, String accountNumber, float balance)
    {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        
    }
    
    public float deposit(float depositAmount)
    {
        this.customer = customer;
        this.balance = balance;
        this.depositAmount = depositAmount;
        this.balance = this.balance + depositAmount; 
        
        System.out.println(this.customer + " deposited " + depositAmount + ".  Current balance is " + this.balance);
        return(this.balance);
               
    } 
    
    public float withdraw(float withdrawAmount)
    {
        this.customer = customer;
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
        this.balance = this.balance - depositAmount; 
        
        System.out.println(this.customer + "  withdrew " + withdrawAmount + ".  Current balance is " + this.balance);
        return(this.balance);
    }
    
    public void applyInterest()
    {
        System.out.println("apply interest method");
    }
    
    public void checkBalance()            
    {
        this.customer = customer;
        this.balance = balance;
        System.out.println(this.customer + ", Balance " + this.balance);
    }
    
    public String setAccountNumber()
    {
        
        accountNumber = "1234567898";
        //System.out.println(accountNumber);
        return(accountNumber);
    }
    
        
}
