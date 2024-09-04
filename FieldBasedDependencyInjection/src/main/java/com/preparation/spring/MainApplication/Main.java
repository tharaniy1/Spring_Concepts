package com.preparation.spring.MainApplication;

import com.preparation.spring.Model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
   Field Based DependencyInjection is not recommended
   1. We can't create immutable fields
   2. Unit testing will be complicated
 */
public class Main {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("bean.xml");

        Person person = context.getBean(Person.class);
        System.out.println(person.getVehicle());
    }
}
