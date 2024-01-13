import java.util.Scanner;
import java.util.jar.Manifest;
import javax.sound.sampled.*;
import java.io.File;
public class Musik {
    static String strResponse;
    public static void main(String[] args) {
        new Musik();
    }
    public Musik() {
        try{
            File filename = new File("D:\\BelajarJavaVSC\\Latihan\\lagu.wav"); 
            AudioInputStream audio = AudioSystem.getAudioInputStream(filename);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            Scanner scan = new Scanner (System.in);
            System.out.print("Press any key To play the audio");
            strResponse = scan.next();
            clip.start();
            System.out.println("The audio is playing!!");
            Thread.sleep(45000);

        }catch (Exception e) {
            
        }

    } 
}
