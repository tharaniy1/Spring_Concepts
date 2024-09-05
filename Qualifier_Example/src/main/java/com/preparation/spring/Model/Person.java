package com.preparation.spring.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    private String name;

    private Vehicle vehicle;

    public Person(){
        System.out.println("Person bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    /*
    Qualifier annotation may be used on a field or parameter as a qualifier for candidate beans when autowiring.
     */
    @Autowired
    @Qualifier("vehicle2")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
