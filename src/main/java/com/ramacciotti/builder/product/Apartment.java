package com.ramacciotti.builder.product;

import com.ramacciotti.builder.components.AirConditioning;
import com.ramacciotti.builder.components.Door;
import com.ramacciotti.builder.components.Roof;
import com.ramacciotti.builder.components.Type;
import com.ramacciotti.builder.components.Wall;
import com.ramacciotti.builder.components.Window;

/**
 * <p>* Represents the result object.</p>
 */
public record Apartment(Type type, Door door, Wall wall, Roof roof, Window window, AirConditioning airConditioning) {

    public String printResult() {
        return door.toString() + " / " + window.toString() + " / " + wall.toString() + " / " + roof.toString() + " / " + airConditioning.toString();
    }

}
