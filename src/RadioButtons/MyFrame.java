package RadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamButton;
    JRadioButton hotButton;

    ImageIcon pizzaIcon;
    ImageIcon hamIcon;
    ImageIcon hotIcon;

    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("C:\\Users\\Micha\\Downloads\\pizza.png");
        hamIcon = new ImageIcon("C:\\Users\\Micha\\Downloads\\hamburger.png");
        hotIcon = new ImageIcon("C:\\Users\\Micha\\Downloads\\hot-dog.png");

        pizzaButton = new JRadioButton("Pizza");
        hamButton = new JRadioButton("Hamburger");
        hotButton = new JRadioButton("Hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamButton);
        group.add(hotButton);

        pizzaButton.addActionListener(this);
        hamButton.addActionListener(this);
        hotButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamButton.setIcon(hamIcon);
        hotButton.setIcon(hotIcon);

        this.add(pizzaButton);
        this.add(hamButton);
        this.add(hotButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton) {
            System.out.println("You ordered pizza");
        }
        if(e.getSource()==hamButton) {
            System.out.println("You ordered a hamburger");
        }
        if(e.getSource()==hotButton){
            System.out.println("You ordered a hotdog");
        }
    }
}
