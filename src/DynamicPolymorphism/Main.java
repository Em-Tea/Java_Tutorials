package DynamicPolymorphism;

// polymorphism means to have many shapes or forms
// Dynamic = after compilation or during runtime.
// ex. a corvette is a: corvette, and a car, and a vehicle, and an object.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;      //here we initialise the use of a new animal object.
        System.out.println("Would you like a Cat or a Dog?");
        System.out.print("1 = Dog or 2 = Cat : " ); //user is prompted for selection using scanner object
        int choice = scanner.nextInt(); //scanning input

        if (choice == 1) {      //selection statement comparing user input stored within 'choice'
            animal = new Dog(); // Instantiation of new object from animal memory allocation
            animal.speak();     //calling override method based on class and object instantiated
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }

    }
}