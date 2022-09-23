package SnakeGame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
//Frame class to place the panel within

public class GameFrame extends JFrame {
    GameFrame() throws IOException {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //take our jframe and fit it around component size
        this.setVisible(true);
        this.setLocationRelativeTo(null); //sets opening location to the center of the computer screen
    }
}
