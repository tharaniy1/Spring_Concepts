package com.preparation.spring.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name = "Toyoto";

    //private Person person;

    /*  Circular Dependency where Person -> Vehicle -> Person
        BeanCurrentlyInCreationException will be raised
    To avoid circular dependency either use setter base dependency injection or else use @lazy as shown below
    @Autowired
    public Vehicle(@Lazy Person person){
        this.person = person;
        System.out.println("Vehicle bean is created");
    }
    */
    public Vehicle(){
        System.out.println("Vehicle bean is created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name ;
    }
}
