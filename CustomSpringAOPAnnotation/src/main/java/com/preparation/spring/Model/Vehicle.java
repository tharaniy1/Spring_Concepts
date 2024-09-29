package com.preparation.spring.Model;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name = "baleno";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "VehicleName : "+name;
    }
}
