package MethodOverride;

public class Dog extends Animal{  //psvm

    String name;            //initialising
    String breed;
    int age;

    Dog(String name, int age, String breed){  //Must use the this keyword to allow assignment to each objects
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void eat() {            //defining simple class/object method
        System.out.println(this.name + " is chowing down on some grub.");
    }

    void walkies() {
        System.out.println(this.name + " wants to go out for a walk!");
    }

    void scan() {
        System.out.println("Name: " + this.name);  // this acts the same as me.(VB) - you're selecting the current object
        System.out.println("Age: " + this.age);
        System.out.println("Breed: " + this.breed);
    }

    @Override
    void speak (){
        System.out.println("The dog goes, 'bark!'");
    }

}
