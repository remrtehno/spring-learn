package com.course.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Person person = context.getBean("myPerson", Person.class);
//        person.petYourPet();
//
//        System.out.println(person.name);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet dog = context.getBean("myDog", Dog.class);
        Pet dog2 = context.getBean("myDog", Dog.class);
        System.out.println("the same objects?: ");
        System.out.println(dog == dog2);

        context.close();
    }

}
