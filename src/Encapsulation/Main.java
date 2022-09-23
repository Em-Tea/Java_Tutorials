package Encapsulation;
/*
Encapsulation describes the abstraction of class attributes,
we access and change these values through methods named getters & setters.

Typically, attributes should always be defined as private when there is no reason to make them public or protected.

 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevvy", "Camero", 2021);

        //System.out.println(car.make);     cannot access due to provate modifier
        System.out.println(car.getMake());  //this method written within the Car class allows us to communicate and request the contents of the make variable
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2022);  //reassignment

        System.out.println(car.getYear());  //Reprint to check changes

    }
}
