package Static;

public class Main {
    public static void main(String[] args) {
        // The static modifier is a single copy of a variable/method which is created and shared.
        // The class "owns" the static member

        Friend friend1 = new Friend("Joseph");
        Friend friend2 = new Friend("Greg");
        Friend friend3 = new Friend("Can't think of any");
        Friend friend4 = new Friend("Imaginary");

        System.out.println(Friend.numberOfFriends);
        Friend.checkFriends();
    }
}
