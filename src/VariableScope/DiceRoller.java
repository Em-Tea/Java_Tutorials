package VariableScope;

import java.util.Random;

public class DiceRoller {
    Random random;      //moving the variables outside our methods declares them as public - able to be used by all methods within the class.
    int number = 0;
    DiceRoller() {      //variables within this method are only visible to the constructor - this is also a method
        random = new Random();   // other methods such as roll cannot see this variable and therefor not use it.
        //int number = 0;
        roll();
    }
    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
