/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmjamison
 */
abstract class BankAccount {
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
        System.out.println("Successfully created account for " + fname + " " + lname + " Account Number " + accountNumber);
        //printInfo();
        
    }
    
     
    abstract void applyInterest();
    
    public class account implements Comparable<account>
    {
        public String customerName; 
        long accountNumber;
        public float balance;
        
        public account()
        {
            this.customerName = customerName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        
        @Override
        public int compareTo(account other)
        {
            if (this.balance < other.balance) { return -1; }
            if (this.balance > other.balance) { return 1; }
            return 0;
        }

        private float getBalance() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}