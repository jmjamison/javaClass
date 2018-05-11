/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */
public class BankMain {
    public static void main(String[] args)
    {
        CheckingAccount acct1 = new CheckingAccount ("Alin", "Parker", "123-45-6789", 1000.0f);
        //acct1.checkBalance();  // debugging code
        CheckingAccount acct2 = new CheckingAccount("Mary", "Jones", "987-65-4321", 500.0f);
        //acct2.checkBalance();  // debugging code
        SavingAccount acct3 = new SavingAccount("John", "Smith", "1233-a5-6789", 200.0f);
        //acct3.checkBalance();  // debugging code
        
        acct1.deposit(22000.0f);
        acct2.deposit(12000.0f);
        
        acct1.withdraw(2000.0f);
        acct2.withdraw(1000.0f);
        
        acct1.applyInterest();
        acct2.applyInterest();
        //acct3.applyInterest();  // debugging code
        
        acct1.checkBalance();
        acct2.checkBalance();
        //acct3.checkBalance();  // debugging code
        
        acct1.withdraw(30000.0f);
    }
    
}
