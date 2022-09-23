package GenericClasses;
/*
    Generics METHODS enable types (class and interfaces) o be parameters when defining:
    class interfaces and methods.
    A benefit is to eliminate the need to create multiple versions of methods or classes for various data types.
    Use 1 version for all reference data types.
 */

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5};       //all reference data types
        Double[] doubleArray = {5.5, 4.4 , 3.3, 2.2, 1.1};
        Character[] charArray = {'H','E', 'L','L','O'};
        String[] stringArray = {"B","Y","E"};

        //MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        //MyGenericClass<Double> myDouble = new MyGenericClass<>(1.0);
        //MyGenericClass<Character> myChar = new MyGenericClass<>('A');
        //MyGenericClass<String> myString = new MyGenericClass<>("String");

        MyGenericClass<Integer, String> myThing = new MyGenericClass<>(3, "Three");
        System.out.println(myThing.getValue());
        System.out.println(myThing.getValue2());

        ArrayList<String> myFriends = new ArrayList<>(); //extremely similar to array list

        //System.out.println(myInt.getValue());
        //System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());

        //displayArray(intArray);
        //displayArray(doubleArray);
        //displayArray(charArray);
        //displayArray(stringArray);

        //System.out.println(getFirst(intArray));
        //System.out.println(getFirst(doubleArray));
        //System.out.println(getFirst(charArray));
        //System.out.println(getFirst(stringArray));
    }

    public static <T> void displayArray(T[] array) {        //create a shorthand for individual methods. These have to be REFERENCE data types

        for(T x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array){
        return array[0];
    }

/*
    public static void displayArray(Integer[] array) {

        for(Integer x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void displayArray(Double[] array) {

        for(Double x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void displayArray(Character[] array) {

        for(Character x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void displayArray(String[] array) {

        for(String x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
*/

}
