package ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,500);



    ProgBar() throws InterruptedException {

        bar.setValue(0);
        bar.setBounds(15,0, 300,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Arial", Font.BOLD, 25));
        bar.setForeground(Color.red);   //fill colour for bar
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(350,100);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int counter = 500;
        while(counter > 0) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter -= 1;
        }
        bar.setString("Done!");
    }
}
