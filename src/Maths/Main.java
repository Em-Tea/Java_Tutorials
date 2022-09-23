package Maths;

/*
Boolean - 1 bit - primitive - true opr false
byte - 1 byte - primitive - -128 to 127
short - 2 bytes - primitive - -32,768 to 32,767
int - 4 bytes - primitive - -2 billion to 2 billion
long - 8 bytes - primitive - -9 quintillion to 9 quintillion
float - 4 bytes - primitive - fractional number up to 6-7 digits ex. 3.141592f <<< floats always have f
double - 8 bytes - primitive - fractional number up to 15 digits ex. 3.141592653589793
char - 2 bytes - primitive - single letter/letter/ASCII value
String - varies - reference - a sequence of characters

Primitive data types : 8 types - Stores data - can holy only 1 value - less memory - fast
Reference data types : Unlimited - User defined - stores an address - can hold more than 1 value - more memory - slow
 */

import java.util.Scanner;
import java.util.Random;  //importing random class

public class Main {
    public static void main(String[] args) {

        int test; //declaration
        test = 123; // assignment
        int a = 123; //initialization
        System.out.println("My number is: " + a);
        double b = 1.123;
        boolean c = true;
        char symbol = '@'; //single quotes are used
        String name = "Michael";
        final double PI = 3.14;  //final is a constant typically denoted in UPPERCASE

        //String x = "Water";
        //String y = "Kool-Aid";

        //System.out.println("x: " + x);
        //System.out.println("y: " + y);

        System.out.println("--------------------------------------------------------------------------------------");

        int friends = 10;
        friends = friends + 1;  //addition
        System.out.println("You have " + friends + " friends.");

        friends = friends - 1;  //subtraction
        System.out.println("Now you have " + friends + " friends.");

        friends = friends / 2;  //division
        System.out.println("Now you have " + friends + " friends.");

        friends = friends * 2;  //multiplication
        System.out.println("Now you have " + friends + " friends.");

        friends = friends % 3;   //divides by and returns remainder
        System.out.println("Really, you have " + friends + " friend.");

        //short hand increment and decrement
        friends++;
        friends--;

        System.out.println("--------------------------------------------------------------------------------------");


        double fNum = 3.14;
        double sNum = -10;
        double tNum = 120;

        double maxNum = Math.max(fNum, sNum); //This method compares 2 arguments and returns the largest value.
        System.out.println(maxNum);

        double minNum = Math.min(fNum, sNum); //Compares 2 arguments and returns the lowest value.
        System.out.println(minNum);

        double absNum = Math.abs(sNum); // the distance from zero that a number is on the number line, without considering direction
        System.out.println(absNum);

        double sqrtNum = Math.sqrt(tNum); //returns the square root of the value
        System.out.println(sqrtNum);

        double roundNum = Math.round(fNum); // Rounds down the value
        System.out.println(roundNum);

        double ceilNum = Math.ceil(fNum); // Rounds up the value
        System.out.println(ceilNum);


        System.out.println("--------------------------------------------------------------------------------------");
        // Simple find hypotenuse program as scanner practice
        /*
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side x: ");
        x = scanner.nextDouble();
        System.out.print("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse is : " + z);

        scanner.close();
        */

        System.out.println("--------------------------------------------------------------------------------------");
        // value returned is not objectively random, we call it a pseudo random value

        Random random = new Random(); //instantiating the random object for use

        int rNum = random.nextInt(6) + 1; //here we add the one as counting starts from 0, which is not present on a die.
        double drNum = random.nextDouble();  //displays value between 0 and 1
        boolean brNum = random.nextBoolean();

        System.out.println(rNum);
        System.out.println(drNum);
        System.out.println(brNum);
    }
}

