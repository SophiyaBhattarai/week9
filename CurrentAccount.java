package weeek9;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;
    
    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit)
    {
        super(accountNumber, accountHolderName,balance);
        this.overdraftLimit=overdraftLimit;
    }
    
    public boolean withdraw(double amount)
    {
        boolean allowed= amount<=balance+overdraftLimit;
        if (allowed)
        {
            balance -= amount;
        }
        return allowed;
    }
}