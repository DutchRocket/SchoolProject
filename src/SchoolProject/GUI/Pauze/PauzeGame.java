package SchoolProject.GUI.Pauze;

import SchoolProject.Game.GameStats;
import SchoolProject.Main;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class PauzeGame {
    public static void gamePauzed(KeyEvent e){
        int input = e.getKeyCode();
        if(input == 27){
            pauzeGame();
        }
    }

    public static void pauzeGame(){
        Timer updateGame = Main.gameStats.getUpdateGame();
        if(updateGame.isRunning()) {
            updateGame.stop();
            Main.gameStats.setGamePauzed(true);
        }else{
            updateGame.start();
            Main.gameStats.setGamePauzed(false);
        }
    }
}
