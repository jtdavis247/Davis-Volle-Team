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
public class RepairShip implements Serializable{
    
    // class instance variables
    private double damage;
    private double amountRepaired;

    public RepairShip() {
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getAmountRepaired() {
        return amountRepaired;
    }

    public void setAmountRepaired(double amountRepaired) {
        this.amountRepaired = amountRepaired;
    }

    @Override
    public String toString() {
        return "RepairShip{" + "damage=" + damage + ", amountRepaired=" + amountRepaired + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.damage) ^ (Double.doubleToLongBits(this.damage) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.amountRepaired) ^ (Double.doubleToLongBits(this.amountRepaired) >>> 32));
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
        final RepairShip other = (RepairShip) obj;
        if (Double.doubleToLongBits(this.damage) != Double.doubleToLongBits(other.damage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRepaired) != Double.doubleToLongBits(other.amountRepaired)) {
            return false;
        }
        return true;
    }
}
