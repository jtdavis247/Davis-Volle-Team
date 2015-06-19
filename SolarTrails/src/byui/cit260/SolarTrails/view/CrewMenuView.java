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
public class CrewMenuView extends View {
    
    public CrewMenuView(){
     super( "\n"
            + "\n------------------------------------"
            + "\n  Please Select your crew                "
            + "\n------------------------------------"
            + "\n| Crew Menu                        |"
            + "\n------------------------------------"
            + "\nR - Researcher"
            + "\nE - Engineer"
            + "\nY - Yeoman"
            + "\nQ - Quit"
            + "\n------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
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
