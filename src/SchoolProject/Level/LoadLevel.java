package SchoolProject.Level;

import SchoolProject.Level.Object.GamePanel;
import SchoolProject.Level.Object.Platform;
import SchoolProject.Level.Object.GamePanel;
import SchoolProject.Main;
import SchoolProject.Player.Player;

import javax.swing.*;
import java.awt.*;

public class LoadLevel {

    public static void loadLevel(Level level){
        Player player = Main.gameStats.getPlayer();
        GamePanel gamePanel = new GamePanel(level.getPlatforms(), player, level);
        JFrame frame = Main.gameStats.getFrame();
        Main.gameStats.setGamePanel(gamePanel);
        frame.setContentPane(gamePanel);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}
