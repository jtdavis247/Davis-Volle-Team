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
public class HelpMenuView extends View {
    
    public HelpMenuView(){
        super( "\n"
                + "\n------------------------------------"
                + "\n| Help Menu                        |"
                + "\n------------------------------------"
                + "\nO - Overview"
                + "\nS - Scientist Specializations"
                + "\nT - Travel"
                + "\nL - Locations"
                + "\nF - Harvesting fuel"
                + "\nH - Hunt for food and water"
                + "\nQ - Quit"
                + "\n------------------------------------");
    }

    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'O':
                this.displayOverview();
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
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayOverview() {
        System.out.println("*                                                 *"
                       + "\n* Solar Trails takes you on a jouney through the  *"
                       + "\n* solar system, in search for answers about a new *"
                       + "\n* unidentified object that appeared orbiting      *"
                       + "\n* around Uranus. Can you reach the object and     *"
                       + "\n* make it back to Earth before you die of space   *"
                       + "\n* dysentery?                                      *");
    }
    
    private void displaySpec() {
        System.out.println("*                                                 *"
                       + "\n* You will be given a team of six specialists.    *"
                       + "\n* First, there are the engineering specialists.   *"
                       + "\n* They keep the ship in shape and also provide    *"
                       + "\n* services like fuel harvesting. Next there's the *"
                       + "\n* Yeomans. They keep your crew healthy and        *"
                       + "\n* prevent illness and death, along with hunting   *"
                       + "\n* food and water. Finally, there's the            *"
                       + "\n* researchers. These scientists will speed up the *"
                       + "\n* recovery of information when you reach the      *"
                       + "\n* alien object.  You will have two of  each type  *"
                       + "\n* of specialist on your crew at the start of a    *"
                       + "\n* new game.                                       *");
    }

    private void displayTravel() {
        System.out.println("*                                                 *"
                       + "\n* The system map is set up as a 10 x 10 grid. You *"
                       + "\n* will have the option to view the system map on  *"
                       + "\n* the travel screen, which will show you where    *"
                       + "\n* the planets are and where you are, along with   *"
                       + "\n* coordinates for each space on the map.  You     *"
                       + "\n* will need to pick a space to move to, the enter *"
                       + "\n* those coordinates to travel. Be careful you     *"
                       + "\n* don't venture too far at once, as each movement *"
                       + "\n* will cost fuel, food and water, and luxuries,   *"
                       + "\n* dependent on how far you travel. It is wise to  *"
                       + "\n* stop at planets to harvest fuel and hunt for    *"
                       + "\n* food and water in order to survive.             *");
    }

    private void displayLocations() {
        System.out.println("*                                                 *"
                       + "\n* Space is big, and there's a lot of it. You      *"
                       + "\n* don't want to travel to the middle of nowhere,  *"
                       + "\n* or all you'll find is a whole lot of nothing.   *"
                       + "\n* You'll find several locations scattered around  *"
                       + "\n* the map. Each of these locations represent a    *"
                       + "\n* planet, moon, or asteroid belt.                 *"
                       + "\n* At these locations, you'll be able to harvest   *"
                       + "\n* fuel and hunt for food and water. Without       *"
                       + "\n* these, you'll find it hard to survive. As food  *"
                       + "\n* and water disappears, chances of contracting    *"
                       + "\n* space dysentery increase, along with the chance *"
                       + "\n* of death. You are also limited on how far you   *"
                       + "\n* can travel by how much fuel you have left.      *");
    }

    private void displayHarvestFuel() {
        System.out.println("*                                                 *"
                       + "\n* Fuel is precious, it's what allows your ship to *"
                       + "\n* change course and find your way to your goal.   *"
                       + "\n* with no fuel, you can become stranded and die.  *"
                       + "\n* At each important location, you have the option *"
                       + "\n* to harvest fuel.  Don't ask us how it works, we *"
                       + "\n* aren't the sciencey types. The amount of fuel   *"
                       + "\n* you can harvest at each location can be         *"
                       + "\n* increased by the amount of engineers you have.  *"
                       + "\n* don't let them die!                             *");
    }

    private void displayHunt() {
        System.out.println("*                                                 *"
                       + "\n* How do you find food and water in space, you    *"
                       + "\n* ask? Well, you hunt for it! Space buffalo have  *"
                       + "\n* been found roaming through all the planets and  *"
                       + "\n* moons in the solar system. That accounts for    *"
                       + "\n* food, but what about water? Well, some of those *"
                       + "\n* space buffalo are actually space water buffalo. *"
                       + "\n* Don't believe me? Well, you'll be changing your *"
                       + "\n* tune when they're what you'll be surviving on   *"
                       + "\n* during your trip. Your yeomans will increase    *"
                       + "\n* amount of food and water you can retrieve at    *"
                       + "\n* each location, so be sure to keep them alive!   *");
    }

}
