/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.model;

/**
 *
 * @author jeff
 */
public class Game {
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
    public InventoryItem[] getInventory() {
        return inventory;
    }
    
    
}
