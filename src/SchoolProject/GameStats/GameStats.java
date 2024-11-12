package SchoolProject.GameStats;

import SchoolProject.Level.Level;
import SchoolProject.Player.Player;

import javax.swing.*;
import java.util.ArrayList;

public class GameStats {
    ArrayList<Level> levels;
    JFrame frame;
    Player player;

    public GameStats(ArrayList<Level> levels, JFrame frame, Player player) {
        this.levels = levels;
        this.frame = frame;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Level> getLevels() {
        return levels;
    }

    public void setLevels(ArrayList<Level> levels) {
        this.levels = levels;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
