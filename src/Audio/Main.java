package Audio;

//C:\Users\Micha\Downloads\OOT_Fanfare_Item.wav

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

// Here we cover methods and techniques used to play audio clips.

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {    //exceptions are sometimes required by methods.

        Scanner scanner = new Scanner(System.in);       //Here we create a new scanner for reading the 'response'
        File file = new File("C:\\Users\\Micha\\Downloads\\OOT_Fanfare_Item.wav");      //instantiating new file object and assigning it to 'file' This now contains out file from path.
        AudioInputStream audStream = AudioSystem.getAudioInputStream(file);    //here we pass the file into a get audio stream method, and then store it within the 'audstream' object/
        Clip clip = AudioSystem.getClip();     // We now instantiate our clip object to accommodate the audio stream.
        clip.open(audStream);       //here we use the clip.open method to run the 'audStream'

        String response = "";   //Initialising variables outside of the loop.
        while(!response.equals("Q")) {  //Loop continues when input does not equal "Q"
            System.out.println("P = Play, S = Stop, R = Replay. Q = Quit");
            response = scanner.next();
            response = response.toUpperCase(); //reading input and applying the to upper case method to check conditional switch cases.

            switch(response){   //our switch is evaluating the response data.
                case ("P"): clip.start();   // Case if p or P is typed - starts clip
                    break;
                case ("S"): clip.stop();    //Case if s is typed - this stops the clip
                    break;
                case ("R"): clip.setMicrosecondPosition(0); //case if R os typed - resets the time line of the audio being played.
                    break;
                case ("Q"): clip.close();   //Case q closes the clip to
                    break;
                default: System.out.println("Not a valid response.");   //printing validation response to user.
            }
        }
        System.out.println("Audio closed."); //confirmation of exit

    }
}
