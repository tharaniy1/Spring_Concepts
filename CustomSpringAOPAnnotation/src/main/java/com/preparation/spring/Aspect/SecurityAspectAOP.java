package com.preparation.spring.Aspect;

import com.preparation.spring.interfaces.SecurityAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class SecurityAspectAOP {

    private Logger log = Logger.getLogger(SecurityAspectAOP.class.getName());
    @Before("@annotation(com.preparation.spring.interfaces.SecurityAspect) && args(vehicleStarted,..)")
    public void securityCheckForVehicleStarted(JoinPoint joinPoint,boolean vehicleStarted){
        log.info("Exception is raised as vehicle is not started");
        if(!vehicleStarted){
            throw new RuntimeException("Vehicle is not started yet");
        }

    }
}
