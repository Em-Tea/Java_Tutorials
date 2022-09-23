package ForEach;

import java.util.ArrayList;

public class Main {
    public static void main (String[]args) {
        //For each is considered an advanced for loop used to iterate through the elements in an
        //array or collection. Less steps - more readable. Less flexible.

        //String[] animals = {"Cat", "Dog", "Rat", "Bird"};

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rat");
        animals.add("Bird");

        //for (data type - i(index) : arrayname)
        for (String i : animals) {
            System.out.println(i);
        }
    }
}
