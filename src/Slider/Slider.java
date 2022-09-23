package Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    Slider() {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 0);
        slider.addChangeListener(this);

        slider.setPreferredSize(new Dimension(700,200));
        slider.setPaintTicks(true);     //here we enable to visibility of paint ticks.
        slider.setMinorTickSpacing(1);  //Minor tick spacing represents the interval between the tick display.
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10); //major tick spacing, similar to minor.
        slider.setPaintLabels(true);    //sets major tick value visible
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15)); //set font and size of tick display
        //slider.setOrientation(SwingConstants.VERTICAL); switches orientation of the slider itself to slide vertically rather than horizontally.
        label.setText("Temp C = " + slider.getValue());

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,250);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Temp C = " + slider.getValue());
    }
}
