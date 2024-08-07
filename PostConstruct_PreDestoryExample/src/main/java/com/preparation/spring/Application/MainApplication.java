package com.preparation.spring.Application;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
        context.close();


    }
}
