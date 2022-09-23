package MethodOverride;

public class Main {
    /*
    Method overriding means to declare a method within a subclass which is already present within a parent class,
    effectively altering its parameters to fit the child class effectively.
     */
    public static void main(String[] args) {
        Animal unknown = new Animal();
        Dog dog1 = new Dog("John", 5, "Bully");

        unknown.speak(); //Here, our superclass method is being called. At this point, it is not an override.

        dog1.speak();  //Here, we run the same method with our Dog class. An override is present and defaults to it's own classes override.

    }
}
