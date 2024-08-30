package com.preparation.spring.Model;

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

    public String getVehicle() {
        return vehicle.getName();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
