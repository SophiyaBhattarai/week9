package weeek9;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args)
    {
        SavingsAccount s1=new SavingsAccount(405,"Aayusha",75000,7);
        CurrentAccount c1= new CurrentAccount(678,"Juna",65000,6899);
        
        s1.deposit(56000);
        System.out.println("SavingsAccount balance:"+ s1.getBalance());
        System.out.println("Interest:"+ s1.calculateInterest());
        
        c1.withdraw(5600);
        System.out.println("CurrentAccount balance:"+ c1.getBalance());
    }
}