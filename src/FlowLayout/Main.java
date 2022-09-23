package FlowLayout;

/*
The flow layout manager defines a natural layout for components within a container.
FlowLayout = places components in a row, sized at their preferred size. If the horizontal space
in the container is too small, the FlowLayout uses the next available row.
 */

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));  //by default, frames use a border layout
        //we can also pass in a flowlayout position which dictates where our components are anchored. as well as spacing

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
        new JButton();

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("0"));

        frame.add(panel);
        frame.setVisible(true);  //set visibility at very end
    }
}
