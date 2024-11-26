package SchoolProject.Level;

import SchoolProject.Game.GameStats;
import SchoolProject.Level.Object.Platform;
import SchoolProject.Main;

import java.awt.*;
import java.util.ArrayList;

public class CreateLevels {
    public static void createLevels(){
        GameStats gameStats = Main.gameStats;
        gameStats.getLevels().addFirst(levelSelect());
        gameStats.getLevels().add(1, level1());
        gameStats.getLevels().add(2, level2());
    }

    public static Level levelSelect(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLACK, "normal" , 400, 300, 0, 500, 40));
        platforms.add(new Platform(Color.GREEN, "level" , 700, 250, 0, 50, 50, false, "1"));
        platforms.add(new Platform(Color.BLACK, "normal", 20, 400, 0, 400, 30));
        platforms.add(new Platform(Color.BLACK, "normal", 1000, 200, 0, 400, 30));
        platforms.add(new Platform(Color.GREEN, "level", 1300, 150, 0, 50, 50, false, "2"));
        platforms.add(new Platform(Color.BLACK, "normal", 795, 500, 0, 600, 20));
        platforms.add(new Platform(Color.BLACK, "normal", 600, 450, 0, 60, 20));
        Level level1 = new Level(1, platforms, 100, 100, "Level-select");
        return level1;
    }

    public static Level level1(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLUE, "normal" , 400, 300, 0, 500, 40));
        platforms.add(new Platform(Color.BLACK, "normal", 20, 400, 0, 400, 30));
        platforms.add(new Platform(Color.GREEN, "normal", 1000, 200, 0, 400, 30));
        platforms.add(new Platform(Color.BLACK, "normal", 795, 500, 0, 600, 20));
        platforms.add(new Platform(Color.CYAN, "finish", 600, 450, 0, 60, 20));
        Level level1 = new Level(1, platforms, 100, 100, "First");
        return level1;
    }

    public static Level level2(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.PINK, "normal" , 400, 300, 0, 500, 40));
        platforms.add(new Platform(Color.PINK, "normal", 20, 400, 0, 400, 30));
        platforms.add(new Platform(Color.PINK, "normal", 1000, 200, 0, 400, 30));
        platforms.add(new Platform(Color.PINK, "normal", 795, 500, 0, 600, 20));
        platforms.add(new Platform(Color.YELLOW, "finish", 600, 450, 0, 60, 20));
        Level level2 = new Level(2, platforms, 100, 100, "pink?");
        return level2;
    }
}
