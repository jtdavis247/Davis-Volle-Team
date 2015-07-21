/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrails;

import byui.cit260.SolarTrails.model.InventoryItem;
import byui.cit260.SolarTrails.control.InventoryControl;
import byui.cit260.SolarTrails.model.Map;
import byui.cit260.SolarTrails.model.Player;
import byui.cit260.SolarTrails.model.Ship;
import java.io.Serializable;

/**
 *
 * @author Kyle
 */
public class Game implements Serializable {
    
    private double totalTime;
    private Ship ship;
    private InventoryItem[] inventory;
    private Player player;
    private String[] actors;
    private Map map;

    public Game() {
    }
    
    public double getTotalTime() {
        return totalTime;
    }
    
    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setInventory(InventoryItem[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InventoryItem[] getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
