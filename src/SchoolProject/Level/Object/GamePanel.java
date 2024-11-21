package SchoolProject.Level.Object;

import SchoolProject.Level.Level;
import SchoolProject.Player.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class GamePanel extends JPanel {
    private List<Platform> platforms;
    private Player player;
    private Level level;

    // Constructor to pass platforms, player, and level to this panel
    public GamePanel(List<Platform> platforms, Player player, Level level) {
        this.platforms = platforms;
        this.player = player;
        this.level = level;
        // Set preferred size for your panel (optional, depends on your layout)
        this.setPreferredSize(new Dimension(800, 600));  // Change dimensions based on your requirements
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Ensures that the panel is properly redrawn

        // Draw all platforms
        for (Platform p : platforms) {
            g.setColor(p.getColor());
            g.fillRect(p.getX(), p.getY(), p.getW(), p.getH());
        }

        // Draw the player
        BufferedImage image;
        try {
            image = ImageIO.read(new File("C:\\Users\\robin\\IdeaProjects\\SchoolProject\\src\\SchoolProject\\Sprites\\Adventurer_Idle.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.setColor(player.getColor());
        g.drawImage(image, (int) player.getLoc().getX(), (int) player.getLoc().getY(), player.getW(), player.getH(), null);
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}

