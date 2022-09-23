package Interface;

public class Hawk implements Predator { //implementing predator and it's methods

    @Override
    public void hunt() {
        System.out.println("The hawk is hunting.");
    }
}
