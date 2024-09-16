package com.preparation.spring.MainApplication;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Song;
import com.preparation.spring.Service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
    In this project we calculated time taken to complete methods and used loggers to get information
    These are non-business logic.
    We can maintain different modules for cross-cutting concerns using AOP
 */
public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        VehicleService vehicleService = context.getBean(VehicleService.class);

        Song song = new Song("tere nam","sad");
        boolean vehicleStarted = false;
        vehicleService.playMusic(song, vehicleStarted);
        vehicleService.makeMove(vehicleStarted);
    }
}
