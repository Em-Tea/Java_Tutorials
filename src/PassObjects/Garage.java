package PassObjects;

public class Garage {

    Garage(){

    }

    void Park(Car car) {    // void - not returning a value. This method accept object data type as its parameter.
        System.out.println("The " + car.name + " is parked in the garage.");
    }

}
