package ObjectArray;

public class Main {
    public static void main(String[] args) {
        /* Array examples
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];
         */

        //Food[] fridge = new Food[3];  Initialising an array with no arguments.

        Food food1 = new Food("Pizza");  //first instantiate the objects as normal, nothing to do with the array.
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hotdog");

        //data type - name = {objects/arguments};
        Food[] fridge = {food1, food2, food3}; // we now initialise and assign objects to an array.

        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);

    }
}