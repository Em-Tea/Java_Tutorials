package ToString;

public class Main {
    public static void main(String[] args) {
        /* toString() is a special method that all objects inherit which returns a strong that "textually represents"
                      an object. We can use this method both implicitly and explicitly.
         */

        Cat cat = new Cat();
        //System.out.println(cat.toString());  explicit usage
        //System.out.println(cat); this statement will print the object memory address location.
        System.out.println(cat);  //implicit usage due to overload
    }
}
