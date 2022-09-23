package Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image terra;
    Image bgimage;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        terra = new ImageIcon("C:\\Users\\Micha\\Pictures\\smolterra.png").getImage();  //assigning the terra image
        bgimage = new ImageIcon("C:\\Users\\Micha\\Pictures\\ffbg.jpg").getImage(); //assigning the background image
        timer = new Timer(10,this);   //every one second and action is performed with an action listener
        timer.start();      //starting the timer. Remember this is what triggers our listener to perform a block - very basic set up.
    }

    public void paint(Graphics g) {
        super.paint(g); //this will paint back ground. We need to use super to call the parent class

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(bgimage,0,0,null); //drawing the background image
        g2D.drawImage(terra, x,y,null);     //drawing the terra image

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        Here, we introduce and if statement to check if the image attempts to go out of bounds of the panel and frame. We do this by comparing our x and y coordinates
        of the drawn image, to the PANEL_WIDTH MINUS the width of the image. Then an OR operator is used to check for the widths lowest bounds, the left of the screen
         */
        if (x >= PANEL_WIDTH - terra.getWidth(null) || x < 0) {
            xVelocity = xVelocity * - 1;    //here, the velocity of the direction is inverted by multiplying 1 by -1 = -1 and then again -1 * -1 = 1, creating a loop.
        }
        x = x + xVelocity;

        if (y >= PANEL_HEIGHT - terra.getWidth(null) || y < 0) {
            yVelocity = yVelocity * - 1;
        }
        y = y + yVelocity;

        repaint();  //repaint is the method that repaints the position of the drawn 2D graphics - this is what makes the entire thing function (as well as the timer)
    }
}
