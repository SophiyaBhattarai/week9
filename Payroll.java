package weeek9;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
    public static void main(String[] args)
    {
        PermanentEmployee p1=new PermanentEmployee(101,"Aayusha",56000,700,800);
        ContractEmployee c1=new ContractEmployee(707,"Juna",57000,20);
        
        System.out.println("Permanent Employee");
        p1.displayEmployee();
        System.out.println("TotalSalary:"+p1.calculateTotalSalary());
        
        System.out.println("Contract Employee");
        c1.displayEmployee();
        System.out.println("TotalSalary:"+c1.calculateTotalSalary());
    }
}