/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */
public class BankApp {
    
    public static void main(String[] args) {
        
        // array list
        BankDatabase acctDatabase = new BankDatabase();
        
        acctDatabase.createCheckingAccount("Alin Parker", "123-45-6789", 20000.0f);
        acctDatabase.createSavingsAccount("Mary Jones", "987-65-4321", 15000.0f);
<<<<<<< HEAD
        // invalid social security number to test
=======
>>>>>>> 00b53839ae0e3e3aa57839872cb208778804b6bb
        acctDatabase.createSavingsAccount("John Smith", "1239-45-6789", 12000.0f);
        
        acctDatabase.print();
        acctDatabase.applyInterest();
        acctDatabase.print();
    }
    
}
