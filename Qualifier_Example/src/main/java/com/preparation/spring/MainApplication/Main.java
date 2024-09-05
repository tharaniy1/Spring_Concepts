package com.preparation.spring.MainApplication;

import com.preparation.spring.Config.AppConfig;
import com.preparation.spring.Model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
  When Qualifier and primary annotations are used spring give preference to primary annotation and use the primary bean rather qualifier bean
 */
public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println(person.getVehicle());
    }
}
