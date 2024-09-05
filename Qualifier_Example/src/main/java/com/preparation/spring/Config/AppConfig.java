package com.preparation.spring.Config;

import com.preparation.spring.Model.Person;
import com.preparation.spring.Model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {


    @Bean
    @Primary
    public Vehicle vehicle1(){
        Vehicle car = new Vehicle();
        car.setName("Tiago");
        return car;
    }

    @Bean
    public Vehicle vehicle2(){
        Vehicle truck = new Vehicle();
        truck.setName("Bolero");
        return truck;
    }

    @Bean
    public Vehicle vehicle3(){
        Vehicle scooty = new Vehicle();
        scooty.setName("Suziki");
        return scooty;
    }

    @Bean
    public Person person(){
        Person person1 = new Person();
        person1.setName("Tara");
        return person1;
    }

}
