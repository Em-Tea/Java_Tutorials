package GUI;

import javax.swing.*;

public class Main {
    public static void main (String[]args){

        String name = JOptionPane.showInputDialog("Enter your name:");  //using class and method to display and read input
        JOptionPane.showMessageDialog(null, "Hello " + name); //using method to display 'name'
        /*
        When attempting to use the JOptionPane to read and store input, it is returned as a string with this method.
        The return value must be cast as an integer to accommodate the storage data type.
         */
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
        // Remember to cast the String input from the dialogue box to the appropriate data type.
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + "cm tall.");
    }
}
