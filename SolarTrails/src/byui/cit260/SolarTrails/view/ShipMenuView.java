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
public class ShipMenuView extends View{
    
    public ShipMenuView(){
    super( "\n"
            + "\n------------------------------------"
            + "\n  Please Choose a ship                "
            + "\n------------------------------------"
            + "\n| Ship Menu                        |"
            + "\n------------------------------------"
            + "\nF - Falcon"
            + "\nD - Discovery"
            + "\nA - Daedalus"
            + "\nQ - Quit"
            + "\n------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'F':
                this.displayCrewMenu();
                break;
            case 'D':
                this.displayCrewMenu();
                break;
            case 'A':
                this.displayCrewMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void displayCrewMenu() {
        CrewMenuView crewMenu = new CrewMenuView();
        crewMenu.display();
    }
    
    
}

