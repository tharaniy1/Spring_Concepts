package com.preparation.spring.MainApplication;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        Vehicle maruthi = new Vehicle();
        maruthi.setName("Baleno");
        Supplier<Vehicle> maruthiSupplier = () -> maruthi;

        Supplier<Vehicle> bmwSupplier = () -> {
                Vehicle bmw = new Vehicle();
                bmw.setName("BMW");
                return bmw;
        };

        Random randomNumber = new Random();
        int num = randomNumber.nextInt(10);

        Vehicle baleno = null;
        Vehicle BMW = null;

        if(num%2 == 0){
            context.registerBean("Baleno",Vehicle.class,maruthiSupplier);
        }else{
            context.registerBean("BMW",Vehicle.class,bmwSupplier);
        }

        try{
            baleno = context.getBean("Baleno",Vehicle.class);
            System.out.println(baleno.getName());
        }catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error in finding the bean");
        }

        try{
            BMW = (Vehicle)context.getBean("BMW");
            System.out.println(BMW.getName());
        }catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error in finding the bean");
        }

    }
}
