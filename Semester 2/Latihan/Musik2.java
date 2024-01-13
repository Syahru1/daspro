import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;

public class Musik2 {
    public static void main(String[] args) {
        new Musik2();
    }

    public Musik2() {
        try {
            File filename = new File( "D:\\BelajarJavaVSC\\Latihan\\lagu.wav"); 
            AudioInputStream audio = AudioSystem.getAudioInputStream(filename);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            Scanner scan = new Scanner(System.in);
            System.out.print("Press Enter to play the audio...");
            scan.nextLine();

            clip.start();
            System.out.println("The audio is playing!!");
            Thread.sleep(45000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

