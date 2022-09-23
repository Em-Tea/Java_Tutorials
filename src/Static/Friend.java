package Static;

public class Friend {
    //initialising our string name - note how this is not static. It is not shared and is unique to each iteration of an object.
    String name;

    /*
    This variable has been initialised as non static - this means that each iteration of the object from class
    holds its OWN int for numberOfFriends. This is not correct code and cannot correctly count members.
     */
    static int numberOfFriends;  //this static variable holds the count for each friend - each instance of construction

    //REMEMBER, this is NOT confusing. It is simply a method constructing an object. A block of code ran when called.
    Friend(String name) {
        this.name = name;
        numberOfFriends ++;
    }

    static void checkFriends(){
        System.out.println("You have " + numberOfFriends + " friends.");
    }
}
