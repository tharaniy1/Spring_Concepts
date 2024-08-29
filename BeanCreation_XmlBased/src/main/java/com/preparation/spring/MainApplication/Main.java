package com.preparation.spring.MainApplication;

import com.preparation.spring.Model.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("bean.xml");

        Vehicle car = context.getBean(Vehicle.class);
        System.out.println(car.getName());

        Vehicle truck = context.getBean("truck", Vehicle.class);
        System.out.println(truck.getName());

        context.close();

    }
}
