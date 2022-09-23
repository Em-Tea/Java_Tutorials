package FileReader;
// The file reader allows us to read the contents of a file as a stream of characters on by one
// read(); returns an integer value which contains the byte value
// when read() returns -1, there is no more data to be read.

import java.io.FileReader; // imports
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try { // this code must be enclosed within a try and catch block for some reason or it redlines.
            /*
            Below we are instantiating an object named reader as a new FileReader - a built-in java class.
            We then define the path of the file itself to instruct the object which file to read.
             */
            FileReader reader = new FileReader("C:\\Users\\Micha\\Desktop\\art.txt");
            /*
            The read method we intend on returning reads each individual character, and returns it as an int.
            we must initialise an int (the native return type for read) which stores the return value of the read method.
             */
            int data = reader.read();
            /*
            Then we create a while loop which prints out each individual character by casting the read data as a string.
            When the read method returns an index of -1, it means it's reached the end and is trying to loop back on itself
            this is why we write in a condition that checks the int value of the read method return before casting.

             */
            while(data != -1) {
                System.out.print((char)data);   //here, we cast the return value as a character
                data = reader.read();
            }

            reader.close();     //closing the reader to save memory

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
