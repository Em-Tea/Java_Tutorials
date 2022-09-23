package PassObjects;

public abstract class Vehicle {  //this is our super class and will share its methods and attributes in a hierarchical nature.

    double speed;

    void go(){
        System.out.println("This vehicle is moving.");
    }
    void stop(){
        System.out.println("This vehicle is stopping");
    }

    abstract void LetsGo(); //this is where we implement the method we intend to inherit with our subclasses.
    // this method is intentionally abstract or empty, intending for its subclass to define function.

}