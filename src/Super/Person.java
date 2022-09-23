package Super;

public class Person {
    String name;
    int age;

    Person(String name, int age){       //this constructor is called within hero.java - parameters are passed in as described
        this.name = name;
        this.age = age;
    }

    public String toString() {      // here we overload the toString method to display attributes of a class.
        return this.name + "\n" + this.age + "\n";  //since this is the super class hero.java will inherit this class and we can override to tack on remaining atts.
    }
}
