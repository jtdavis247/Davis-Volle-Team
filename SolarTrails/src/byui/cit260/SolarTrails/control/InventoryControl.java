/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.control;

import java.text.DecimalFormat;

/**
 *
 * @author jeff
 */
public class InventoryControl {
    
    public double calcFoodUsed(double timeLapsed, int crewSize, int food) {
      
      double foodUsed = 0;
      if (timeLapsed > 0 && crewSize > 0) {
            foodUsed = (timeLapsed * crewSize);
       }
      if  (foodUsed > food) {
            return -1;
       }
      else
            return foodUsed;
        
    }
    
    public double calcFuelUsed(int[] origin, int[] destination, double amtFuel) {
        
        DecimalFormat round = new DecimalFormat("#.##");
        
        double distance;
        double fuelUsed;
        
        if (origin[0] == destination[0] && origin[1] == destination[1]) {
            return -1;
        }
        
        distance = Math.sqrt(Math.pow((destination[0] - origin[0]), 2) + Math.pow((destination[1] - origin[1]), 2));
        fuelUsed = Double.parseDouble(round.format(distance));
        
        if (amtFuel < fuelUsed){
            return -2;
        }
        
        return fuelUsed;
    }
}