package com.preparation.spring.Implementation;

import com.preparation.spring.Interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("MichelinTyres are used for vehicle");
    }
}
