package CopyObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Chevvy", "Camaro", 2021);
        //Car car2 = new Car("Ford", "Mustang" , 2022);
        Car car2 = new Car(car1);

        //car2.copy(car1);
        // car2 = car1; this method of assigning values to another object does not work. The address is copied and stored within car2, not copying the object,
        // but simply enabling two variables to point toward the same location, but with different names. They represent the same values, rather than copy.

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}