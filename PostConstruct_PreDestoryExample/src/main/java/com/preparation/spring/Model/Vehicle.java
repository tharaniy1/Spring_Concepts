package com.preparation.spring.Model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
      Method which is annotated with @PostConstruct will be executed after bean initialization
     */
    @PostConstruct
    public void initialize(){
        this.name = "Audi";
    }

    /*
        Method which is annotated with @PreDestroy will be executed before bean is moving out of scope from Application Context
     */
    @PreDestroy
    public void destroy(){
        System.out.println("Bean is moving out of scope");
    }
}
