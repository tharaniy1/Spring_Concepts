package com.preparation.spring.MainApplication;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
  Setter based Injection has some disadvantages
  1. We can't create immutable fields
  2. Readability as setters are present at the end of the code
 */

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println(person.getVehicle());
    }
}
