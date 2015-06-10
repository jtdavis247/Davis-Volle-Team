/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.view;


import byui.cit260.SolarTrails.control.GameControl;
import java.util.Scanner;
import solartrails.SolarTrails;

/**
 *
 * @author jeff
 */
public class ShipMenuView {
    
    private final String SHIP_MENU = "\n"
            + "\n------------------------------------"
            + "\n  Please Choose a ship                "
            + "\n------------------------------------"
            + "\n| Ship Menu                        |"
            + "\n------------------------------------"
            + "\nF - Falcon"
            + "\nD - Discovery"
            + "\nA - Daedalus"
            + "\nQ - Quit"
            + "\n------------------------------------";
    
    public void displayShipMenu() {
        
        char shipSelection = ' ';
        do {
            System.out.println(SHIP_MENU);
            
            String input = this.getInput();
            shipSelection = input.charAt(0);
            
            this.doShipAction(shipSelection);
            
        }while (shipSelection != 'Q');
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
    
    public void doShipAction(char choice) {
        
        switch (choice) {
            case 'F':
                this.displayFalcon();
                break;
            case 'D':
                this.displayDiscovery();
                break;
            case 'A':
                this.displayDaedalus();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void displayFalcon() {
        System.out.println("*** displayFalcon function called ***");
    }

    private void displayDiscovery() {
        System.out.println("*** displayDiscovery function called ***");
    }

    private void displayDaedalus() {
        System.out.println("*** displayDaedalus function called ***");
    }
    
}

