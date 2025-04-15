package com.course.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
//    @Value("Test name")

    @Value("${person.name}")
    String name;

//    // 1 VARIANT
//    @Autowired
//    @Qualifier("myDog")
    Pet pet;
// 2 VARIANT
    @Autowired
    public Person(@Qualifier("myDog") Pet pet) {
        this.pet = pet;
    }

//    public Pet getPet() {
//        return pet;
//    }
//
    // 3 VARIANT
//    @Autowired
//    @Qualifier("myDog")
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

    public void petYourPet(){
        System.out.println("Petting your pet: ");
        pet.say();
    }
}
