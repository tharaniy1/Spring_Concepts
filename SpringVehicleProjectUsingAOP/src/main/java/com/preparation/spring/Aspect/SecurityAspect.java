package com.preparation.spring.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
/*
  @Order defines the sort order for an annotated component.
  The value is optional and represents an order value as defined in the Ordered interface. Lower values have higher priority.
  The default value is Ordered. LOWEST_PRECEDENCE, indicating the lowest priority
  @Order(value = Ordered.LOWEST_PRECEDENCE)
 */
public class SecurityAspect {

    @Before("execution(* com.preparation.spring.Service.*.*(..)) && args(vehicleStarted)")
    public void securityCheck(JoinPoint joinPoint,boolean vehicleStarted){
        if(!vehicleStarted){
            throw new RuntimeException("Vehicle is not yet started");
        }
    }
}
