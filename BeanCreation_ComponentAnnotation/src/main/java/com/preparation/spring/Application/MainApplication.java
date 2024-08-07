package com.preparation.spring.Application;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

    public static void main(String[] args) {
        /*
          This is the code without using @Configuration and @ComponentScan

        var context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.scan("com.preparation.spring.Model");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());*/

        /*
            This is the code using @Configuration and @ComponentScan
        */
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());


    }
}
