package com.preparation.spring.Model;

import com.preparation.spring.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name = "Toyoto";

    @Autowired
    private VehicleService vehicleService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
