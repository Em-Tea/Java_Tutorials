package NewWindow;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();

    JButton myButton = new JButton("New Window");

    LaunchPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);   //instantiating an action listener and passing in this object

        frame.add(myButton);        // adding button

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //standard frame set up.
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton) {   //block that runs when our event occurs
            frame.dispose(); // this closes out of our old frame.
            NewWindow myWindow = new NewWindow();   //here we use a click event to instantiate a new window object, then we define its attributes within its class.
        }
    }
}
