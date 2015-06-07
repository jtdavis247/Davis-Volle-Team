/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.control;

import byui.cit260.SolarTrails.model.Player;
import solartrails.SolarTrails;

/**
 *
 * @author Kyle
 */
public class ProgramControl {

    public static Player createPlayer(String playerName) {
        
        if (playerName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        SolarTrails.setPlayer(player);
        
        return player;
    }
    
}
