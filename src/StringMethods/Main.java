package StringMethods;

public class Main {
    public static void main (String[]Args) {

        //String = a reference data type yhat can store one or more characters,
        //Reference data types have access to useful methods.

        String name = "Michael";
        String secondName = "    Taylor    ";

        boolean result = name.equals("Michael"); //This will return a boolean value.
        if (result == true){
            System.out.println("Hey your name is Michael!");

            int lenResult = name.length();      //Returns the number of characters within a string.
            System.out.println("You name contains " + lenResult + " letters.");

            char charResult = name.charAt(0);   //Returns the character in reference to a given index.
            System.out.println("Your first initial is " + charResult +".");

            int iOfResult = name.indexOf("l");  //Returns the index of the character passed in.
            System.out.println("Index of the \"l\" is " + iOfResult + ".");

            boolean isEmptyResult = name.isEmpty();     //Stores a boolean value based on if a string is empty.
            if (isEmptyResult == false) {
                System.out.println("This string is not empty.");
            }

            String upperResult = name.toUpperCase();    //Returns the same string as all uppercase letters.
            System.out.println(upperResult);

            String lowerResult = name.toLowerCase();    //Returns a string as all lower case letters.
            System.out.println(lowerResult);

            String trimResult = secondName.trim();      //Trim whitespace from before or after a string.
            System.out.println(trimResult);

            String replaceResult = name.replace("M", "N");  //Replaces a character within a string.
            System.out.println(replaceResult);
        }
    }
}
