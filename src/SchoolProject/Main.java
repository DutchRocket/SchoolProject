package SchoolProject;

import SchoolProject.GUI.OpenGUI;
import SchoolProject.GameStats.GameStats;
import SchoolProject.Level.CreateLevels;
import SchoolProject.Level.Level;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static GameStats gameStats;

    public static void main(String[] args) {
        gameStats = new GameStats(new ArrayList<Level>(), null, new Player(Color.GREEN, "Rocket", 10, 10, 50, 50));
        OpenGUI.openGUI();
        CreateLevels.createLevels();
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(0));
        System.out.println(" hoi");
    }
}