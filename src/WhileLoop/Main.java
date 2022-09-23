package WhileLoop;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        //While loops execute a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        /*
        The do while loop works similarly to the while loop but places it's condition at the end of the statement
        this means that the block of code is always executed, as it precedes any condition.
         */

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }while (name.isBlank());

        System.out.println("Hello " + name);
    }
}
