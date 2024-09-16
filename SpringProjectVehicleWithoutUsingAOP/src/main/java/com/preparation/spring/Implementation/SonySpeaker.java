package com.preparation.spring.Implementation;

import com.preparation.spring.Interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("Sony speakers is used to music");
    }
}
