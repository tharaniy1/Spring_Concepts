package com.preparation.spring.implementation;

import com.preparation.spring.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker {
    @Override
    public String playMusic() {
        return "SonySpeaker is used to play music";
    }
}
