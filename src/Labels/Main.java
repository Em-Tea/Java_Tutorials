package Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//JLabel is a gui display area which we use for strings, images, or both.
public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\Micha\\Pictures\\food.png");
        Border border = BorderFactory.createLineBorder(Color.green, 7); //instantiating a border to pass into the set border method of the frame.

        JLabel label = new JLabel();    //instantiating label
        label.setText("Quesadilla");    //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //setting text position on x axis
        label.setVerticalTextPosition(JLabel.TOP);   //setting text position on y axis
        label.setForeground(new Color(0, 120,200)); //set colour of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));  //sets new font, style and size of text
        label.setIconTextGap(-5);   //Set space between image and text
        label.setBackground(Color.yellow); //set bg colour
        label.setOpaque(true);  // display the new bg colour
        label.setBorder(border);    //passing in the border to set
        label.setVerticalAlignment(JLabel.CENTER); //sets vertical position of label entirety
        label.setHorizontalAlignment(JLabel.CENTER); //sets horizontal position of label.
        //label.setBounds(55,70,300,300); //sets x and y position in frame as well as dimensions.


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);    //set layout to null
        //frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();   //sets window to maximum label size properties. Make sure to add components before using pack. This is the final step.
    }
}
