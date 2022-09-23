package Graphicstwod;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame() {
        panel = new MyPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }
    /*
    public void paint(Graphics g) {     //best off using graphics 2d it's newer
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawLine(0,0,500,500);     //size of the frame includes window bar which overlaps canvas
    }
    */
}
