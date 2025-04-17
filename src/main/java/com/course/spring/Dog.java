package com.course.spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component("myDog")
//@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Say");
    }

    @PostConstruct
    public void init() {
        System.out.println("Dos class is created");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog is going to be destroyed");
    }
}
