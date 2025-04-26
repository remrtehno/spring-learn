package com.zaurtregulov.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.zaurtregulov.spring.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("Before method: " + proceedingJoinPoint.getSignature());

        Object result = proceedingJoinPoint.proceed();

        System.out.println("After method: " + proceedingJoinPoint.getSignature());
        return result;
    }

}
