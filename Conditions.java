import java.util.Scanner;

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
    
    public static boolean doublesAreEqual(double num1, double num2){
        
        final double Epsilon = 1e-14;
        if (Math.abs(num1-num2) < Epsilon){
            return true;
        }else{
            return false;
        }
        
        //don't have to use an if statement
        //return Math.abs(num1-num2) < Epsilon
        
       
        
    }
    
    public static void stringExample(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two words:");
        String str1 = s.next();
        String str2 = s.next();
        
        
        /*
         * The equality operator (==) returns true if the two variables (e.g., str1 and str2 contain the same value.
         * For variables of a class typee, including strings, this means they contian the same reference. That is, they refer to the same object
         * in memory, not that two Strings have the same sequence of characters. 
         */
        
        if(str1 == str2){
            
            System.out.println("strings references are equal");
            
        }else{
            System.out.println("strings references are not equal");
        }
        
        /*
         * The equals method returns true if the two objects referenced by the variables are "equal".
         *  What equals means is defined by the class. For strings,m it means that the two objects have the same sequence of characters.
         */
        if(str1.equals(str2)){
            
            System.out.println("strings are equal");
            
        }else{
            System.out.println("strings are not equal");
        }
        
        /*
         * We will determine which string comes first lexicographically using the compareTo
         *  method of the String class.
         *  
         *  compareTo returns an intL
         *      0:  if the strings are equal (same sequence of characters)
         *      < 0: if str1 < str2 lexicographically 
         *      > 0: if str1 > str2 lexicographically
         *      
         */                 
        int result = str1.compareTo(str2);
        String firstStr = null;
        if (result < 0){
            firstStr = str1;
        }else if(result > 0){
            firstStr = str2;
        }
        if (firstStr != null){
            System.out.println("The first string is: "+ firstStr);
            System.out.println("Its length is: " + firstStr.length());
        }
        /*
         * This is an example of a "short circuit".
         * 
         * For and AND operation, if left operand is false, the right operand will not be avaluated
         *  because the AND operation is false regardless.
         */
        if(firstStr != null && firstStr.length() >3){
         System.out.println("The first string has more htan 3 characters.");   
        }
        
        /*
         * This is another short circuit example.
         * 
         * For an OR operation, if the left operand is true, thje right operand will not be evaluated
         *  because the OR operation is true regardless.
         *  
         *  This may result in a bug. If the first word is kiwi, we will never read the second word
         *      from the stream, which may result in unexpected behavior
         */
        
        
        System.out.print("Enter your two favorite fruits: ");
        if(s.next().equals("kiwi") || s.next().equals("kiwi")){
            System.out.println("Kiwi is one of my favorite fruits too!");
            
        }
        System.out.print("Enter your favorite ice cream falvor: ");
        String flavor = s.next();
        
        System.out.println("Your favorite ice cream flavor is: " + flavor);
        
    }
    public static void extraOperatorExample(){
        int x = 7;
        int y = 7;
        int z = 7;
        
        System.out.println(x+" "+z++);
        
        System.out.println(z+" "+y++);
        
        
    }
    
}
