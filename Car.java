package weeek9;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int numberofDoors;
    private String fuelType;
    
    public Car( int vehicleId, String brand, double basePrice, int numberofDoors, String fuelType)
    {
        super (vehicleId, brand, basePrice);
        this.numberofDoors=numberofDoors;
        this.fuelType=fuelType;
    }
    
    public double calculateFinalPrice()
    {
      double taxAmount=calculateTax();
      double luxuryCharge=basePrice*0.05;
      double FinalPrice=basePrice+taxAmount+luxuryCharge;
      return FinalPrice;
    }
}