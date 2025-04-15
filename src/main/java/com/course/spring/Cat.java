package com.course.spring;

import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("CAT says");
    }
}
