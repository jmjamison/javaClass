/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author jamie
 */
public class BankDatabase {
    // constructor
    private String customerName;
    private float balance;  
    private String ssNumber;
    private float amount;
    //private CheckingAccount accountList[];
    private BankAccount accountList[];
    private int currentSize;
    
    BankDatabase()
    {
        this.accountList = new BankAccount[100];
        int currentSize = 0;
        System.out.println("array length: " + accountList.length);
       //
    }
    
    // methods
    void createCheckingAccount(String customerName, String ssNumber, float amount)
    {
        String[] fullname = customerName.split(" ");
        String fname = fullname[0];
        String lname = fullname[1];
        
       CheckingAccount acct1  = new CheckingAccount(fname, lname, ssNumber, amount );
       accountList[currentSize] = acct1;
       currentSize ++;
       
       // 
    }
    
    void createSavingsAccount(String customerName, String ssNumber, float amount)           
    {
        String[] fullname = customerName.split(" ");
        String fname = fullname[0];
        String lname = fullname[1];
        SavingAccount acct2 = new SavingAccount (fname, lname, ssNumber, amount );
        accountList[currentSize] = acct2;
        currentSize ++;
    }
    
    void print()
    {
       for (int i = 0; i < currentSize; i++) 
       {
         // super.printInfo();
       }
    }
    
    void applyInterest()
    {
        //
    }
    
    
}
