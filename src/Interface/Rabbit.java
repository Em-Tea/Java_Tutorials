package Interface;

public class Rabbit implements Prey {   //implementing prey as its methods.

    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing.");
    }
}
