package com.course.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myDog")
//@Scope("singleton")
@Scope("prototype")
public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Say");
    }
}
