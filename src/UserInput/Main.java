package UserInput;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String yourName = scanner.nextLine();
        /*
        A common problem encountered with the scanner method nextInt(); is that it retains an escape sequence for next
        line (Enter) when scanning input. The int portion is read and stored but the escape sequence remains.
        This often means that when scanning for a string afterwards, the escape sequence retained renders it useless.
        To avoid this we can insert a dummy which clears the scanner.
         */

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();     // dummy scanner to clear, ready for string.

        System.out.print("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello, " + yourName + ".");
        System.out.println("You are " + age + " years old." );
        System.out.println("You like " + food);
    }
}
