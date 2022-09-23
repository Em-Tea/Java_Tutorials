package Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyFrame extends JFrame implements ActionListener { //we must implement the action listener to identify events.
    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("C:\\Users\\Micha\\Pictures\\smolterra.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Micha\\Pictures\\smallff.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,280, 200, 60);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);     //here we add the action listener to this button (this)
        //button.addActionListener(e -> System.out.println("Yo!"));  we have the option to remove our override and add a lambda expression to shorten code
        button.setText("Press here!");  //setting the text displayed on the button.
        button.setFocusable(false); //remove highlight around text of button when pressed
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 15));  // setting of font and text attributes
        button.setIconTextGap(-5);  // positions the text closer to the icon within the label
        button.setForeground(Color.blue);  // foreground sets the colour of text
        button.setBackground(Color.green);  // background colour of button component
        button.setBorder(BorderFactory.createEtchedBorder());  // border creation
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {    //an override which performs an action by using the source 'button'
        if(e.getSource()==button) {     //we use an if statement to execute code on click.
            //System.out.println("Hey");
            label.setVisible(true);
        }

    }
}
