/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.control;

/**
 *
 * @author kyle
 */

import java.util.Random;

public class CrewControl {
    
    public int calcCrewSick(int amtYeoman, int amtFood, int amtWater, int crewSize) {
        
        Random rand = new Random();
        
        int sickChance = 1;
        int random = rand.nextInt(10) + 1;
        int sickCrewman;
        
        if (amtYeoman == 0) {
            sickChance += 2;
        }
        if (amtFood == 0) {
            sickChance += 2;
        }
        if (amtWater == 0) {
            sickChance += 2;
        }
        if (sickChance >= random) {
            sickCrewman = rand.nextInt(crewSize);
        } else {
            sickCrewman = -1;
        }
        return sickCrewman;
    }
    
    public int calcCrewDeath(int amtYeoman, int amtFood, int amtWater, int amtSick) {
        
        Random rand = new Random();
        
        int deathChance = 1;
        int random = rand.nextInt(15) + 1;
        int deadCrewman;
        
        if (amtYeoman == 0) {
            deathChance += 2;
        }
        if (amtFood == 0) {
            deathChance += 2;
        }
        if (amtWater == 0) {
            deathChance += 2;
        }
        if (deathChance >= random) {
            deadCrewman = rand.nextInt(amtSick);
        } else {
            deadCrewman = -1;
        }
        return deadCrewman;
    }
}
