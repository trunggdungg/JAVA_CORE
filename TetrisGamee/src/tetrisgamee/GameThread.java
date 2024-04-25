package tetrisgamee;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameThread extends Thread {

    private GameArea gameArea;
    private GameForm gameForm;
    
    private int score;
    private int level = 1;
    private int scoreLevel = 3;
    private int speed = 1000;
    private int speedLVL = 100;

      private boolean isPaused = false;
    public GameThread(GameArea gameArea, GameForm gameForm) {
        this.gameArea = gameArea;
        this.gameForm = gameForm;
        
        gameForm.updateLevel(level);
        gameForm.updateScore(score);
    }
    
     public void pause() {
        isPaused = true;
    }

    public void continueGame() {
        isPaused = false;
        synchronized (this) {
            notify();
        }
    }

    public boolean isPaused() {
        return isPaused;
    }

    @Override
    public void run() {
        while (true) {
            gameArea.spawnBlock();
            while (gameArea.moveBlockDown() == false) {
                
                if (isPaused) {
                    synchronized (this) {
                        try {
                            wait();
                        } catch (InterruptedException ex) {
                          //  Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
                          return;
                        }
                    }
                }
                try {

                    Thread.sleep(speed);
                } catch (InterruptedException ex) {
                    //Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                }
            }

            if (gameArea.isBlockOutOfBounds()) {
                TetrisGamee.playGameOverSound();
                TetrisGamee.gameOver(score);
                break;
            }

            gameArea.blockOnBackground();
            score = score + gameArea.checkLine();
            gameForm.updateScore(score);

//            
//    private int score;
//    private int level = 1;
//    private int scoreLevel = 3;
//    private int speed = 1000;
//    private int speedLVL = 100;

            int lvl = score / scoreLevel + 1;
            if (lvl > level) {
                level = lvl;
                gameForm.updateLevel(level);
                speed = speed - speedLVL;
            }

        }

    }
}
