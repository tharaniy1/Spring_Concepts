package com.preparation.spring.implementation;

import com.preparation.spring.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speaker {
    @Override
    public String playMusic() {
        return "BoseSpeakers are used to play music";
    }
}
