/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.model;

import java.io.Serializable;

/**
 *
 * @author Kyle
 */
public enum InventoryItem implements Serializable{
    
    Food("The stuff you eat."),
    Water("The stuff you drink."),
    Fuel("The stuff that makes your ship go."),
    Luxuries("The stuff that keeps you sane on a long journey."),
    Researh("This can only be gained by studying the alien object.");
    
    private String inventoryType;
    private double typeQuantity;

    InventoryItem(String inventoryType) {
        this.inventoryType = inventoryType;
        typeQuantity = 0;
    }
    
    public void setDescription(String research) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAmount() {
        return 0;
    }
    
}

