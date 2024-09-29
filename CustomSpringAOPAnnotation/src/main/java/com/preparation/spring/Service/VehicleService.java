package com.preparation.spring.Service;

import com.preparation.spring.interfaces.SecurityAspect;
import com.preparation.spring.interfaces.Speaker;
import com.preparation.spring.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class VehicleService {

    @Autowired
    private Speaker speaker;

    @Autowired
    private Tyres tyres;

    private Logger log = Logger.getLogger(VehicleService.class.getName());
    public void playMusic(boolean vehicleStarted){
        System.out.println(speaker.playMusic());
    }

    @SecurityAspect
    public void moveVehicle(boolean vehicleStarted){
        System.out.println(tyres.moveVehicle());
    }

}
