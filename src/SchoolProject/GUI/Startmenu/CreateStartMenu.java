package SchoolProject.GUI.Startmenu;

import SchoolProject.GUI.Button;
import SchoolProject.GUI.FontFactory;
import SchoolProject.Global.Location;
import SchoolProject.Level.CreateLevels;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CreateStartMenu {
    public static void createStartMenu(){
        ArrayList<Button> buttons = new ArrayList<>();
        Button button = new Button();
        button.setText("Start Game");
        button.setLoc(new Location(200,200));
        button.setTextLocation(new Location(2000, 200));
        button.setHeight(100);
        button.setWidth(1000);
        button.setColor(Color.BLUE);
        buttons.add(button);
        StartMenu startMenu = new StartMenu(buttons);
        StartMenuPanel startMenuPanel = new StartMenuPanel(startMenu);
        JFrame frame = Main.gameStats.getFrame();
        frame.setContentPane(startMenuPanel);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        startMenuPanel.repaint();
        startGame();
    }

    public static void updateStartMenu(){
        ArrayList<Button> buttons = new ArrayList<>();
        Button button = new Button();
        button.setText("Start Game");
        button.setLoc(new Location(2000,2000));
        button.setTextLocation(new Location(2000, 2000));
        button.setHeight(1000);
        button.setWidth(1000);
        button.setColor(Color.BLUE);
        buttons.add(button);
        StartMenu startMenu = new StartMenu(buttons);
        StartMenuPanel startMenuPanel = new StartMenuPanel(startMenu);
        startMenuPanel.repaint();
    }

    public static void startGame(){
        //create the levels
        CreateLevels.createLevels();
        //load first level (needs to become startgamemenu)
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(1));
        //unlock level 1
        Main.gameStats.getLevels().get(1).setLocked(false);
        //create timers
        Main.createTimers();
    }
}
