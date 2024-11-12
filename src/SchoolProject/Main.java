package SchoolProject;

import SchoolProject.GUI.OpenGUI;
import SchoolProject.GameStats.GameStats;
import SchoolProject.Global.Location;
import SchoolProject.Level.CreateLevels;
import SchoolProject.Level.Level;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Player.Player;
import SchoolProject.gameTick.GameEvents;
import SchoolProject.gameTick.UpdateGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static GameStats gameStats;

    public static void main(String[] args) {
        gameStats = new GameStats(new ArrayList<>(), null, new Player(Color.GREEN, "Rocket", 10, 100, 50, 50, new Location(0, 0)));
        OpenGUI.openGUI();
        CreateLevels.createLevels();
        LoadLevel.loadLevel(gameStats.getLevels().get(0));
        System.out.println("hoi");
        Timer timer = new Timer(gameStats.getFrameRate(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateGUI.updateGUI();
            }
        });
        timer.start();
        Timer timer2 = new Timer(gameStats.getGameSpeed(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameEvents.gameTick();
            }
        });
        timer2.start();
    }
}