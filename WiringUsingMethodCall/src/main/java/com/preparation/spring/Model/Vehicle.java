package com.preparation.spring.Model;

public class Vehicle {

    private String name;

    public Vehicle(){
        System.out.println("Vehicle bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
