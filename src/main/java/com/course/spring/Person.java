package com.course.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
    Pet pet;
    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }

//    public Pet getPet() {
//        return pet;
//    }
//
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

    public void petYourPet(){
        System.out.println("Petting your pet: ");
        pet.say();
    }
}
