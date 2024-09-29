package com.preparation.spring.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LogAspect {

    private final Logger log = Logger.getLogger(LogAspect.class.getName());
    /*
    This method can also be used here
    But to learn how to use two aspect classes I commented it out
    This method is executed first than the @around advice

    @Before("execution(* com.preparation.spring.Service.*.*(..)) && args(vehicleStarted,..)")
    public void securityCheck(JoinPoint joinPoint,boolean vehicleStarted){
        if(!vehicleStarted){
            throw new RuntimeException("Vehicle is not started yet");
        }

    }

    */

    /*
        ProceedingJoinPoint is allowed for only Around advice
     */
    @Around("execution(* com.preparation.spring.Service.*.*(..))")
    public void logger(ProceedingJoinPoint joinPoint) throws Throwable {
        Instant start = Instant.now();
        log.info(joinPoint.getSignature().getName()+" method started");
        joinPoint.proceed();
        Instant end = Instant.now();
        long duration = Duration.between(start,end).toMillis();
        log.info("Time taken for "+joinPoint.getSignature().getName()+" execution is "+duration);
        log.info(joinPoint.getSignature().getName()+" method ends");

    }

    @AfterThrowing(value = "execution(* com.preparation.spring.Service.*.*(..))",throwing = "exception")
    public void exceptionLogger(JoinPoint joinPoint, Throwable exception){
        log.info("Exception is thrown by the "+joinPoint.getSignature().getName()+" method and the exception is "+exception.getMessage());
    }

    @AfterReturning("execution(* com.preparation.spring.Service.*.*(..))")
    public void successfulReturn(JoinPoint joinPoint){
        log.info(joinPoint.getSignature().getName()+" method is executed without any exception");
    }

    /*
    After advice is executed after method execution completes and then @Around advice remaining part is executed
    If we are using ProceedingJoinPoint there will no error but the particular advice will not get executed
    JoinPoint can be only used with @Around advice

    @After(value = "execution(* com.preparation.spring.Service.*.*(..))")
    public void methodExitLogger(JoinPoint joinPoint){
        log.info(joinPoint.getSignature().getName()+" method execution is completed");
    }
    */





}
