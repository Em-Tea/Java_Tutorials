package GridLayout;

import javax.swing.*;
import java.awt.*;

/*
The layout manager defines the natural layout for components within a container.
Places component in a grid of cells. Each component takes all the available space within its cell, and each cell is the same size.
 */
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(new GridLayout(10,1));  //we can use the grid layout to easily position components equally within a frame or panel
        frame.setLayout(new GridLayout(3,3, 10,10));    //adding more arguments to define spacing between components

        //shorthand instantiating button
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);

    }
}