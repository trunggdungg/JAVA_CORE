
package tetrisgamee;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class AudioPlayer {
    private String soundFolder = "sound/" + File.separator;
    private String deleteSoundPath = soundFolder + "clear (online-audio-converter.com).wav";
    private String moveSoundPath = soundFolder + "move (online-audio-converter.com).wav";
    private String themeSoundPath = soundFolder + "theme (online-audio-converter.com).wav";
    private String gameOverSoundPath = soundFolder + "game-over-101soundboards (online-audio-converter.com).wav";

    private Clip deleteSound, moveSound, themeSound, gameOverSound;

    public AudioPlayer() {

        try {
            deleteSound = AudioSystem.getClip();
            moveSound = AudioSystem.getClip();
            themeSound = AudioSystem.getClip();
            gameOverSound = AudioSystem.getClip();

            deleteSound.open(AudioSystem.getAudioInputStream(new File(deleteSoundPath).getAbsoluteFile()));
            moveSound.open(AudioSystem.getAudioInputStream(new File(moveSoundPath).getAbsoluteFile()));
            themeSound.open(AudioSystem.getAudioInputStream(new File(themeSoundPath).getAbsoluteFile()));
            gameOverSound.open(AudioSystem.getAudioInputStream(new File(gameOverSoundPath).getAbsoluteFile()));
        } catch (LineUnavailableException ex) {
            Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeleteSound() {
        deleteSound.setFramePosition(0);
        deleteSound.start();
    }

    public void MoveSound() {
        moveSound.setFramePosition(0);
        moveSound.start();
    }

    public void ThemeSound() {
        themeSound.setFramePosition(0);
        themeSound.start();
    }
    
      public void GameOverSound() {
        gameOverSound.setFramePosition(0);
        gameOverSound.start();
    }
}
