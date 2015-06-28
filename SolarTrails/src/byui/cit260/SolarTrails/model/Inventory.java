/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kyle
 */
public enum Inventory implements Serializable{
    
    Food("The stuff you eat."),
    Water("The stuff you drink."),
    Fuel("The stuff that makes your ship go."),
    Luxuries("The stuff that keeps you sane on a long journey."),
    Researh("This can only be gained by studying the alien object.");
    
    private String inventoryType;
    private double typeQuantity;

    Inventory(String inventoryType) {
        this.inventoryType = inventoryType;
        typeQuantity = 0;
    }
    
}
