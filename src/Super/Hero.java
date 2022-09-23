package Super;

public class Hero extends Person{
    String power;

    Hero(String name, int age, String power){
        super(name, age);   //rather than using this, we'd like our person class to share this assignment. We use super and pass in values to send these contents to the super class.
        this.power = power;
    }

    public String toString() {  //This is our override. We use the super keyword to run the toString method it has, then add this classes power to the return value.
        return super.toString() + this.power;   //the override is the adding of the power variable for display.
    }
}
