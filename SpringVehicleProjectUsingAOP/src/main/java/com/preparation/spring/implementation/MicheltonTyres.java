package com.preparation.spring.implementation;

import com.preparation.spring.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MicheltonTyres implements Tyres {
    @Override
    public String moveVehicle() {
        return "Michelton Tyres are used for vehicle";
    }
}
