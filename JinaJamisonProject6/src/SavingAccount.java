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
    
    private float interestRate;
    // calculate interest for savings account
    // 5% flat fixed interest
    public void applyInterest()
    {
        // this is just for me and my iffy math skills
        interestRate = .05f;
        balance =+ balance + (balance*.05f);
    }
    
    /**  constructor    */
    public SavingAccount(String fname, String lname, String ssNumber, float amount)
    {    
        super(fname, lname, ssNumber, amount);
    }
    
    
    
}
