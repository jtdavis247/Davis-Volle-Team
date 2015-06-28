/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.control;

import byui.cit260.SolarTrails.model.Inventory;
import byui.cit260.SolarTrails.model.InventoryItem;
import byui.cit260.SolarTrails.model.Item;
import byui.cit260.SolarTrails.model.Location;
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
    
    public static InventoryItem[] createInventoryList() {
        
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem food = new InventoryItem();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        inventory[Item.food.ordinal()] = food;
        
        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem fuel = new InventoryItem();
        fuel.setDescription("Fuel");
        fuel.setQuantityInStock(0);
        inventory[Item.fuel.ordinal()] = fuel;
        
        InventoryItem luxuries = new InventoryItem();
        luxuries.setDescription("Luxuries");
        luxuries.setQuantityInStock(0);
        inventory[Item.luxuries.ordinal()] = luxuries;
        
        InventoryItem research = new InventoryItem();
        research.setDescription("Research");
        research.setQuantityInStock(0);
        inventory[Item.research.ordinal()] = research;
        
        return inventory;
        
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

    public static InventoryItem[] getSortedInventoryList() {
        InventoryItem[] originalInventoryList;
        originalInventoryList = SolarTrails.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        InventoryItem[] tempInventoryItem;
        for (int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return null;
    }
    
}
