package SchoolProject;

import SchoolProject.GUI.OpenGUI;
import SchoolProject.GUI.Pauze.CreatePauzeMenu;
import SchoolProject.Game.GameStats;
import SchoolProject.Level.CreateLevels;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Player.PlayerFactory;
import SchoolProject.gameTick.GameEvents;
import SchoolProject.gameTick.UpdateGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static GameStats gameStats;

    public static void main(String[] args) {
        //start the game
        startGame();
    }

    private static void startGame(){
        //create gamestats file
        gameStats = new GameStats(new ArrayList<>(), null, PlayerFactory.createPlayerOne(), CreatePauzeMenu.createPauzeMenu());
        //create GUI
        OpenGUI.openGUI();
        //create the levels
        CreateLevels.createLevels();
        //load first level (needs to become startgamemenu)
        LoadLevel.loadLevel(gameStats.getLevels().get(1));
        //create timers
        createTimers();
    }

    private static void createTimers(){
        //create timers
        Timer frameTick = new Timer(1000/gameStats.getFrameRate(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateGUI.updateGUI();
            }
        });
        Timer gameTick = new Timer(1000/gameStats.getGameSpeed(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameEvents.gameTick();
            }
        });
        //start timers
        frameTick.start();
        gameTick.start();
        //save timers
        gameStats.setUpdateFrame(frameTick);
        gameStats.setUpdateGame(gameTick);
    }
}