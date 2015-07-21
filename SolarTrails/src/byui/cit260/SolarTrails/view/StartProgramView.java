/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.view;

import byui.cit260.SolarTrails.control.ProgramControl;
import byui.cit260.SolarTrails.model.Player;
import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class StartProgramView {
    public StartProgramView(){
        
    }
    public void startProgram() {
        //Display the banner screen 
        this.displayBanner();
        
        //Get the players name 
        String playerName = this.getPlayerName();
        
        //Create a new player 
        Player player = ProgramControl.createPlayer(playerName);
        
        //DISPLAY a customized welcome message 
        this.displayWelcomeMessage(player);
        
        //DISPLAY the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void displayBanner() {
        System.out.println("*                                                 *"
                       + "\n* Solar Trails takes you on a jouney through the  *"
                       + "\n* solar system, in search for answers about a new *"
                       + "\n* unidentified object that appeared orbiting      *"
                       + "\n* around Uranus. Can you reach the object and     *"
                       + "\n* make it back to Earth before you die of space   *"
                       + "\n* dysentery?                                      *");
        System.out.println("*                                                 *"
                       + "\n* Good luck! and happy trails!                    " );
}

    private String getPlayerName() {
        boolean valid = false; 
        String playerName = null;
        Scanner input = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Please enter your name below:");
            playerName = input.nextLine();
            playerName = playerName.trim();
            
            //if the name is invalid (less than two character in length))
            if (playerName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; // amd repeat again
            }
            break; //out of the (exit) repetition
        }
        
        return playerName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("=============================================");
    }
}
