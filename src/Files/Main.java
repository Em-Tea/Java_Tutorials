package Files;
import java.io.File;

// file is an abstract representation of file and directory path names
public class Main {
    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\Micha\\Desktop\\secret_message.txt"); //describing the full path in memory
        File file2 = new File("secret_message.txt");

        if(file1.exists()) {     // method checks if the file directory is correct
            System.out.println("That file exists! Wow.");
        }
        else {
            System.out.println("Cannot be found.");
        }

        System.out.println(file1.getPath());    //displays the local path within ide
        System.out.println(file1.getAbsolutePath());    //displays path in local memory
        System.out.println(file1.isFile());     //returns boolean value based on if the location is a file or not
        System.out.println();

        if(file2.exists()) {     // method checks if the file directory is correct
            System.out.println("That file exists! Wow.");
        }
        else {
            System.out.println("Cannot be found.");
        }
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.isFile());
    }
}
