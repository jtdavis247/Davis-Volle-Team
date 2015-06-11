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
public class CrewMenuView {
     private final String CREW_MENU = "\n"
            + "\n------------------------------------"
            + "\n  Please Select your crew                "
            + "\n------------------------------------"
            + "\n| Crew Menu                        |"
            + "\n------------------------------------"
            + "\nR - Researcher"
            + "\nE - Engineer"
            + "\nY - Yeoman"
            + "\nQ - Quit"
            + "\n------------------------------------";
    
    public void displayCrewMenu() {
        
        char crewSelection = ' ';
        do {
            System.out.println(CREW_MENU);
            
            String input = this.getInput();
            crewSelection = input.charAt(0);
            
            this.doCrewAction(crewSelection);
            
        }while (crewSelection != 'Q');
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
    
    public void doCrewAction(char choice) {
        
        switch (choice) {
            case 'R':
                this.displayResearcher();
                break;
            case 'E':
                this.displayEngineer();
                break;
            case 'Y':
                this.displayYeoman();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void displayResearcher() {
        System.out.println("*** displayResearcher function called ***");
    }

    private void displayEngineer() {
        System.out.println("*** displayEngineer function called ***");
    }

    private void displayYeoman() {
        System.out.println("*** displayYeoman function called ***");
    }
    
}
