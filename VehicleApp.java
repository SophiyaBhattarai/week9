package weeek9;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp
{
    public static void main(String[] args)
    {
        Car c1=new Car(7809,"BMW",43200,4,"petrol");
        Bike b1=new Bike(7879,"Honda",56000,160);
        
        System.out.println("Car Details");
        c1.displayVehicleInfo();
        System.out.println("taxAmount:"+c1.calculateTax());
        System.out.println("FinalPrice:"+c1.calculateFinalPrice());
        
        System.out.println("Bike Details");
        b1.displayVehicleInfo();
        System.out.println("taxAmount:"+b1.calculateTax());
        System.out.println("FinalPrice:"+b1.calculateFinalPrice());
    }
}