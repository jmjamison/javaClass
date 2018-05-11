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
    
    private float interestRate;
    // calculate interest for checking account
    // 2% in exeess of $10,000
    public void applyInterest()
    {
        if(balance >= 10000.0f)
            balance = balance + ((balance-10000)*.02f);
    }
    
    /**  constructor    */
    public CheckingAccount(String fname, String lname, String ssNumber, float amount)
    {    
        super(fname, lname, ssNumber, amount);
        
    }
    
    
}
