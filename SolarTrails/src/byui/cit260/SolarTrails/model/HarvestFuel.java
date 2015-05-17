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
public class HarvestFuel implements Serializable{
    
    // class instance variables
    private String description;
    private double fuelAvailable;

    public HarvestFuel() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFuelAvailable() {
        return fuelAvailable;
    }

    public void setFuelAvailable(double fuelAvailable) {
        this.fuelAvailable = fuelAvailable;
    }

    @Override
    public String toString() {
        return "HarvestFuel{" + "description=" + description + ", fuelAvailable=" + fuelAvailable + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.fuelAvailable) ^ (Double.doubleToLongBits(this.fuelAvailable) >>> 32));
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
        final HarvestFuel other = (HarvestFuel) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuelAvailable) != Double.doubleToLongBits(other.fuelAvailable)) {
            return false;
        }
        return true;
    }
}
