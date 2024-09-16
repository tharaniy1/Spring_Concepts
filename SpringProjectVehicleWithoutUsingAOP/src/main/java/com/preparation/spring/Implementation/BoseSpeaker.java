package com.preparation.spring.Implementation;

import com.preparation.spring.Interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speakers {

    @Override
    public void makeSound(){
        System.out.println("Bose Speakers is used to listen music");
    }
}
