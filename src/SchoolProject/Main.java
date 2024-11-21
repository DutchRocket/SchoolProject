package SchoolProject;

import SchoolProject.GUI.OpenGUI;
import SchoolProject.GameStats.GameStats;
import SchoolProject.Global.Location;
import SchoolProject.Level.CreateLevels;
import SchoolProject.Level.Level;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Player.Player;
import SchoolProject.Player.PlayerFactory;
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
        gameStats = new GameStats(new ArrayList<>(), null, PlayerFactory.createPlayerOne());
        OpenGUI.openGUI();
        CreateLevels.createLevels();
        LoadLevel.loadLevel(gameStats.getLevels().get(0));
        System.out.println("hoi");
        Timer frameTick = new Timer(1000/gameStats.getFrameRate(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateGUI.updateGUI();
            }
        });
        frameTick.start();
        Timer gameTick = new Timer(1000/gameStats.getGameSpeed(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameEvents.gameTick();
            }
        });
        gameTick.start();
    }
}