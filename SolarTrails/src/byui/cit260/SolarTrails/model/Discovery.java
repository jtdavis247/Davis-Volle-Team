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
    private Double cargoCapacity;
    private Double Speed;

    public Discovery() {
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

    public Double getSpeed() {
        return Speed;
    }

    public void setSpeed(Double Speed) {
        this.Speed = Speed;
    }

    @Override
    public String toString() {
        return "Discovery{" + "name=" + name + ", description=" + description + ", cargoCapacity=" + cargoCapacity + ", Speed=" + Speed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.cargoCapacity);
        hash = 71 * hash + Objects.hashCode(this.Speed);
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
        if (!Objects.equals(this.Speed, other.Speed)) {
            return false;
        }
        return true;
    }
    
    
}
