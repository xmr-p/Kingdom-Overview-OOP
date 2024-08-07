import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
public class Instrument {
    String sound;

    public Instrument(String sound) {
        this.sound = sound;
    }

    void play() {
        try {
            File archivoSonido = new File("sounds/" + sound + ".wav");

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivoSonido);

            Clip clip = AudioSystem.getClip();

            clip.open(audioStream);

            clip.start();

            System.out.println("Playing..." + sound);
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio format");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error opening file");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Unavailable audio line");
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
