package com.course.spring;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.course.spring")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet myCat() {
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Pet myDog() {
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Person myPerson() {
        return new Person(myDog());
    }
}
