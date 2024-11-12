package SchoolProject.Level;

import SchoolProject.Level.Object.Platform;
import SchoolProject.Level.Object.PlatformPanel;
import SchoolProject.Main;
import SchoolProject.Player.Player;

import javax.swing.*;
import java.awt.*;

public class LoadLevel {

    public static void loadLevel(Level level){
        Player player = Main.gameStats.getPlayer();
        PlatformPanel platformPanel = new PlatformPanel(level.platforms, player, level);

        JFrame frame = Main.gameStats.getFrame();
        frame.setContentPane(platformPanel);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}
