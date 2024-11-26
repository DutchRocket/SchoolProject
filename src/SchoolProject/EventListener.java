package SchoolProject;

import SchoolProject.GUI.Pauze.PauzeGame;
import SchoolProject.GUI.Pauze.PauzeMenuListener;
import SchoolProject.Player.PlayerActions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        PlayerActions.onKeyPress(e, 0);
        PauzeGame.gamePauzed(e);
        PauzeMenuListener.pauzeMenuListener(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        PlayerActions.onKeyPress(e, 1);
    }
}
