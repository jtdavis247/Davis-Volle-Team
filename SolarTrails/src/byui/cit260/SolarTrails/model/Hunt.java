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
public class Hunt implements Serializable{
    
    // class instance variables
    private String description;
    private double foodAvailable;
    private double waterAvailable;

    public Hunt() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFoodAvailable() {
        return foodAvailable;
    }

    public void setFoodAvailable(double foodAvailable) {
        this.foodAvailable = foodAvailable;
    }

    public double getWaterAvailable() {
        return waterAvailable;
    }

    public void setWaterAvailable(double waterAvailable) {
        this.waterAvailable = waterAvailable;
    }

    @Override
    public String toString() {
        return "Hunt{" + "description=" + description + ", foodAvailable=" + foodAvailable + ", waterAvailable=" + waterAvailable + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.foodAvailable) ^ (Double.doubleToLongBits(this.foodAvailable) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.waterAvailable) ^ (Double.doubleToLongBits(this.waterAvailable) >>> 32));
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
        final Hunt other = (Hunt) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.foodAvailable) != Double.doubleToLongBits(other.foodAvailable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.waterAvailable) != Double.doubleToLongBits(other.waterAvailable)) {
            return false;
        }
        return true;
    }
}
