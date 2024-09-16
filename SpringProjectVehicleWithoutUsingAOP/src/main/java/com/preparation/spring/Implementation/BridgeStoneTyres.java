package com.preparation.spring.Implementation;

import com.preparation.spring.Interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("BridgeStoneTyres are used for vehicle");
    }
}
