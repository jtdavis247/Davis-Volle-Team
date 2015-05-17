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
public class Inventory implements Serializable{
    
    // class instance variables
    private String inventoryType;
    private double typeQuantity;

    public Inventory() {
    }
    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getTypeQuantity() {
        return typeQuantity;
    }

    public void setTypeQuantity(double typeQuantity) {
        this.typeQuantity = typeQuantity;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", typeQuantity=" + typeQuantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.inventoryType);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.typeQuantity) ^ (Double.doubleToLongBits(this.typeQuantity) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.typeQuantity) != Double.doubleToLongBits(other.typeQuantity)) {
            return false;
        }
        return true;
    }
}
