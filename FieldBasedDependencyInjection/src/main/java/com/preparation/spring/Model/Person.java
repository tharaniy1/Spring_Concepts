package com.preparation.spring.Model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    private String name;

    @Autowired
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /*
    Method to check whether dependent bean vehicle will initialize first or not
     */
    public void initialize(){
        System.out.println("Person bean is initialized");
    }
}
