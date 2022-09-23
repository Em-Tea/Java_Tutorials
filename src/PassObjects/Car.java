package PassObjects;

public class Car extends Vehicle{
    String name;
    int wheels = 4;
    int doors = 4;

    Car(String name) {      //standard instantiation of an object with name parameter.
        this.name = name;
    }


    @Override
    void LetsGo() {
        System.out.println("The driver is driving the car");
    }

}
