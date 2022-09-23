package JFrame;

// The JFrame is a GUI window in which we can add components to.
// File file = new File("C:\\Users\\Micha\\Downloads\\OOT_Fanfare_Item.wav");

public class Main {
    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame(); //creates the frame itself, but it is not visible by default.
        frame.setTitle("My JFrame"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes out of application
        frame.setResizable(false); // prevents frame from being resized.
        frame.setSize(420,420); //sets the x and y dimensions of frame.
        frame.setVisible(true); // changing the boolean value of the visibility assosiated with frame object.

        ImageIcon image = new ImageIcon("C:\\Users\\Micha\\Pictures\\terraicon.jpg"); //creating new object to hold image
        frame.setIconImage(image.getImage());   //setting the frame icon to our image
        frame.getContentPane().setBackground(new Color(0,120,99)); //change colour of background
         */

        MyFrame myFrame = new MyFrame("Window", 300, 300, 220, 220, 0);

    }
}
