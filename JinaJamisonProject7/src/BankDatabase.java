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
    private String ssNumber;
    private float amount;
    private float balance;  
    private BankAccount accountList[] = new BankAccount[100];;
    // array list example
    // private ArrayList<BankAccount> accountList = new ArrayList();
    private int currentSize;
    private long accountNumber;
    
    
    BankDatabase()
    {
        this.customerName = customerName;
        this.amount = amount;
        this.balance = balance;
        this.ssNumber = ssNumber;
        this.accountNumber = accountNumber;
        int currentSize = 0;
        
    }
    
    // methods
    void createCheckingAccount(String customerName, String ssNumber, float amount)
    {
        String[] fullname = customerName.split(" ");
        String fname = fullname[0];
        String lname = fullname[1];
        
       CheckingAccount checking  = new CheckingAccount(fname, lname, ssNumber, amount );
       accountList[currentSize] = checking;
       // accountList.add(acct1);
       // or one step:
       // accountList.add(acct1) = new CheckingAccount(fname, lname, ssNumber, amount );
       // if using arrayList won't need the count
       currentSize ++;
       
       // 
    }
    
    void createSavingsAccount(String customerName, String ssNumber, float amount)           
    {
        String[] fullname = customerName.split(" ");
        String fname = fullname[0];
        String lname = fullname[1];
        
        SavingAccount savings = new SavingAccount (fname, lname, ssNumber, amount );        
       // accountList.add(acct2);
       // or one step:
       // accountList.add(acct2) = new CheckingAccount(fname, lname, ssNumber, amount );
        accountList[currentSize] = savings;
        // if using arrayList won't need the count
        currentSize ++;
    }
    
   
    void print()
    {
        Arrays.sort(accountList, 0, currentSize);
        // if you are using arrayList then use Collections.sort(currentSize)
        
        for (int i = 0; i < currentSize; i++) 
            // enhansed for-loop arrayList example:
            // for (BankAccount ba : accountList
       {
         System.out.println(accountList[i].customerName + ", accn#: " + accountList[i].accountNumber + ", Balance $" + accountList[i].balance);
         //System.out.println(db[i] etc
        }
    }
    
    void applyInterest()
    {
        for (int i = 0; i < currentSize; i++) 
       {
           //System.out.println(accountList[i].balance); debugging code only
           accountList[i].applyInterest();
           // ba.applyInterest();
       }
    }
    
    
}
