package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {        //must implement the keylistener interface

    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);  //must set layout to null because we are manually changing position with keystrokes
        this.setSize(500,500);
        this.addKeyListener(this); //enables the frame to listen for key input

        icon = new ImageIcon("C:\\Users\\Micha\\Pictures\\smolterra.png");

        label = new JLabel();
        label.setBounds(20,20,100,100);
        label.setIcon(icon);

        //label.setBackground(Color.red);
        //label.setOpaque(true); //bg doesnt like to display if you don't set it as opaque

        this.getContentPane().setBackground(Color.green);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a' : label.setLocation(label.getX()-5, label.getY()); //left direction
                break;
            case 'w' : label.setLocation(label.getX(), label.getY() - 5);  //up direction
                break;
            case 's' : label.setLocation(label.getX(), label.getY() + 5);  //down direction
                break;
            case 'd' : label.setLocation(label.getX() +5, label.getY());  //right direction
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 5, label.getY()); //left direction
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 5);  //up direction
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 5);  //down direction
                break;
            case 39:
                label.setLocation(label.getX() + 5, label.getY());  //right direction
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
