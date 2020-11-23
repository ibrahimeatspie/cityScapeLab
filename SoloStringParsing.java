import java.util.Scanner;

/**
 * Write a description of class SoloStringParsing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SoloStringParsing
{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer between 1,000 and 999,999 with commas: ");
        String userInput = new String(s.nextLine());
        int length = userInput.length();
        String substring1 = new String(userInput.substring(0,3));
        String substring2 = new String(userInput.substring(4,7));
        String inputWithoutCommas = new String(substring1 + substring2);
        System.out.println(inputWithoutCommas);
        
        
        
        
        
        
        

        
    }
    
}
