package SchoolProject.Game;

import SchoolProject.GUI.Pauze.Button;
import SchoolProject.GUI.Pauze.CreatePauzeMenu;
import SchoolProject.GUI.Pauze.PauzeMenu;
import SchoolProject.Level.Level;
import SchoolProject.Level.Object.Platform;
import SchoolProject.Main;
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
    private PauzeMenu pauzeMenu;

    // Constructor to pass platforms, player, and level to this panel
    public GamePanel(List<Platform> platforms, Player player, Level level, PauzeMenu pauzeMenu) {
        this.platforms = platforms;
        this.player = player;
        this.level = level;
        this.pauzeMenu = pauzeMenu;
        // Set preferred size for your panel (optional, depends on your layout)
        this.setPreferredSize(new Dimension(2000, 2000));  // Change dimensions based on your requirements
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
        g.setColor(Color.RED);
        g.drawRect(player.getLoc().getX(), player.getLoc().getY(), player.getW(), player.getH());
        g.setColor(player.getColor());
        g.drawImage(image, player.getLoc().getX(), player.getLoc().getY(), player.getW(), player.getH(), null);

        //draw pauzemenu
        if(Main.gameStats.gamePauzed) {
            g.setColor(pauzeMenu.getColor());
            g.fillRect(pauzeMenu.getLocation().getX(), pauzeMenu.getLocation().getY(), pauzeMenu.getWidth(), pauzeMenu.getHeight());
            //draw buttons
            for (Button b : pauzeMenu.getButtons()) {
                g.setColor(b.getColor());
                if(b.isSelected()){
                    g.setColor(Color.ORANGE);
                }
                g.fillRect(b.getLoc().getX(), b.getLoc().getY(), b.getWidth(), b.getHeight());
                g.setColor(b.getTextColor());
                g.setFont(b.getTextFont());
                g.drawString(b.getText(), b.getTextLocation().getX(), b.getTextLocation().getY());
            }
        }
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
