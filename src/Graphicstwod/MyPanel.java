package Graphicstwod;

import javax.swing.*;
import java.awt.*;
import java.time.Year;

public class MyPanel extends JPanel {
    Image image;
    MyPanel(){
        image = new ImageIcon("C:\\Users\\Micha\\Pictures\\smolterra.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));
        //g2D.setPaint(Color.blue);
        //g2D.drawLine(0,0,500,500);

        g2D.setPaint(Color.yellow);
        g2D.drawRect(10,10,150,150);

        g2D.setPaint(Color.orange);
        g2D.fillRect(10,10,150,150);

        g2D.setPaint(Color.cyan);
        g2D.drawOval(250,40,100,100);
        g2D.setPaint(Color.blue);
        g2D.fillOval(250,40,100,100);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.orange);
        g2D.drawPolygon(xPoints,yPoints,3);
        g2D.setPaint(Color.yellow);
        g2D.fillPolygon(xPoints, yPoints,3);

        //ball
        g2D.setPaint(Color.red);
        //g2D.drawArc(200,200,100,100,180,180);
        g2D.fillArc(200,200,100,100,0,180);
        g2D.setPaint(Color.white);
        g2D.fillArc(200,200,100,100,180,180);
        g2D.setPaint(Color.black);
        g2D.setStroke(new BasicStroke(4));
        g2D.drawOval(200,200,100,100);

        g2D.setStroke(new BasicStroke(10));
        g2D.drawLine(206,250,296,250);

        //inner
        g2D.setPaint(Color.black);
        g2D.drawOval(230,230,40,40);

        g2D.setPaint(Color.white);
        g2D.fillOval(231,231,38,38);

        g2D.setStroke(new BasicStroke(2));
        g2D.setPaint(Color.black);
        g2D.drawOval(238,238,24,24);

        g2D.drawString("I'm a string!", 428,490);

        g2D.drawImage(image,5,435,null); //draw image
    }
}
