package com.ramacciotti.builder.concrete_builder;

import com.ramacciotti.builder.builder.IBuilder;
import com.ramacciotti.builder.components.AirConditioning;
import com.ramacciotti.builder.components.Door;
import com.ramacciotti.builder.components.Roof;
import com.ramacciotti.builder.components.Type;
import com.ramacciotti.builder.components.Wall;
import com.ramacciotti.builder.components.Window;
import com.ramacciotti.builder.product.Apartment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>* Provides different implementations of the build steps. </p>
 * <p>* Concrete builders can produce products that don't follow the common interface.</p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApartmentBuilder implements IBuilder {

    private Door door;

    private Window window;

    private Roof roof;

    private Wall wall;

    private AirConditioning airConditioning;

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setWall(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void setAirConditioning(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    public Apartment gerResult() {
        return new Apartment(Type.APARTMENT, door, wall, roof, window, airConditioning);
    }

}
