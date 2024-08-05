package com.preparation.spring.Application;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
  Resolve the NoUniqueBeanDefinitionException
  Different ways to define a custom name to bean
 */
public class MainApplication {

    public static void main(String[] args) {
        /*
          NoUniqueBeanDefinitionException

        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());*/

        //one way is to specify the name of the bean
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = context.getBean("Audi Vehicle",Vehicle.class);
        System.out.println(vehicle.getName());

        /*second way is to use @primary
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());*/
        
    }
}
