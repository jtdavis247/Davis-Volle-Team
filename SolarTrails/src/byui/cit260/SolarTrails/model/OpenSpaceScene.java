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
public class OpenSpaceScene implements Serializable{
    
    // class instance variables
    private String description;
    private double travelTime;
    private String availableActions;

    public OpenSpaceScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getAvailableActions() {
        return availableActions;
    }

    public void setAvailableActions(String availableActions) {
        this.availableActions = availableActions;
    }

    @Override
    public String toString() {
        return "OpenSpaceScene{" + "description=" + description + ", travelTime=" + travelTime + ", availableActions=" + availableActions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.availableActions);
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
        final OpenSpaceScene other = (OpenSpaceScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.availableActions, other.availableActions)) {
            return false;
        }
        return true;
    }
}
