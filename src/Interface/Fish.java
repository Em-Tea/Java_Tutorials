package Interface;

public class Fish implements Prey, Predator {   //implementing both interfaces

    @Override
    public void hunt() {    //calling from 'Predator'
        System.out.println("The fish hunts...");
    }

    @Override
    public void flee() {    //calling from 'Prey'
        System.out.println("The fish flees.");
    }
}