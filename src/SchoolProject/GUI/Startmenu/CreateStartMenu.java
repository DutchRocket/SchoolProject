package SchoolProject.GUI.Startmenu;

import SchoolProject.GUI.Button;
import SchoolProject.GUI.FontFactory;
import SchoolProject.Global.Location;
import SchoolProject.Level.CreateLevels;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Main;

import java.awt.*;
import java.util.ArrayList;

public class CreateStartMenu {
    public static void createStartMenu(){
        ArrayList<Button> buttons = new ArrayList<>();
        Button button = new Button();
        button.setText("hi");
        button.setHeight(10);
        button.setWidth(10);
        button.setColor(Color.BLUE);
        buttons.add(button);
        StartMenu startMenu = new StartMenu(buttons);
        StartMenuPanel startMenuPanel = new StartMenuPanel(startMenu);
        startMenuPanel.repaint();
        //startgame when start button is pressed, but startmenu isnt working
        startGame();
    }

    public static void updateStartMenu(){
        ArrayList<Button> buttons = new ArrayList<>();
        Button button = new Button();
        button.setText("hi");
        button.setHeight(10);
        button.setWidth(10);
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
        //create timers
        Main.createTimers();
    }
}
