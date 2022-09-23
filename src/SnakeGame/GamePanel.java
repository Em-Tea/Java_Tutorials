package SnakeGame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

//panel class which holds game itself

public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    public int DELAY = 100;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int points;
    int pointX;
    int pointY;
    char direction = 'R';
    public boolean running = false;

    final BufferedImage coprinus = ImageIO.read(new File("C:\\Users\\Micha\\Pictures\\coprinus.png"));
    final Image BG  = ImageIO.read(new File("C:\\Users\\Micha\\Pictures\\snakebg.jpg"));

    Timer timer;
    Random random;



    GamePanel() throws IOException {
        random = new Random();  //instantiating our random object
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));  //passing in constants as panel size (pack will take care of the frame)
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdaper());
        startGame();  //start game method being called
    }

    public void startGame() {
        newPoint();     //calling our newPoint method to place a point on the screen
        running = true; //reassigning boolean running value to show the game is running
        timer = new Timer(DELAY, this); //instantiating our timer and passing in our constant delay value and listening object
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if(running) {
            for(int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {    //not 100% here tbh
                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
            }

            g.setColor(Color.red);
            //g.fillOval(pointX, pointY, UNIT_SIZE, UNIT_SIZE);
            //g.drawImage(BG,0,0,null);
            g.drawImage(coprinus, pointX, pointY, null);

            for(int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Coprinus :" + points, (SCREEN_WIDTH - metrics.stringWidth("Coprinus :" + points)) /2, g.getFont().getSize());

        }
        else {
            gameOver(g);
        }
    }

    public void newPoint(){
        pointX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE)) * UNIT_SIZE;
        pointY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE)) * UNIT_SIZE;
    }

    public void move() {
        for(int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U': y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D': y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L': x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R': x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }

    public void checkPoint() {
        if((x[0] == pointX) && (y[0] == pointY)) {
            bodyParts++;
            points++;
            newPoint();
        }
    }

    public void checkCollisions() {
        //this checks if the head collides with body
        for(int i = bodyParts; i > 0; i--) {
            if((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        //check if head touches left border
        if(x[0] < 0) {
            running = false;
        }
        //check if head touches right
        if(x[0] > SCREEN_WIDTH){
            running = false;
        }
        //check if head touches upper border
        if(y[0] < 0) {
            running = false;
        }
        //check if head touches bottom border
        if(y[0] > SCREEN_HEIGHT) {
            running = false;
        }
        //stop timer when the game ends
        if(!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
        //Game over text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics1.stringWidth("Game Over"))/2,  SCREEN_HEIGHT/2);
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Coprinus: " + points, (SCREEN_WIDTH - metrics2.stringWidth("Coprinus :" + points)) /2, g.getFont().getSize());
    }


    //Override below --------------
    @Override
    public void actionPerformed(ActionEvent e) {

        if(running) {
            move();
            checkPoint();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdaper extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT :
                    if(direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }

    }

}
