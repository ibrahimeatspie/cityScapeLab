
/**
 * Write a description of class Conditions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conditions
{
    public static void ifExaxmple(){
    
    
    int coinFlip = (int)(Math.random() * 2);
    
    System.out.println(coinFlip);
    
    if (coinFlip == 1){
     System.out.println("Coin is heads!");   
        
    }else{
        System.out.println("Coin is tails!");
        
    }
    
    int dieRoll = (int)(Math.random() * 4) + 1;
    if (dieRoll == 1){
        
        System.out.println("rolled a one");
    }else if (dieRoll == 2){
        
                System.out.println("rolled a 2");

    }else if (dieRoll == 3){
        
                System.out.println("rolled a 3");

    }else{
                System.out.println("rolled a 4");

    }
    if (coinFlip == 0)
        System.out.println("Coin is tails!");
        
    }
    
}
