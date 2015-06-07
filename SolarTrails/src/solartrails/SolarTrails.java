/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrails;


import byui.cit260.SolarTrails.model.Player;
import byui.cit260.SolarTrails.model.Ship;
import byui.cit260.SolarTrails.model.Falcon;
import byui.cit260.SolarTrails.model.Discovery;
import byui.cit260.SolarTrails.model.Daedalus;
import byui.cit260.SolarTrails.model.Crew;
import byui.cit260.SolarTrails.model.Actor;
import byui.cit260.SolarTrails.model.CrewMember;
import byui.cit260.SolarTrails.model.Engineer;
import byui.cit260.SolarTrails.model.HarvestFuel;
import byui.cit260.SolarTrails.model.Hunt;
import byui.cit260.SolarTrails.model.Yeoman;
import byui.cit260.SolarTrails.model.Inventory;
import byui.cit260.SolarTrails.model.Map;
import byui.cit260.SolarTrails.model.Location;
import byui.cit260.SolarTrails.model.ObjectScene;
import byui.cit260.SolarTrails.model.OpenSpaceScene;
import byui.cit260.SolarTrails.model.PlanetScene;
import byui.cit260.SolarTrails.model.RandomEvent;
import byui.cit260.SolarTrails.model.RepairShip;
import byui.cit260.SolarTrails.model.ResearchObject;
import byui.cit260.SolarTrails.view.StartProgramView;

/**
 *
 * @author jeff
 */
public class SolarTrails {

    private static Game currentGame = null;
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SolarTrails.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SolarTrails.player = player;
    }
    
}
