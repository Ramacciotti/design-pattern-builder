package com.ramacciotti.builder.builder;

import com.ramacciotti.builder.components.AirConditioning;
import com.ramacciotti.builder.components.Door;
import com.ramacciotti.builder.components.Roof;
import com.ramacciotti.builder.components.Wall;
import com.ramacciotti.builder.components.Window;

/**
 * <p>* The Builder interface declares product building steps that are common to all types of builders.</p>
 */
public interface IBuilder {

    void setDoor(Door door);

    void setWindow(Window window);

    void setRoof(Roof roof);

    void setWall(Wall wall);

    void setAirConditioning(AirConditioning airConditioning);

}
