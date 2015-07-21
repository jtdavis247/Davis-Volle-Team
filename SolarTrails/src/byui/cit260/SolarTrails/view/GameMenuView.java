/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.view;

import byui.cit260.SolarTrails.control.GameControl;
import byui.cit260.SolarTrails.model.InventoryItem;

/**
 *
 * @author Kyle
 */
public class GameMenuView extends View {
    
    public GameMenuView(){
      super("\n"
            + "\n------------------------------------"
            + "\n| Game Menu                        |"
            + "\n------------------------------------"
            + "\nD - Display your location"
            + "\nH - Hunt for food and water"
            + "\nF - Harvest fuel"
            + "\nI - View ship inventory"
            + "\nT - Travel"
            + "\nQ - Quit to main menu"
            + "\n------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'D':
                this.displayLocation();
                break;
            case 'H':
                this.displayHuntMenu();
                break;
            case 'F':
                this.displayHarvestFuelMenu();
                break;
            case 'I':
                this.displayInventory();
                break;
            case 'T':
                this.displayTravelMenu();
                break;
            case 'Q':
                this.displayMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayLocation() {
        System.out.println("*** displayLocation function called ***");
    }

    private void displayHuntMenu() {
        System.out.println("*** displayHuntMenu function called ***");
    }

    private void displayHarvestFuelMenu() {
        System.out.println("*** displayHarvestFuelMenu function called ***");
    }

    private void displayTravelMenu() {
        TravelMenuView travelMenu = new TravelMenuView();
        travelMenu.display();
    }
    
    private void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void displayInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" + "Amount");
        
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription());
            System.out.println("\t   ");
            System.out.println(inventoryItem.getAmount());
        }
    }
}
