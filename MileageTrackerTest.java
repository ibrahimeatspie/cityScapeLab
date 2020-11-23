

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MileageTrackerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MileageTrackerTest
{
    /**
     * Default constructor for test class MileageTrackerTest
     */
    public MileageTrackerTest()
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
    public void testIncrementMilesDriven(){
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementMilesDriven(10.0);
        double amount = testTracker.getMilesDriven();
        assertEquals(10, amount, 1e-6);
        
        
        
        
    }
    

    @Test
    public void testIncrementFuelConsumed()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementFuelConsumed(2.5);
        double amount = testTracker.getFuelConsumed();
        assertEquals(2.5, amount, 1e-6);
        
        testTracker.incrementFuelConsumed(0.5);
        amount = testTracker.getFuelConsumed();
        assertEquals(3.0, amount, 1e-6);
                                                                   
        
    }
    
    @Test
    public void testSetVIN(){
        MileageTracker testTracker = new MileageTracker();
        String testVIN = new String("asdasd");
        String returnedVIN = testTracker.getVIN();
        
        
        
         
    }
}

