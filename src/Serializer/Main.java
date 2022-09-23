package Serializer;
import java.io.*;
/*
Serialization is the process of converting an object into a byte stream. Persists (saves the state) the object after program exists.
This byte steam can be saved as a file or sent over a network to another machine.
Byte stream can be saved as a file (.ser) which is platform independent (this of this as if you're saving a file with the object's information)

Deserialization = The reverse process of converting a byte steam into an object. (Think of this as if you're loading a saved file)

Serialized objects are transferred into a universal byte code to be shared - this is identified with a UID which acts as a version number
of an instance of a serialized class.

 */

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException { //make sure exceptions are included
        User user = new User();

        user.name = "Michael";
        user.password = "passywordy";

        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Micha\\Desktop\\UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Saved");

        //Below we deserialize - should be done within another project

        /*
        FileInputStream fileIn = new FileInputStream("insert\\url");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
        */


    }
}
