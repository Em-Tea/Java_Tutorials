package ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JCombo boxes is a component that combines a button or editable field and a drop down list.
public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;
    MyFrame(){

        String[] animals = {"Dog", "Cat", "Bird"}; //Make sure to only pass in reference data types to an array otherwise it will not work. Use wrapper class
        Integer[] numbers = {1,2,3,4};

        comboBox = new JComboBox(animals);  //Here, we instantiate our combobox and pass in the array listed above.
        comboBox.addActionListener(this);   //Using action listener method to pass in the 'this' object.

        //comboBox.setEditable(true); this function allows the combobox to be edited or searched for by typing within the combobox field.
        System.out.println(comboBox.getItemCount());    //this function allows us to return the amount of items present within the passed in array of the combobox.
        comboBox.addItem("Horse"); //this function allows us to add items to the combo box as well as the array.
        comboBox.insertItemAt("Pig",0); //here we can define where we'd like a new list item to be placed in the box using an index.
        comboBox.setSelectedIndex(0);   //this function allows us to set the default selection index within the dropdown menu.
        //comboBox.removeItem("Cat");   //remove item
        //comboBox.removeItemAt(0);     //remove item using an index
        //comboBox.removeAllItems();    //removies all items from the combobox

        this.add(comboBox);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {        //override for the action listener that allows us to respond to a selection with a block.
        if(e.getSource()==comboBox) {
            System.out.println(comboBox.getSelectedItem());
            //System.out.println(comboBox.getSelectedIndex());
        }
    }
}
