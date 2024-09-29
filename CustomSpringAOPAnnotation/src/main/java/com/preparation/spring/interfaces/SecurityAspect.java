package com.preparation.spring.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 we can create a custom annotations in the Spring AOP
 Step 1 : Need to create a interface with the annotation name as done below
 Step 2 : Specify the annotation class path in the advice
 Step 3 : Mention the created annotation on methods which you required

 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SecurityAspect {
}
