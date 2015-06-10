/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.view;

import byui.cit260.SolarTrails.control.GameControl;
import java.util.Scanner;
import solartrails.SolarTrails;
/*
 *
 * @author Kyle
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n| Main Menu                        |"
            + "\n------------------------------------"
            + "\nG - Start Game"
            + "\nH - Help"
            + "\nS - Save Game"
            + "\nL - Load Game"
            + "\nE - Exit"
            + "\n------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        }while (selection != 'E');
        
    }
    
    private String getInput() {
        
        boolean valid = false; 
        String selection = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your selection below:");
        selection = input.nextLine();
        selection = selection.trim();
        return selection; // return the name
    }
    
    
    public void doAction(char choice) {
        
        switch (choice) {
            case 'G':
                this.displayShipMenu();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'L':
                this.loadGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void startGame() {
        // Create a new game
        GameControl.createNewGame(SolarTrails.getPlayer());
        
        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void displayHelpMenu() {
        
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }
    
      private void displayShipMenu() {
        
        ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.displayShipMenu();
    }
    
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
    private void loadGame() {
        System.out.println("*** loadGame function called ***");
    }

}
