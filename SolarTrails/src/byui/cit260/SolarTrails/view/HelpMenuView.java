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
 * @author Kyle
 */
public class HelpMenuView {
    
    private final String HELP_MENU = "\n"
            + "\n------------------------------------"
            + "\n| Help Menu                        |"
            + "\n------------------------------------"
            + "\nO - Overview"
            + "\nP - Planning your trip"
            + "\nS - Scientist Specializations"
            + "\nT - Travel"
            + "\nL - Locations"
            + "\nF - Harvesting fuel"
            + "\nH - Hunt for food and water"
            + "\nQ - Quit"
            + "\n------------------------------------";

    public void displayHelpMenu() {
        
        char helpSelection = ' ';
        do {
            System.out.println(HELP_MENU);
            
            String input = this.getInput();
            helpSelection = input.charAt(0);
            
            this.doHelpAction(helpSelection);
            
        }while (helpSelection != 'Q');
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
    
    public void doHelpAction(char choice) {
        
        switch (choice) {
            case 'O':
                this.displayOverview();
                break;
            case 'P':
                this.displayPlanning();
                break;
            case 'S':
                this.displaySpec();
                break;
            case 'T':
                this.displayTravel();
                break;
            case 'L':
                this.displayLocations();
                break;
            case 'F':
                this.displayHarvestFuel();
                break;
            case 'H':
                this.displayHunt();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayOverview() {
        System.out.println("*** displayOverview function called ***");
    }

    private void displayPlanning() {
        System.out.println("*** displayPlanning function called ***");
    }

    private void displaySpec() {
        System.out.println("*** displaySpec function called ***");
    }

    private void displayTravel() {
        System.out.println("*** displayTravel function called ***");
    }

    private void displayLocations() {
        System.out.println("*** displayLocations function called ***");
    }

    private void displayHarvestFuel() {
        System.out.println("*** displayHarvestFuel function called ***");
    }

    private void displayHunt() {
        System.out.println("*** displayHunt function called ***");
    }

}
