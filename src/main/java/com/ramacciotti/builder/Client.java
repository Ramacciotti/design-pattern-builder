package com.ramacciotti.builder;

import com.ramacciotti.builder.concrete_builder.ApartmentBuilder;
import com.ramacciotti.builder.concrete_builder.HouseBuilder;
import com.ramacciotti.builder.director.Director;
import com.ramacciotti.builder.product.Apartment;
import com.ramacciotti.builder.product.House;

/**
 * <p>* The Client must associate one of the builder objects with the director.</p>
 * <p>* It passes the builder object to the director's production method.</p>
 * <p>* You can use a different builder each time you produce something with the director.</p>
 */
public class Client {

    public static void main(String[] args) {

        Director director = new Director();


        System.out.println(" ");
        HouseBuilder houseBuilder = new HouseBuilder();
        director.constructHouse(houseBuilder);
        House house = houseBuilder.gerResult();
        System.out.println("** " + house.type() + " builded successfully!");
        System.out.println(" ");
        System.out.println("++ Result: " + house.printResult());

        System.out.println(" ");
        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();
        director.constructApartment(apartmentBuilder);
        Apartment apartment = apartmentBuilder.gerResult();
        System.out.println("** " + apartment.type() + " builded successfully!");
        System.out.println(" ");
        System.out.println("++ Result: " + apartment.printResult());

    }

}
