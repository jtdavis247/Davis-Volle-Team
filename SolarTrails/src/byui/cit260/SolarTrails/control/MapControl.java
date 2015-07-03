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

import byui.cit260.SolarTrails.model.Map;
import byui.cit260.SolarTrails.model.Scene;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class MapControl {

    public static Map createMap() {
        
        Map map = new Map(10, 10);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
        
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static ImageIcon getImage(Scene startingScene, String byuicit260SolarTrailsimagesearthjpg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double calcTimeLapsed(int[] origin, int[] destination, int shipSpeed) 
        throws MapControlException{
        
        DecimalFormat round = new DecimalFormat("#.##");
        
        double distance;
        double timeLapsed;
        
        if (origin[0] == destination[0] && origin[1] == destination[1]) {
            throw new MapControlException("You player has not moved.");
        } else {
            distance = Math.sqrt(Math.pow((destination[0] - origin[0]), 2) + Math.pow((destination[1] - origin[1]), 2));
            timeLapsed = distance / shipSpeed;
        }
        timeLapsed = Double.parseDouble(round.format(timeLapsed));
        return timeLapsed;
    }
    
}
