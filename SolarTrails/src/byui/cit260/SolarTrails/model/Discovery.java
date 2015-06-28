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
public class Discovery implements Serializable{
    private String name;
    private String description;
    private int minCrew;
    private int maxCrew;
    private double cargoCapacity;
    private int speed;

    public Discovery() {
        this.name = "\nDiscovery";
        this.description = "\nThis is a well balanced ship.  It offers enough space for"
                         + "\n a full crew, plenty of cargo, and travels at a good speed.";
        this.minCrew = 3;
        this.maxCrew = 5;
        this.cargoCapacity = 40;
        this.speed = 2;
        
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
        return "Discovery{" + "name=" + name + ", description=" + description + ", cargoCapacity=" + cargoCapacity + ", Speed=" + speed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.cargoCapacity);
        hash = 71 * hash + Objects.hashCode(this.speed);
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
        final Discovery other = (Discovery) obj;
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
