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
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
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
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
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
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
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
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
    }
    
    
    @Test
    public void testCalcFuelUsed() {
        System.out.println("calcFuelUsed");
        
        /*************************
         * Test Case #1
         ************************/
        System.out.println("\tTest Case #1");
        
        // Input values
        int[] origin = {1, 2};
        int[] destination = {3, 4};
        double amtFuel = 5;
        
        // Expected Output
        double expResult = 2.83;
        
        // Create instance of class
        InventoryControl instance = new InventoryControl();
        
        // Call function to test
        double result = instance.calcFuelUsed(origin, destination, amtFuel);
        
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
        amtFuel = 2;
        
        // Expected Output
        expResult = -1;
        
        // Call function to test
        result = instance.calcFuelUsed(origin, destination, amtFuel);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
        /*************************
         * Test Case #3
         ************************/
        System.out.println("\tTest Case #3");
        
        // Input values
        origin[0] = 0;
        origin[1] = 0;
        destination[0] = 4;
        destination[1] = 4;
        amtFuel = 2;
        
        // Expected Output
        expResult = -2;
        
        // Call function to test
        result = instance.calcFuelUsed(origin, destination, amtFuel);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
        /*************************
         * Test Case #4
         ************************/
        System.out.println("\tTest Case #4");
        
        // Input values
        origin[0] = 1;
        origin[1] = 1;
        destination[0] = 4;
        destination[1] = 4;
        amtFuel = 1;
        
        // Expected Output
        expResult = -2;
        
        // Call function to test
        result = instance.calcFuelUsed(origin, destination, amtFuel);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
        /*************************
         * Test Case #5
         ************************/
        System.out.println("\tTest Case #5");
        
        // Input values
        origin[0] = 0;
        origin[1] = 0;
        destination[0] = 5;
        destination[1] = 5;
        amtFuel = 7.07;
        
        // Expected Output
        expResult = 7.07;
        
        // Call function to test
        result = instance.calcFuelUsed(origin, destination, amtFuel);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
        
        /*************************
         * Test Case #6
         ************************/
        System.out.println("\tTest Case #6");
        
        // Input values
        origin[0] = 0;
        origin[1] = 0;
        destination[0] = 0;
        destination[1] = 1;
        amtFuel = 2;
        
        // Expected Output
        expResult = 1;
        
        // Call function to test
        result = instance.calcFuelUsed(origin, destination, amtFuel);
        
        // Compare expected return to actual return
        assertEquals(expResult, result, 0.01);
    }
}
