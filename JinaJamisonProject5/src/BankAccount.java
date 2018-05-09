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
    private String customer;
    private String accountNumber;
    private float balance;
    
    /** constructor  */
    BankAccount (String customer, String accountNumber, float balance)
    {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }
    
    public void deposit()
    {
        System.out.println("deposit method");
    }
    
    public void withdraw()
    {
        System.out.println("withdraw method");
    }
    
    public void applyInterest()
    {
        System.out.println("apply interest method");
    }
    
    public void checkBalance()
    {
        System.out.println("check bank balance method");
    }
    
    public void setCustomer()
    {
        //
        System.out.println(customer);
    }
    
    public void setAccountNumber()
    {
        //
        System.out.println(accountNumber);
    }
    
    public void setBalance()
    {
        //
        System.out.println(balance);
    }
    
}
