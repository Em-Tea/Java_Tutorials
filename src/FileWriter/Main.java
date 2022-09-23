package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        Here to write to a file, we use the FileWriter object and class
        first instantiate and then utilize methods
         */
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nMy name is Michael \nHello");
            writer.append("\n(A poem by MT)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

