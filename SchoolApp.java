package weeek9;


/**
 * Write a description of class SchoolApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SchoolApp
{
    public static void main(String[] args)
    {
        Teacher t1=new Teacher(202,"Aayusha",45000,"English",1000);
        Staff s1=new Staff(789,"Juna",44000,10,100);
        
        System.out.println("Teacher AnnualSalary:"+ t1.calculateAnnualSalary());
        
        System.out.println("Staff Salary:"+ s1.calculateSalary());
        
        System.out.println("College Name:"+Person.collegeName);
    }
}