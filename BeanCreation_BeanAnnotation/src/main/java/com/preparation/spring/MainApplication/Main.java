package com.preparation.spring.MainApplication;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
    }
}
