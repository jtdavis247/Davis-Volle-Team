/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.view;

import byui.cit260.SolarTrails.control.GameControl;
import byui.cit260.SolarTrails.control.MapControl;
import byui.cit260.SolarTrails.model.Discovery;
import byui.cit260.SolarTrails.model.Ship;
import java.lang.reflect.Array;
import java.util.Scanner;
import solartrails.SolarTrails;

/**
 *
 * @author jeff
 */
public class TravelMenuView extends View{
    
    public TravelMenuView(){
    super( "\n"
            + "\n------------------------------------"
            + "\n  Where would you like to Travel to?"
            + "\n------------------------------------"
            + "\n| Ship Menu                        |"
            + "\n------------------------------------"
            + "\nF - place one"
            + "\nD - place two"
            + "\nA - place three"
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
                this.displayTimeLapsed();
                break;
            case 'D':
                this.displayLocationMenu();
                break;
            case 'A':
                this.displayLocationMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayLocationMenu() {
        System.out.println("*** displayLocationMenu function called ***");
    }

    private void displayTimeLapsed() {
     System.out.println("*** displayLocationMenu function called ***");    
    }
}
    
