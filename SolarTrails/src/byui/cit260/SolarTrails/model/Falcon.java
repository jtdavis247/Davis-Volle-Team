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
public class Falcon implements Serializable{
    //Instance Variables
    private String name;
    private String description;
    private int minCrew;
    private int maxCrew;
    private double cargoCapacity;
    private int speed;

    public Falcon() {
        this.name = "\nFalcon";
        this.description = "\nThis is the fastest ship available.  It sacrifices cargo and"
                         + "\ncrew capacity for faster travels.";
        this.minCrew = 2;
        this.maxCrew = 3;
        this.cargoCapacity = 20;
        this.speed = 3;
        
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

    public Double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(Double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Falcon{" + "name=" + name + ", description=" + description + ", cargoCapacity=" + cargoCapacity + ", Speed=" + speed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.cargoCapacity);
        hash = 97 * hash + Objects.hashCode(this.speed);
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
        final Falcon other = (Falcon) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.cargoCapacity, other.cargoCapacity)) {
            return false;
        }
        if (!Objects.equals(this.speed, other.speed)) {
            return false;
        }
        return true;
    }
    
    
}
