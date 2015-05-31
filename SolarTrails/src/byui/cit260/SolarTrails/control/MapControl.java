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

import java.text.DecimalFormat;

public class MapControl {
    
    public double calcTimeLapsed(int[] origin, int[] destination, int shipSpeed) {
        
        DecimalFormat round = new DecimalFormat("#.##");
        
        double distance;
        double timeLapsed;
        
        if (origin[0] == destination[0] && origin[1] == destination[1]) {
            return -1;
        } else {
            distance = Math.sqrt(Math.pow((destination[0] - origin[0]), 2) + Math.pow((destination[1] - origin[1]), 2));
            timeLapsed = distance / shipSpeed;
        }
        timeLapsed = Double.parseDouble(round.format(timeLapsed));
        return timeLapsed;
    }
    
}
