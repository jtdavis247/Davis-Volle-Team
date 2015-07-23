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
public class Daedalus implements Serializable{
    
    private String name;
    private String description;
    private final int minCrew;
    private final int maxCrew;
    private double cargoCapacity;
    private int speed;

    public Daedalus() {
        this.name = "\nDaedalus";
        this.description = "\nThis is the space program's flagship.  It may be slow, but "
                         + "\n it has plenty of space for crew and cargo.";
        this.minCrew = 4;
        this.maxCrew = 7;
        this.cargoCapacity = 75;
        this.speed = 1;
        
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
        return "Daedalus{" + "name=" + name + ", description=" + description + ", cargoCapacity=" + cargoCapacity + ", Speed=" + speed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.cargoCapacity);
        hash = 29 * hash + Objects.hashCode(this.speed);
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
        final Daedalus other = (Daedalus) obj;
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
