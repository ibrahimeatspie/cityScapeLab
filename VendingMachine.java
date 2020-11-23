
/**
 * Represents a Vending Machine
 *
 * @Ibrahim Shah (your name)
 * @10/21/2020 (a version number or a date)
 */
public class VendingMachine
{
    /**
     * Number of cans to be present in the vending machine
     */
    private int cans;
    /**
     * Number of tokens to be present in the vending machine 
     */
    private int tokens;
    /**
     * Whether or not a token is currently inserted into the machine (probably not)
     */
    private boolean tokenPresent;
    /**
     * Creates a new vending machine with a given number of cans 0 tokens
     */
    public VendingMachine(int numberOfCans){
        cans = numberOfCans;
        tokens = 0;
        
    }
    /**
     * Creates a new vending machine with 10 soda cans and 0 tokens
     */
    public VendingMachine(){
        cans = 10;
        tokens = 0;
    }
    
    
    
    /**
     * Returns boolean telling user whether or not a token is inserted;
     * if it is inserted, release one can, and set value to false
     * @return whether it is true or false that a token is currently inserted into the machine
     * @param inserted represents an inserted token
     * @param notInserted represents a not inserted token
     * 
     */
    //method token is inserted; if yes, drop can, return back to false, tokens++
    //method getCans returns number of cans
    //method insert cans increases number of cans
    //method getTokens returns number of tokens 
    public int insertTokens(int tokensToBeInserted){
        tokens = tokens+tokensToBeInserted;
        cans = cans-tokensToBeInserted;
        
        
        return tokens;
        
      
        
     
     
    }
    /**
     * Returns the amount of cans present in the vending machine
     * @return amount of cans currently present in the vending machine
     */
    public int getCans(){
        return cans;
        
        
    }
    /**
     * Inserts cans into the vending machine 
     * @param numberOfCansToInsert is the number of cans, as an integer, you would like to insert into the vending machine 
     * 
     */
    public int insertCans(int numberOfCansToInsert){
        cans = cans+numberOfCansToInsert;
        return cans;
        
        
        
        
    }
    /**
     * 
     * Returns number of tokens collected in vending machine 
     * @return number of total tokens collected in vending machine 
     */
    public int getTokens(){
     return tokens;   
        
        
    }
    
    
}
