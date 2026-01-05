package weeek9;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    protected int id;
    protected String name;
    protected double basicSalary;
    static String collegeName="Islington College";
    
    public Person(int id, String name, double basicsalary)
    {
        this.id=id;
        this.name=name;
        this.basicSalary=basicSalary;
    }
    
    public double calculateAnnualSalary()
    {
        double AnnualSalary=basicSalary*12;
        return AnnualSalary;
    }
}