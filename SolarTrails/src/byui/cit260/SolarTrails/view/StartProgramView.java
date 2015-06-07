/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.view;

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
        String playersName = this.getPlayersName();
        
        //Create a new player 
        //DISPLAY a customized welcome message 
        //DISPLAY the main menu 
    }

    private void displayBanner() {
        System.out.println("*                                                 *"
                       + "\n* Solar Trails takes you on a jouney that will    *"
                       + "\n* blah blah blah blah      *"
                       + "\n* blah blah blah blah      *"
                       + "\n* blah blah blah blah      *" );
    
         System.out.println("*                                                *"
                       + "\n* You will first need to Choose  a ship that you  *"
                       + "\n* feel will best suite your needs. once you have  *"
                       + "\n* chosen a ship you will begin to choose crew     *"
                       + "\n* members that you feel would best fit your       *" 
                       + "\n* journeys needs. You will then choose the        *" 
                       + "\n* resources you feel are nesessary for your crew  *" 
                       + "\n* The resources you choose will effect the        *" 
                       + "\n* events that may happen to you along the way     *" 
                       + "\n* so choose wisely! You will then set sail on     *" 
                       + "\n* your journey to discover this unknow object     *" 
                       + "\n* which could save the world.                     *" );
         System.out.println("*                                                *"
                 + "\n* Good luck! and happy trails!" );
    
}

    private String getPlayersName() {
        boolean valid = false; 
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Enter the player's name below:");
            
            //if the name is invalid (less than two character in length))
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; // amd repeat again
            }
            break; //out of the (exit) repetition
        }
        
        return playersName; // return the name
        }
}
