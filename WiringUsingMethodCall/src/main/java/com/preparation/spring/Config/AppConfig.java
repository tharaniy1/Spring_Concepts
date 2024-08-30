package com.preparation.spring.Config;

import com.preparation.spring.Model.Person;
import com.preparation.spring.Model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Baleno");
        return veh;
    }

    //wiring the dependencies of a bean through method call
    @Bean
    public Person person(){
       Person person = new Person();
       person.setName("Tara");
       person.setVehicle(vehicle());
       return person;
    }
}
