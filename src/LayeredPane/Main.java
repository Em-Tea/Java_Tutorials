package LayeredPane;
import javax.swing.*;
import java.awt.*;

//JLayered pane is a swing container that provides a third dimension for positioning components ex. depth, z-index.

public class Main {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();       //instantiating labels to use within the frame
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.yellow);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();  //instantiating and defining the bounds of the layeredPane
        layeredPane.setBounds(0,0 ,500,500);
        layeredPane.add(label1, Integer.valueOf(0));    //here we add our components, making sure to denote a layer index, 0 being the 'bottom'
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(2));

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
