package com.preparation.spring.Model;

public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void postConstruct(){
        System.out.println("Post Construct method is called");
    }

    public void preDestory(){
        System.out.println("Pre destroy method is called");
    }
}
