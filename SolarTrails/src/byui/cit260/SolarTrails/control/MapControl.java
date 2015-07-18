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

import byui.cit260.SolarTrails.model.Actor;
import byui.cit260.SolarTrails.model.Location;
import byui.cit260.SolarTrails.model.Map;
import byui.cit260.SolarTrails.model.Scene;
import byui.cit260.SolarTrails.model.SceneType;
import java.awt.Point;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class MapControl {

    public static Map createMap() {
        
        Map map = new Map(10, 10);
        
        Scene[] scenes = createScenes();
        
        assignScenesToLocations(map, scenes);
        
        return map;
        
    }
     static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.mercury.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.start.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.asteroids.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.moon.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.finish.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.io.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.europa.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.venus.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.jupiter.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.sun.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.ganymede.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.mars.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.neptune.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.empty.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.empty.ordinal()]);
        locations[8][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.pluto.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.empty.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.empty.ordinal()]);
        locations[9][0].setScene(scenes[SceneType.object.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.eris.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.empty.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.empty.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.empty.ordinal()]);
        
    }
    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static ImageIcon getImage(Scene startingScene, String byuicit260SolarTrailsimagesearthjpg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int moveActorToLocation(Actor actor, Point coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static double calcTimeLapsed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double calcTimeLapsed(int[] origin, int[] destination, int shipSpeed) 
        throws MapControlException{
        
        DecimalFormat round = new DecimalFormat("#.##");
        
        double distance;
        double timeLapsed;
        
        if (origin[0] == destination[0] && origin[1] == destination[1]) {
            throw new MapControlException("Your player has not moved.");
        } else {
            distance = Math.sqrt(Math.pow((destination[0] - origin[0]), 2) + Math.pow((destination[1] - origin[1]), 2));
            timeLapsed = distance / shipSpeed;
        }
        timeLapsed = Double.parseDouble(round.format(timeLapsed));
        return timeLapsed;
    }
    
    public static int moveActorsToStartingLocation(Map map) 
                        throws MapControlException {
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            int returnValue = MapControl.moveActorToLocation(actor, coordinates);
            
        }
        return 0;
    }
    
}
