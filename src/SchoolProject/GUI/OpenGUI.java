package SchoolProject.GUI;

import SchoolProject.EventListener;
import SchoolProject.GameStats.GameStats;
import SchoolProject.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class OpenGUI {
    public static void openGUI(){
        JFrame f = new JFrame("Game");
        f.setTitle("SchoolGame");
        f.setExtendedState(Frame.MAXIMIZED_BOTH);
        f.setUndecorated(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setFocusable(true);
        f.setFocusTraversalKeysEnabled(true);
        f.setVisible(true);
        EventListener listener = new EventListener();
        f.addKeyListener(listener);
        f.requestFocusInWindow();
        Main.gameStats.setFrame(f);
    }
}
