/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrails;

import byui.cit260.SolarTrails.model.Player;

/**
 *
 * @author jeff
 */
public class SolarTrails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Mr. Davis");
        playerOne.setHighScore(1200.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
