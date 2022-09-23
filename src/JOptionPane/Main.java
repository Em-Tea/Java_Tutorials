package JOptionPane;

import javax.swing.*;

//Pops up a standard dialog box that prompts users for a value or informs them of something
public class Main {
    public static void main(String[] args) {
        //using joptionpane show message dialogue function to pass in arguments.
        //JOptionPane.showMessageDialog(null, "This is some useless info", "I'm a title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "I'm an information message", "I'm a title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "I'm a question message", "I'm a title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a warning message", "I'm a title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is an error message", "I'm a title", JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null, "Do you like to eat Quesadillas?", "Tell me now", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?: ");

        String[] responses = {"No, you are.", "Thanks...", "Cries"};  //Here we use an array of strings to use as responses within the pane.

        ImageIcon icon = new ImageIcon("C:\\Users\\Micha\\Pictures\\smolterra.png");    //instantiating and assigning an icon for use within the JOptionPane
        JOptionPane.showOptionDialog(null,      //parent
                "You're the worst",         //message
                "Secret Message",           //title
                JOptionPane.YES_NO_CANCEL_OPTION,   //type
                JOptionPane.INFORMATION_MESSAGE,    //ty[e
                icon,   //icon in use
                responses,  //button responses.
                0 );    //initial selection

    }
}
