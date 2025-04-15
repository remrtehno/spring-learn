package com.course.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.petYourPet();

        System.out.println(person.name);

        context.close();
    }

}
