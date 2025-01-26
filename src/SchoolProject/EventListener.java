package SchoolProject;

import SchoolProject.GUI.Pauze.PauzeGame;
import SchoolProject.GUI.Pauze.PauzeMenuListener;
import SchoolProject.GUI.Startmenu.CreateStartMenu;
import SchoolProject.Game.GameStats;
import SchoolProject.Player.PlayerActions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(Main.gameStats.isGameStarted()) {
            //only at spacebar?
            if (!Main.gameStats.isGamePauzed()) {
                PlayerActions.onKeyPress(e, 0);
            }
            PauzeMenuListener.pauzeMenuListener(e);
            PauzeGame.gamePauzed(e);
        }else{
            CreateStartMenu.startGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        PlayerActions.onKeyPress(e, 1);
    }
}
