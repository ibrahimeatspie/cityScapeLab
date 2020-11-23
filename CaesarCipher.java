import java.util.Scanner;

/**
 * This class encrypts strings with a keyphrase version of the classic
 *      Caesar Cipher.
 *      (as described in The Code Book by Simon Singh)
 *
 * @author gcschmit
 * @version 21 September 2018
 */
public class CaesarCipher
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the text to encrypt: ");
        String text = s.nextLine();
        text = text.toUpperCase();
        
        System.out.print("Enter the keyphrase (no spaces): ");
        
        String keyphrase = s.next();
        
        keyphrase = keyphrase.toUpperCase();
        
        System.out.println("Enter number of seconds to test guessed keyprhase: ");
        
        int secondsPerGuess = s.nextInt();
        
        
        
        
        
    
    }
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    private String keyphrase;
    
    public CaesarCipher(String initialKeyphrase){
      // prepare the keyphrase by removing duplicate letters
      this.compressKeyphrase(initialKeyphrase);
        
        
    }
    public void compressKeyphrase(String keyphrase){
        this.keyphrase = "";
        
        int keyphraseLength = keyphrase.length();
        
        for(int i = 0; i < keyphraseLength; i++){
            
            char letter = keyphrase.charAt(i);
            
            String restOfKeyphrase = keyphrase.substring(i+1);
            
        }
        
        
    
        
    }
   
    
    
    
    
    
    /**
     * Encrypts the specified text using the specified keyphrase using a
     *      keyphrase-enhanced Caesar Cipher.
     *      
     *  @param  text        the text to encrypt
     *  @param  keyphrase   the keyphrase with which to encrypt the specified text
     *  @return             the encrypted text
     */
    public String encrypt(String text)
    {
        String encryptedText = "";

        /*
         * The keyphrase, after removing any repeated letters is used as the beginning of the
         *      jumbled cipher alphabet. The remainder of the cipher alphabet is merely the
         *      remaining letters of the alphabet, in their correct order, starting where the
         *      keyphrase ends.
         */
        String cipherAlphabet = this.keyphrase;
        for(int i = 0; i < CaesarCipher.ALPHABET.length(); i++)
        {
            char letter = CaesarCipher.ALPHABET.charAt(i);
            if(this.keyphrase.indexOf(letter) == -1)
            {
                cipherAlphabet += letter;
            }
        }

        /*
         * For each letter in the text that is a letter, find the corresponding letter
         *      at the same position in the cipher alphabet as its replacement.
         */
        for(int i = 0; i < text.length(); i++)
        {
            char letter = text.charAt(i);

            // if the letter is between A and Z
            if(letter >= 'A' && letter <= 'Z')
            {
                // 65 is the ASCII value of 'A'
                int cipherIndex = letter - 65;
                encryptedText += cipherAlphabet.charAt(cipherIndex);
            }
            else    // don't substitute the letter; just use it as is
            {
                encryptedText += letter;
            }
        }

        return encryptedText;
    }

    /**
     * Calcualtes the average time to crack the cipher, based on the
     *      specified length of the keyphrase and seconds to evaluate
     *      each attempt, using a brute force approach. This calculation
     *      assumes that the cracker knows the length of the keyphrase.
     *      If the length is not know, it will take substantially longer
     *      to crack the cipher. Regardless, this calculation is only
     *      for a brute force approach; other techniques (e.g., frequency
     *      analysis) can crack the cipher extremely quickly.
     *      
     *  @param  keyphraseLength the number of characters in the keyphrase
     *  @param  secPerGuess     the number of seconds to evaluate each attempt
     *  @return                 the average number of seconds to crack the cipher
     */
    public long calculateAverageTimeToCrack(int secPerGuess)
    {

        /*
         * Calculate the number of combintations for the specified keyphrase length.
         *  For example, if the keyphrase is six characters long:
         *      26 * 25 * 24 * 23 * 22 * 21
         *      would be the number of combinations of cipher alphabets for keyphrases
         *      that are six characters long.
         */
        for(int i = 0; i < keyphraseLength; i++)
        {
            combinations *= lettersRemaining;
            lettersRemaining -= 1;
        }

        long worstCaseTimeToCrack = combinations * secPerGuess;

        // average time is half the worst time since the best time is cracking the
        //  cipher on the first attempt
        return worstCaseTimeToCrack/2;
    }
    public String getComplexityDescription(int secPerGuess){
        String desc;
        
        final int SECONDS_FOR_EVERY_MINUTE = 60;
        final int MINUTES_FOR_EVERY_HOUR = 60;
        final int HOURS_FOR_EVERY_DAY = 24;
        final int DAYS_FOR_EVERY_YEAR = 365;
        
        long totalSeconds = this.calculateAverageTimeToCrack(secPerGuess);
        
        long wholeMinutes = totalSeconds / SECONDS_FOR_EVERY_MINUTE;
        
        long leftOverSeconds = totalSeconds % SECONDS_FOR_EVERY_MINUTE;
        
        long wholeHours = wholeMinutes / MINUTES_FOR_EVERY_HOUR;
        
        long leftOverMinutes = wholeMinutes % MINUTES_FOR_EVERY_HOUR;
        
        long wholeDays= wholeHours / HOURS_FOR_EVERY_DAY;
        long leftOverHours = wholeHours % HOURS_FOR_EVERY_DAY;
        
        long wholeYears = wholeDays / DAYS_FOR_EVERY_YEAR;
        long leftOverDays = wholeDays % DAYS_FOR_EVERY_YEAR;
        
        desc = "Average time to crack: " + wholeYears+" years, " + leftOverDays + " days. " + leftOverHours + "hours, " + leftOverMinutes +
        "Minutes " + leftOverSeconds + "seconds";
        
        return desc;
        
        
        
        
        
        
        
    
        
        
        
    }
    public void compressKeyphrase(String keyphrase){
        this.keyphrase = "";
         int keyphraseLength = keyphrase.length();
         
        
    }
}
