package com.preparation.spring.Service;

import com.preparation.spring.Interfaces.Speakers;
import com.preparation.spring.Interfaces.Tyres;
import com.preparation.spring.Model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Component
public class VehicleService {

    @Autowired
    private Speakers speaker;
    @Autowired
    private Tyres tyre;

    private Logger logger = Logger.getLogger(VehicleService.class.getName());

    public void playMusic(Song song,boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("--------playMusic method started ------");
        if(vehicleStarted) {
            speaker.makeSound();
        }
        Instant end = Instant.now();
        long diff = Duration.between(start,end).toMillis();
        logger.info("Time taken to complete the playMusic method is "+diff);
        logger.info("-------PlayMusic method ends -------");
    }

    public void makeMove(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("-------makeMove method started -------");
        if(vehicleStarted) {
            tyre.rotate();
        }
        Instant end = Instant.now();
        long diff = Duration.between(start,end).toMillis();
        logger.info("Time taken to complete the makeMove method is "+diff);
        logger.info("---------makeMove method ends ------");
    }



}
