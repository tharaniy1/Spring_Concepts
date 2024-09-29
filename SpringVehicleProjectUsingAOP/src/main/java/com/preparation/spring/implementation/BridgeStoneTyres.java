package com.preparation.spring.implementation;

import com.preparation.spring.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String moveVehicle() {
        return "BridgeStone Tyres are used for vehicle";
    }
}
