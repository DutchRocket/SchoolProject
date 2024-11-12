package SchoolProject.gameTick;

import SchoolProject.Level.Level;
import SchoolProject.Level.Object.GamePanel;
import SchoolProject.Main;
import SchoolProject.Player.Player;

import javax.swing.*;
import java.awt.*;

public class UpdateGUI {
    public static boolean updateGUI(){
        JFrame frame = Main.gameStats.getFrame();
        Player player = Main.gameStats.getPlayer();
        Level level = Main.gameStats.getLevels().get(Main.gameStats.getLevel());
        GamePanel gamePanel = Main.gameStats.getGamePanel();
        gamePanel.setPlayer(player);
        gamePanel.setPlatforms(level.getPlatforms());
        gamePanel.repaint();
        return true;
    }
}
