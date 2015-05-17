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
public class ResearchObject implements Serializable{
    
    // class instance variables
    private String description;
    private double infoLearned;

    public ResearchObject() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getInfoLearned() {
        return infoLearned;
    }

    public void setInfoLearned(double infoLearned) {
        this.infoLearned = infoLearned;
    }

    @Override
    public String toString() {
        return "ResearchObject{" + "description=" + description + ", infoLearned=" + infoLearned + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.infoLearned) ^ (Double.doubleToLongBits(this.infoLearned) >>> 32));
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
        final ResearchObject other = (ResearchObject) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.infoLearned) != Double.doubleToLongBits(other.infoLearned)) {
            return false;
        }
        return true;
    }
}
