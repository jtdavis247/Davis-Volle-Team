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
import byui.cit260.SolarTrails.view.ErrorView;
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
    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        
        try (FileOutStream fops = new FileOutStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to file
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }
    private void startSavedGame () {
    
        // prompt for and get the name of the file to save the game in
        System.out.println("\n\Enter the file path for the file where the game is saved "
                            + "is to be saved");
        
        String filePAth = this.getImput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (exception ex) {
            ErrorView.display("MainMenuView", ex. getMessage());
        }
        
        // display the game Menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    public static void loadGame(String filepath)
            throws GameControlException {
    Game game = null;
    try(FileInputStream fips = new FileInputStream(filepath)) {
        ObjectInputStream output = new ObjectInputStream(fips);
        
        game = (Game) output.readObject(); // read the game object from file
        
    } catch(FileNotFoundException fnfe) {
        throw new GameControlException(fnfe.getMEssage());
    }
    catch(Exception e) {
        throw new GameControlException(e.getMessage());
    }
    catch(Exception e) {
        throw new GameControlException(e.getMessage());
    }
    
    //close the output file
    
    SolarTrails.setCurrentGame(game);
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
