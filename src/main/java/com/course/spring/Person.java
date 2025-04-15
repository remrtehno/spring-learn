package com.course.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
    // 1 VARIANT
    @Autowired
    Pet pet;
// 2 VARIANT
//    @Autowired
//    public Person(Pet pet) {
//        this.pet = pet;
//    }

//    public Pet getPet() {
//        return pet;
//    }
//
    // 3 VARIANT
//    @Autowired
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

    public void petYourPet(){
        System.out.println("Petting your pet: ");
        pet.say();
    }
}
