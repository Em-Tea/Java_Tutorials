package Polymorphism;
// Polymorphism describes the ability of an object to identify as more than one data type.

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        //it goes
        // Data type (bicycle) name (bike) = constructor (new) method (Bicycle();)
        Bicycle bike = new Bicycle();
        /*
        Here, we are storing all of our objects in an array, regardless of their separate data types (denoted by the class name)
        instead, we use the super class (Vehicles) of the car, boat and bike, to store all Vehicles within an array.
         */
        Vehicle[] racers = {car, boat, bike};

        for(Vehicle x : racers) {
            x.go();
        }
    }
}
