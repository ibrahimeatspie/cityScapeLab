
/**
 * This class models a mileage tracker for a car.
 *
 * @author gcschmit
 * @version 27 September 2020
 */
public class MileageTracker
{
    private double milesDriven;
    private double fuelConsumed;
    private String vin;
   
    /*
     * 1. Define methods by specifying 
     *      the visibility (public, private)
     *      return type (e.g., void)
     *      method name (e.g.
     *      paramters and their types (e.g., miles of type double)
     * 
     * 
     * 
     */
    public MileageTracker(){
        
        this.milesDriven = 0;
        this.fuelConsumed = 0;
        this.vin = null;
        
        
        
    }
    public MileageTracker(double initialMilesDriven, double initialFuelConsumed){
        
        this.milesDriven = initialMilesDriven;
        this.fuelConsumed = initialFuelConsumed;
        
        
        
        
    }
    //just testing out how well the keyboarwwwwwwwwwwwwwwwwwwwwwwww
    /**
     * Increment number of miles car drove
     */
    public void incrementMilesDriven(double miles){
        this.milesDriven += miles;
        
        
        
    }
    /**
     * 
     * return total miles driven
     */
    public double getMilesDriven(){
        
        return this.milesDriven;
       
         
        
    }
    
    
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(double gallons)
    {
        this.fuelConsumed += gallons;
        
        
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public double getFuelConsumed()
    {
        return this.fuelConsumed;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public double getMileage()
    {
        return 0.0;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        return null;
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param newVIN    the vehicle identification (VIN) of this car
     */
    public void setVIN(String vin)
    {
        vin = vin;
    }
}






