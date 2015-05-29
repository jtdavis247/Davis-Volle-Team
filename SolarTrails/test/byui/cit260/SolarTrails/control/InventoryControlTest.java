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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcFoodUsed method, of class InventoryControl.
     */
    @Test
    public void testCalcFoodUsed() {
        System.out.println("calcFoodUsed");
        
        /*************************
         * Test Case #1
         ************************/
        System.out.println("\tTest Case #1");
        
        // Input values
        double timeLapsed = 2;
        int crewSize = 5;
        int food = 15;
        
        // Expected Output
        double expResult = 10;
        
        // Create instance of class
        InventoryControl instance = new InventoryControl();
        
        // Call function to test
        double result = instance.calcFoodUsed(timeLapsed, crewSize, food);
        assertEquals(expResult, result, 0.1);
        
        /*************************
         * Test Case #2
         ************************/
        System.out.println("\tTest Case #2");
        
        // Input values
        timeLapsed = 3;
        crewSize = 5;
        food = 14;
        
        // Expected Output
        expResult = -1;
        
        // Call function to test
        result = instance.calcFoodUsed(timeLapsed, crewSize, food);
        
        assertEquals(expResult, result, 0.1);
        
        /*************************
         * Test Case #3
         ************************/
        System.out.println("\tTest Case #3");
        
        // Input values
        timeLapsed = 1;
        crewSize = 4;
        food = 4;
        
        // Expected Output
        expResult = 4;
        
        // Call function to test
        result = instance.calcFoodUsed(timeLapsed, crewSize, food);
        
        assertEquals(expResult, result, 0.1);
        
        /*************************
         * Test Case #4
         ************************/
        System.out.println("\tTest Case #4");
        
        // Input values
        timeLapsed = 1;
        crewSize = 7;
        food = 7;
        
        // Expected Output
        expResult = 7;
        
        // Call function to test
        result = instance.calcFoodUsed(timeLapsed, crewSize, food);
        
        assertEquals(expResult, result, 0.1);
    }
    
}
