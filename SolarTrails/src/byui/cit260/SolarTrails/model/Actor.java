/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jeff
 */
public enum Actor implements Serializable {
    
    NOVA("This is the ship's low-functioning AI, in charge of monitoring systems."),
    Conscience("This is you, talking in your head.  You are pretty smart, you know.  You should listen to yourself.");
    
    private final String description;
    private final Point coordinates; 

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
}
