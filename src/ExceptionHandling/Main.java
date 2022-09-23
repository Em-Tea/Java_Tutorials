package ExceptionHandling;
// an exception is an event that occurs during execution of a program that disrupts the normal flow of instruction.
// unexpected events that occur which will stop or crash your program - we need to be prepared

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Here we insert a try block - this runs code. We first try the code, if an exception is found, instead, the catch block is run
         */

        try {
            System.out.print("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.print("Enter a whole number to divide by: ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("The result is: " + z);
        }
        catch(ArithmeticException e) {  //here we first define what we're expecting to catch, and then name it (e)
            System.out.println("You can't divide by zero!");
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter a number");
        }
        /*
        catch(Exception e) {        this exception handling is typically not used and is considered lazy. Put it at the end
            sout ("something went wrong")
        }
        */
        finally {      // a great use for the finally block is to close scanners
            scanner.close();
        }

    }
}
