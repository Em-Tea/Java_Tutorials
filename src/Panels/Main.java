package Panels;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.Border;

// The JPanel is  GUI component that functions as a container to hold other components

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:\\Users\\Micha\\Pictures\\quesa.png"); //assigning image to icon object.

        JLabel label = new JLabel();    //instantiating label component to place within panel or frame.
        label.setText("Hi");        //assigning string to label
        label.setIcon(icon);        //passing in icon component to the label
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        //label.setBounds(100,100,100,100);

        JPanel redpanel = new JPanel();     //instantiating each panel for use and defining position + dimensions
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel = new JPanel();       //bluepanel instantiation
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel = new JPanel();       //greenpanel instantiation
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();    //instantiating the frame object to place panels in
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  //to manually place components
        frame.setSize(750,750);
        frame.setVisible(true);  //enables the visibility of the frame itself
        greenpanel.add(label);    //adding components to the
        frame.add(redpanel);    //adding panel components to the frame
        frame.add(bluepanel);
        frame.add(greenpanel);
    }
}
