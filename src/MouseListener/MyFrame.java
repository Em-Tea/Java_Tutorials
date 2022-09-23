package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// same as the key listener but for mouse

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon icon4;


    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        icon1 = new ImageIcon("C:\\Users\\Micha\\Pictures\\smolterra.png");
        icon2 = new ImageIcon("C:\\Users\\Micha\\Pictures\\terrachange.png");
        icon3 = new ImageIcon("C:\\Users\\Micha\\Pictures\\terraglasses.png");
        icon4 = new ImageIcon("C:\\Users\\Micha\\Pictures\\terraredeyes.png");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        //label.setBackground(Color.lightGray);
        //label.setOpaque(true);
        label.setIcon(icon1);
        label.addMouseListener(this);
        //this.addMouseListener(this);  adds the listener to the entire frame

        this.add(label);
        this.setVisible(true);
    }



    @Override
    public void mouseClicked(MouseEvent e) {  // when mouse is clicked and released on a component
        System.out.println("You clicked!");
        label.setIcon(icon2);
    }

    @Override
    public void mousePressed(MouseEvent e) {    //when a mouse button has been pressed
        //System.out.println("You pressed the mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {   //when the mouse button has been released on a component
        //System.out.println("You released the mouse!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {    //when mouse enters the area of the component
        //System.out.println("Your mouse entered the label bounds");
        //label.setBackground(Color.DARK_GRAY);
        label.setIcon(icon3);
    }

    @Override
    public void mouseExited(MouseEvent e) {     //when mouse exits the bounds of a component
        //System.out.println("Your mouse has left the building!");
        //label.setBackground(Color.lightGray);
        label.setIcon(icon1);
    }
}
