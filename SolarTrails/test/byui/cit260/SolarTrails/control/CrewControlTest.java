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
public class CrewControlTest {
    
    public CrewControlTest() {
    }

    /**
     * Test of calcCrewSick method, of class CrewControl.
     * 
     * NOTE: Due to the random nature of this test, it will almost always
     * fail.  In order to test properly, run several times to make sure
     * result changes between -1 and crewSize.
     */
    @Test
    public void testCalcCrewSick() {
        System.out.println("calcCrewSick");
        
        /*************************
         * Test Case #1
         ************************/
        System.out.println("\tTest Case #1");
        
        // Input values
        int amtYeoman = 1;
        int amtFood = 0;
        int amtWater = 8;
        int crewSize = 6;
        
        // Expected Output
        int expResult = 0;
        
        // Create instance of class
        CrewControl instance = new CrewControl();
        
        // Call function to test
        int result = instance.calcCrewSick(amtYeoman, amtFood, amtWater, crewSize);
        
        // Compare expected return to actual return
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcCrewDeath method, of class CrewControl.
     * 
     * NOTE: Due to the random nature of this test, it will almost always
     * fail.  In order to test properly, run several times to make sure
     * result changes between -1 and amtSick.
     */
    @Test
    public void testCalcCrewDeath() {
        System.out.println("calcCrewDeath");
        /*************************
         * Test Case #1
         ************************/
        System.out.println("\tTest Case #1");
        
        // Input values
        int amtYeoman = 1;
        int amtFood = 0;
        int amtWater = 8;
        int amtSick = 6;
        
        // Expected Output
        int expResult = 0;
        
        // Create instance of class
        CrewControl instance = new CrewControl();
        
        // Call function to test
        int result = instance.calcCrewSick(amtYeoman, amtFood, amtWater, amtSick);
        
        // Compare expected return to actual return
        assertEquals(expResult, result);
    }
    
}
