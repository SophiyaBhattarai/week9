package weeek9;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person
{
    private int workingHours;
    private double ratePerHour;
    
    public Staff(int id, String name, double basicSalary, int workingHours, double ratePerHour)
    {
        super(id,name,basicSalary);
        this.workingHours=workingHours;
        this.ratePerHour=ratePerHour;
    }
    
    public double calculateSalary()
    {
        double salary=workingHours;
        salary=salary*ratePerHour;
        return salary;
    }
}