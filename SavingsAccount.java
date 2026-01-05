package weeek9;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
    private double InterestRate;
    
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate)
    {
        super(accountNumber, accountHolderName, balance);
        this.InterestRate=InterestRate;
    }
    
    public double calculateInterest()
    {
        return super.getBalance()*InterestRate/100;
    }
}