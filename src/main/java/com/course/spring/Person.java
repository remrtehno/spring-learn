package com.course.spring;

public class Person {
    Pet pet;
//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void petYourPet(){
        System.out.println("Petting your pet: ");
        pet.say();
    }
}
