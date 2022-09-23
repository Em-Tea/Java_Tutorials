package PassObjects;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();   //we first instantiate our objects as well as relevant arguments.
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.Park(car1);  // Passing in objects as methods, making sure that the method is catered to accept object data type. (defined in it's class)
        garage.Park(car2);

    }
}

