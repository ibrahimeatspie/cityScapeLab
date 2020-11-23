

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /**
     * Default constructor for test class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testConstructorWithParamater(){
        
        VendingMachine bruh = new VendingMachine(50);
        int receivedCans1 = bruh.getCans();
        assertEquals(receivedCans1, 50);
        
        
        
    }
    @Test
    public void testConstructorWithoutParamater(){
        VendingMachine bruh = new VendingMachine();
        int receivedCans2 = bruh.getCans();
        assertEquals(receivedCans2, 10);
        
    }
    
    @Test
    public void testGetCans(){
        VendingMachine bruh = new VendingMachine(50);
        int receivedCans = bruh.getCans();
        assertEquals(receivedCans, 50);
        
        
        
    }
    @Test
    public void testInsertTokens(){
        VendingMachine bruh = new VendingMachine(50);
        int totalTokens = bruh.insertTokens(50);
        assertEquals(totalTokens, 50);
        
        
        
    }
    @Test
    public void testInsertCans(){
        VendingMachine bruh = new VendingMachine(50);
        int newlyInsertedCans = bruh.insertCans(50);
        assertEquals(newlyInsertedCans, 100);
        
        
        
        
        
        
    }
    @Test
    public void testGetTokens(){
     VendingMachine bruh = new VendingMachine(50);
     int totalReceivedTokens = bruh.getTokens();
     assertEquals(totalReceivedTokens, 0);
     
     
        
    }
}
