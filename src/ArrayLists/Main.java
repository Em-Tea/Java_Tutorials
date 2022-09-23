package ArrayLists;

import java.util.ArrayList;  // Must import
import java.util.*;

public class Main {
    public static void main (String[]args) {

        /* An array list is a resiazable array - elements can be added and removed after compilation phase
           Stores reference data types - this means that we cannot store primitive data types within this Array -
           Wrapper classes must be used to be able to contain data within this array.
        */

        //Array & data type - name - constructor - method
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Fried Chicken");
        food.add("Hotdog");

        food.set(2, "Quesadilla");  //replaces a value within an array by index.
        food.add(3, "Pasta Bake"); //add another member to the array.
        //food.remove();            removes a member of the array
        //food.clear();             clears the entire array.
        for (int i = 0; i < food.size(); i++) {        //simple for loop to print array.
            System.out.println(food.get(i));
        }

        //2-D Array Lists
        // a dynamic list of lists that can be altered during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();  //instantiate array list which holds arrays

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("Doughnuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Bell Peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("Wine");
        drinksList.add("Coffee");
        drinksList.add("Milk");

        groceryList.add(bakeryList);        //joining all lists within groceryList
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(bakeryList);
        System.out.println(produceList);
        System.out.println(drinksList);

        System.out.println(groceryList);    //print the whole thing
        System.out.println(groceryList.get(0).get(0));     //print by index listname.get(list).get(member)

    }
}
