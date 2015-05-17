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
public class Crew implements Serializable{
    private int crewSize;
    private Double crewComposition;

    public Crew() {
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public Double getCrewComposition() {
        return crewComposition;
    }

    public void setCrewComposition(Double crewComposition) {
        this.crewComposition = crewComposition;
    }

    @Override
    public String toString() {
        return "Crew{" + "crewSize=" + crewSize + ", crewComposition=" + crewComposition + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.crewSize;
        hash = 23 * hash + Objects.hashCode(this.crewComposition);
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
        final Crew other = (Crew) obj;
        if (this.crewSize != other.crewSize) {
            return false;
        }
        if (!Objects.equals(this.crewComposition, other.crewComposition)) {
            return false;
        }
        return true;
    }
    

}
