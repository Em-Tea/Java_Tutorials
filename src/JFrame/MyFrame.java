package JFrame;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(String Title, int Width, int Height, int Red, int Green, int Blue) {
        this.setTitle(Title); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes out of application
        this.setResizable(false); // prevents this from being resized.
        this.setSize(Width, Height); //sets the x and y dimensions of this.
        this.setVisible(true); // changing the boolean value of the visibility associated with this object.

        ImageIcon image = new ImageIcon("C:\\Users\\Micha\\Pictures\\terraicon.jpg"); //creating new object to hold image
        this.setIconImage(image.getImage());   //setting the this icon to our image
        this.getContentPane().setBackground(new Color(Red, Green, Blue)); //change colour of background
    }
}
