package SchoolProject;

import SchoolProject.GUI.OpenGUI;
import SchoolProject.Player.PlayerActions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        PlayerActions.onKeyPress(e, 0);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        PlayerActions.onKeyPress(e, 1);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        PlayerActions.onKeyPress(e, 2);
    }
}
