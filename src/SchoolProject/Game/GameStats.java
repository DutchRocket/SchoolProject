package SchoolProject.Game;

import SchoolProject.GUI.Pauze.PauzeMenu;
import SchoolProject.Level.Level;
import SchoolProject.Player.Player;

import javax.swing.*;
import java.util.ArrayList;

public class GameStats {
    ArrayList<Level> levels;
    JFrame frame;
    Player player;
    boolean gameOver;
    int level;
    GamePanel gamePanel;
    int frameRate;
    int gameSpeed;
    Timer updateFrame;
    Timer updateGame;
    boolean gamePauzed;
    PauzeMenu pauzeMenu;

    public GameStats(ArrayList<Level> levels, JFrame frame, Player player, PauzeMenu pauzeMenu) {
        this.levels = levels;
        this.frame = frame;
        this.player = player;
        this.gameOver = false;
        this.pauzeMenu = pauzeMenu;
        this.level = 1;
        this.frameRate = 60;
        this.gameSpeed = 100;
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public void setGamePanel(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(int frameRate) {
        this.frameRate = frameRate;
    }

    public int getGameSpeed() {
        return gameSpeed;
    }

    public void setGameSpeed(int gameSpeed) {
        this.gameSpeed = gameSpeed;
    }

    public Timer getUpdateFrame() {
        return updateFrame;
    }

    public void setUpdateFrame(Timer updateFrame) {
        this.updateFrame = updateFrame;
    }

    public Timer getUpdateGame() {
        return updateGame;
    }

    public void setUpdateGame(Timer updateGame) {
        this.updateGame = updateGame;
    }

    public boolean isGamePauzed() {
        return gamePauzed;
    }

    public void setGamePauzed(boolean gamePauzed) {
        this.gamePauzed = gamePauzed;
    }

    public PauzeMenu getPauzeMenu() {
        return pauzeMenu;
    }

    public void setPauzeMenu(PauzeMenu pauzeMenu) {
        this.pauzeMenu = pauzeMenu;
    }
}
