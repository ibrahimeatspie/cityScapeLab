
/**
 * Write a description of class MilkJarCalclulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MilkJarCalclulator
{
    // instance variables - replace the example below with your own
public static void main(String[] args)
   {
      double milk = 5.5; // gallons
      double jarCapacity = 0.75; // gallons
      double completelyFilledJars = milk / jarCapacity;
      double remainder = (milk % jarCapacity)/jarCapacity;
      
      
      
      System.out.println(completelyFilledJars-remainder);
   }
}
