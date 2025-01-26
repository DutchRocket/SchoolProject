package SchoolProject.GUI.Startmenu;

import SchoolProject.GUI.Button;
import SchoolProject.GUI.FontFactory;
import SchoolProject.Global.Location;
import SchoolProject.Level.CreateLevels;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Main;
import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CreateStartMenu {
    public static void createStartMenu(){
        Main.gameStats.setGameStarted(false);
        ArrayList<Button> buttons = new ArrayList<>();

        Button button2 = new Button();
        button2.setTextLocation(new Location(0,0));
        button2.setLoc(new Location(0,0));
        button2.setHeight(2000);
        button2.setWidth(5000);
        int red = 5;
        int green = 10;
        int blue = 50;
        button2.setColor(Color.getHSBColor(Color.RGBtoHSB(red,green,blue, null)[0], Color.RGBtoHSB(red,green,blue, null)[1], Color.RGBtoHSB(red,green,blue, null)[2]));
        buttons.add(button2);

        Button button = new Button();
        button.setText("Press any key to start");
        button.setLoc(new Location((Main.gameStats.getFrame().getWidth()/2)-500,800));
        button.setTextLocation(new Location((Main.gameStats.getFrame().getWidth()/2)-240, 865));
        button.setHeight(100);
        button.setWidth(1000);
        button.setColor(Color.BLUE);
        button.setTextColor(Color.WHITE);
        button.setTextFont(FontFactory.create(50));
        buttons.add(button);

        Button button3 = new Button();
        button3.setTextFont(FontFactory.create(200));
        button3.setTextColor(Color.LIGHT_GRAY);
        button3.setText("A Parkour Game");
        button3.setTextLocation(new Location(210,400));
        button3.setLoc(new Location(0,0));
        button3.setHeight(0);
        button3.setWidth(0);
        button3.setColor(Color.getHSBColor(Color.RGBtoHSB(red,green,blue, null)[0], Color.RGBtoHSB(red,green,blue, null)[1], Color.RGBtoHSB(red,green,blue, null)[2]));
        buttons.add(button3);

        StartMenu startMenu = new StartMenu(buttons);
        StartMenuPanel startMenuPanel = new StartMenuPanel(startMenu);
        JFrame frame = Main.gameStats.getFrame();
        frame.setContentPane(startMenuPanel);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        startMenuPanel.repaint();
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
        Main.gameStats.setGameStarted(true);
        //create the levels
        CreateLevels.createLevels();
        //load level select
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(0));
        //unlock level 1
        Main.gameStats.getLevels().get(1).setLocked(false);
        //create timers
        Main.createTimers();
    }
}
