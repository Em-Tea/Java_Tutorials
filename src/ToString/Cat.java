package ToString;

public class Cat {
    String name = "Greg";
    String breed = "Persian";
    float weight = 2.3f;
    int age = 3;
    boolean vaccinated = true;

    void eat() {
        System.out.println(name + " eats some tasty treats.");
    }
    void sleep() {
        System.out.println(name + " is catching some Z\'s");
    }

    public String toString() {      //override toString() to print all parameters;
        return name + "\n" + breed + "\n" + age + "\n" + weight + "\n" + vaccinated;
    }

}
