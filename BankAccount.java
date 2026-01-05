package weeek9;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;
    
    public BankAccount(int accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    
    public void deposit(double amount)
    {
       if (amount>0)
       {
           balance += amount;
       }
    }
    
    public double getBalance()
    {
        double b=balance;
        return b;
    }
}