package Selection;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        // if statement = performs a block of if it's condition is true.
        int age = 75;

        if(age >= 75) {
            System.out.println("You are getting on.");
        }
        else if (age >= 18) {
            System.out.println("You are an adult!");
        }
        else if(age >= 13) {
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are young");
        }

        // switch = statement that allows a variable to be tested for equality against a list of values.

        String day = "Monday";

        switch(day) {
            case "Sunday":          //The case describes an instance of selection, target value is denoted
                System.out.println("It is Sunday.");   //code after the semi-colon will be executed
                break;              //A break must be inserted after each case as an exit.
            case "Monday":
                System.out.println("It is Monday.");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday.");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday.");
                break;
            case "Thursday":
                System.out.println("It is Thursday.");
                break;
            case "Friday":
                System.out.println("It is Friday.");
                break;
            case "Saturday":
                System.out.println("It is Saturday.");
                break;
        }

        /*Logical operators = used to connect two or more expressions
        && = AND - both conditions must be true
        || = OR - one condition must be true
        ! = NOT - reverses boolean value of condition
        */

        int temp = 30;

        if(temp >= 30) {
            System.out.println("Damn it's scorching!");
        }
        else if (temp >= 20 && temp < 30) {
            System.out.println("It's a hot day today");
        }
        else {
            System.out.println("It's cold outside");
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("You are playing a game! Press q or Q to quit : ");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game.");
        }
        else {
            System.out.println("You are still playing the game.");
        }

        int test = 123;

        if (test > 2) {
            System.out.println("run");
        }

        switch (test) {
            case 122:
                System.out.println("case 1 ran");
                break;
            case 123:
                System.out.println("case 2 ran");
                break;
            case 124:
                System.out.println("case 3 ran");
                break;
        }
    }
}
