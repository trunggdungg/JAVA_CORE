package tetrisgamee;

import javax.swing.JOptionPane;

public class TetrisGamee {

    private static GameForm gameForm;
    private static StartUpForm startUpForm;
    private static LeaderBoard leaderBoard;

    private static AudioPlayer audioPlayer = new AudioPlayer();

    public static void start() {
        gameForm.setVisible(true);
        gameForm.startGame();
        leaderBoard.setVisible(false);
    }

    public static void showLeader() {
        leaderBoard.setVisible(true);
    }

    public static void showStartUp() {
        startUpForm.setVisible(true);
    }

    public static void gameOver(int scoreValue) {
        String namePlayer = JOptionPane.showInputDialog("Game Over!\nNhập tên của bạn.");
        System.out.println(namePlayer);

        gameForm.setVisible(false);

        leaderBoard.addPlayer(namePlayer, scoreValue);
        leaderBoard.saveDate();
    }

    public static void playDeleteSound() {
        audioPlayer.DeleteSound();
    }

    public static void playMoveSound() {
        audioPlayer.MoveSound();
    }

    public static void playThemeSound() {
        audioPlayer.ThemeSound();
    }

    public static void playGameOverSound() {
        audioPlayer.GameOverSound();
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // new GameForm().setVisible(true);
                gameForm = new GameForm();
                startUpForm = new StartUpForm();
                leaderBoard = new LeaderBoard();

              
                leaderBoard.saveDate();
                startUpForm.setVisible(true);
            }
        });
    }

}
