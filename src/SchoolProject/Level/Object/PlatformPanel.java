package SchoolProject.Level.Object;

import SchoolProject.Level.Level;
import SchoolProject.Level.Object.Platform;
import SchoolProject.Player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PlatformPanel extends JPanel {
    private List<Platform> platforms;
    private Player player;
    private Level level;

    // Constructor to pass platforms, player, and level to this panel
    public PlatformPanel(List<Platform> platforms, Player player, Level level) {
        this.platforms = platforms;
        this.player = player;
        this.level = level;
        // Set preferred size for your panel (optional, depends on your layout)
        this.setPreferredSize(new Dimension(800, 600));  // Change dimensions based on your requirements
    }

    @Override
    protected void paintComponent(Graphics g) {
        //repeat this function?
        super.paintComponent(g);  // Ensures that the panel is properly redrawn

        // Draw all platforms
        for (Platform p : platforms) {
            g.setColor(p.getColor());
            g.fillRect(p.getX(), p.getY(), p.getW(), p.getH());
        }

        // Draw the player
        g.setColor(player.getColor());
        g.fillRect(level.getSpawnX(), level.getSpawnY(), player.getW(), player.getH());
    }
}

