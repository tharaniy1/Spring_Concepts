package com.preparation.spring.Application;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Person;
import com.preparation.spring.Service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var tara = context.getBean(Person.class);
        System.out.println(tara.getName());
        System.out.println(tara.getVehicle());

        var vehicleService = context.getBean(VehicleService.class);
        boolean vehicleStarted = true;
        vehicleService.playMusic(vehicleStarted);
        vehicleService.moveVehicle(vehicleStarted);


    }
}
