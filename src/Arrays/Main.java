package Arrays;
//An array is used to store multiple values within a list to reference later.

public class Main {
    public static void main (String [] args) {
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

        cars[0] = "Mustang";  //reassigning value via index

        System.out.println(cars[2]);

        String[] fruits = new String[3];  // initialization of an array. First defining it's data type, then name
        // a constructor is used to instantiate the array in memory.
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "Banana";

        for(int k = 0; k<fruits.length; k++) {          //for loop iteration through array
            System.out.println(fruits[k]);}

        //2-D Arrays. Think of this as a matrix, data contained within equal parts of a grid.

        String [][] animals = {
                {"Dog", "Cat", "Otter"},
                {"Horse", "Hamster", "Deer"},
                {"Pig", "Cow", "Chicken"}
        };

        //animals[0][0] = "Dog";
        //animals[0][1] = "Cat";
        //animals[0][2] = "Otter";
        //animals[1][0] = "Horse";
        //animals[1][1] = "Hamster";
        //animals[1][2] = "Deer";
        //animals[2][0] = "Pig";
        //animals[2][1] = "Cow";
        //animals[2][2] = "Chicken";

        // we use a nested for loop to print the array.
        //the outer loop is in charge of the rows, and the inner in charge of the columns

        for (int i = 0; i< animals.length; i++) {
            System.out.println();
            for (int j = 0; j< animals[i].length; j++) {
                System.out.print(animals[i][j] + " ");
            }
        }

    }
}
