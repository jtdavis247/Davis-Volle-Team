/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kyle
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcTimeLapsed method, of class MapControl.
     */
    @Test
    public void testCalcTimeLapsed() {
        System.out.println("calcTimeLapsed");
        
        /*************************
         * Test Case #1
         ************************/
        System.out.println("\tTest Case #1");
        
        // Input values
        int[] origin = {1, 2};
        int[] destination = {3, 4};
        int shipSpeed = 2;
        
        // Expected Output
        double expResult = 1.41;
        
        // Create instance of class
        MapControl instance = new MapControl();
        
        // Call function to test
        double result = instance.calcTimeLapsed(origin, destination, shipSpeed);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
        /*************************
         * Test Case #2
         ************************/
        System.out.println("\tTest Case #2");
        
        // Input values
        origin[0] = 1;
        origin[1] = 2;
        destination[0] = 1;
        destination[1] = 2;
        shipSpeed = 1;
        
        // Expected Output
        expResult = -1;
        
        // Call function to test
        result = instance.calcTimeLapsed(origin, destination, shipSpeed);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
        /*************************
         * Test Case #3
         ************************/
        System.out.println("\tTest Case #3");
        
        // Input values
        origin[0] = 0;
        origin[1] = 0;
        destination[0] = 5;
        destination[1] = 5;
        shipSpeed = 1;
        
        // Expected Output
        expResult = 7.07;
        
        // Call function to test
        result = instance.calcTimeLapsed(origin, destination, shipSpeed);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
        /*************************
         * Test Case #4
         ************************/
        System.out.println("\tTest Case #4");
        
        // Input values
        origin[0] = 0;
        origin[1] = 0;
        destination[0] = 0;
        destination[1] = 1;
        shipSpeed = 3;
        
        // Expected Output
        expResult = .33;
        
        // Call function to test
        result = instance.calcTimeLapsed(origin, destination, shipSpeed);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
    }
    
}
