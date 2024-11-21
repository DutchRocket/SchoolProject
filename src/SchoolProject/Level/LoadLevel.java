package SchoolProject.Level;

import SchoolProject.Global.Location;
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
        player.setLoc(new Location(level.getSpawnX(), level.getSpawnY()));
        GamePanel gamePanel = new GamePanel(level.getPlatforms(), player, level);
        Main.gameStats.setGamePanel(gamePanel);
        JFrame frame = Main.gameStats.getFrame();
        frame.setContentPane(gamePanel);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}
