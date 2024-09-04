package com.preparation.spring.Config;

import com.preparation.spring.Model.Person;
import com.preparation.spring.Model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle car = new Vehicle();
        car.setName("Tiago");
        return car;
    }

    @Bean
    public Person person(){
        Person person1 = new Person();
        person1.setName("Tara");
        return person1;
    }

}
