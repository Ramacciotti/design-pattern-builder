package com.ramacciotti.builder.director;

import com.ramacciotti.builder.builder.IBuilder;
import com.ramacciotti.builder.components.AirConditioning;
import com.ramacciotti.builder.components.Door;
import com.ramacciotti.builder.components.Roof;
import com.ramacciotti.builder.components.Wall;
import com.ramacciotti.builder.components.Window;

/**
 * <p>* This class defines the order in which construction steps are called, so you can create and reuse product-specific configurations.</p>
 */
public class Director {

    public void constructHouse(IBuilder buider){
        buider.setDoor(new Door("dark wood", 2.10, 60.0));
        buider.setWindow(new Window("sliding", 15.0, 15.0));
        buider.setWall(new Wall("concrete", "light brown"));
        buider.setRoof(new Roof("clay", "red"));
    }

    public void constructApartment(IBuilder buider){
        buider.setDoor(new Door("light wood", 2.10, 60.0));
        buider.setWindow(new Window("colonial", 15.0, 15.0));
        buider.setWall(new Wall("brick", "gray"));
        buider.setRoof(new Roof("metal", "gray"));
        buider.setAirConditioning(new AirConditioning("portable"));
    }

}
