/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.control;

import byui.cit260.SolarTrails.exceptions.MapControlException;

import byui.cit260.SolarTrails.model.InventoryItem;

import byui.cit260.SolarTrails.model.Map;
import byui.cit260.SolarTrails.model.Player;
import byui.cit260.SolarTrails.model.Scene;
import byui.cit260.SolarTrails.model.SceneType;
import byui.cit260.SolarTrails.model.Ship;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import solartrails.Game;
import solartrails.SolarTrails;

/**
 *
 * @author jeff
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        SolarTrails.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
    }
    //close the output file
    
    private static Scene[] createScenes() throws MapControlException {
        BufferedImage image = null;
        
        Game game = SolarTrails.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "\nAh, Earth, sweet Earth. Don't come back unless you have learned "
                + "what you can from the alien object.");
        startingScene.setMapSymbol("S");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(1);
        ImageIcon startSceneImage = MapControl.getImage(startingScene, "/byui.cit260.SolarTrails/images/earth.jpg");
        
        // TODO: Create all scenes
        
        return scenes;
    }

    private static InventoryItem[] createInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static InventoryItem[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game currentGame, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
