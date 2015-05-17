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
 * @author jeff
 */
public class Ship implements Serializable {
    
    //Class instance variables
    private String name;
    private String description;
    private int minCrew;
    private int maxCrew;
    private double cargoCapacity;
    private double speed;

    public Ship() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinCrew() {
        return minCrew;
    }

    public void setMinCrew(int minCrew) {
        this.minCrew = minCrew;
    }

    public int getMaxCrew() {
        return maxCrew;
    }

    public void setMaxCrew(int maxCrew) {
        this.maxCrew = maxCrew;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ship{" + "name=" + name + ", description=" + description + ", minCrew=" + minCrew + ", maxCrew=" + maxCrew + ", cargoCapacity=" + cargoCapacity + ", speed=" + speed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + this.minCrew;
        hash = 59 * hash + this.maxCrew;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.cargoCapacity) ^ (Double.doubleToLongBits(this.cargoCapacity) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
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
        final Ship other = (Ship) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.minCrew != other.minCrew) {
            return false;
        }
        if (this.maxCrew != other.maxCrew) {
            return false;
        }
        if (Double.doubleToLongBits(this.cargoCapacity) != Double.doubleToLongBits(other.cargoCapacity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
