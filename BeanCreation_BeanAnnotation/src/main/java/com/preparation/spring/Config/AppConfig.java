package com.preparation.spring.Config;

import com.preparation.spring.Model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Baleno");
        return veh;
    }
}
