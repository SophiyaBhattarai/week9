package weeek9;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employees
{
    private double HouseRentAllowance;
    private double DearnessAllowance;
    
    public PermanentEmployee(int employeeId, String name, double basicSalary, double HouseRentAllowance, double DearnessAllowance)
    {
        super(employeeId, name, basicSalary);
        this.HouseRentAllowance=HouseRentAllowance;
        this.DearnessAllowance=DearnessAllowance;
    }
    
    public double calculateTotalSalary()
    {
        double bonus=calculateBonus();
        double TotalSalary=basicSalary+HouseRentAllowance+DearnessAllowance+bonus;
        return TotalSalary;
    }
}