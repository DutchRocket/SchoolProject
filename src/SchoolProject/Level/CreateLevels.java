package SchoolProject.Level;

import SchoolProject.Game.GameStats;
import SchoolProject.Level.Platforms.LevelTeleporter;
import SchoolProject.Level.Platforms.Platform;
import SchoolProject.Main;

import java.awt.*;
import java.util.ArrayList;

public class CreateLevels {
    public static void createLevels(){
        GameStats gameStats = Main.gameStats;
        gameStats.getLevels().add(0, levelSelect());
        gameStats.getLevels().add(1, level1());
        gameStats.getLevels().add(2, level2());
        gameStats.getLevels().add(3, level3());
        gameStats.getLevels().add(4, level4());
        gameStats.getLevels().add(5, level5());
        gameStats.getLevels().add(6, level6());
        gameStats.getLevels().add(7, level7());
    }

    public static Level levelSelect(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLACK, "normal" , 400, 300, 0, 500, 40));
        platforms.add(new LevelTeleporter(Color.GREEN, "level" , 700, 250, 0, 50, 50, 1, "level 1", false));
        platforms.add(new Platform(Color.BLACK, "normal", 20, 400, 0, 400, 30));
        platforms.add(new Platform(Color.BLACK, "normal", 1000, 200, 0, 4000, 30));
        platforms.add(new LevelTeleporter(Color.GREEN, "level", 1200, 150, 0, 50, 50, 2, "level 2", false));
        platforms.add(new Platform(Color.BLACK, "normal", 795, 500, 0, 1000, 20));
        platforms.add(new Platform(Color.BLACK, "normal", 600, 450, 0, 80, 20));
        platforms.add(new LevelTeleporter(Color.BLUE, "level", 1300, 150, 0, 50, 50, 3, "level 3", false));
        platforms.add(new LevelTeleporter(Color.BLUE, "level", 1400, 150, 0, 50, 50, 4, "level 4", false));
        platforms.add(new LevelTeleporter(Color.GREEN, "level", 1500, 150, 0, 50, 50, 5, "level 5", false));
        platforms.add(new LevelTeleporter(Color.RED, "level", 1500, 450, 0, 50, 50, 6, "level 6", false));
        platforms.add(new LevelTeleporter(Color.RED, "level", 615, 400, 0, 50, 50, 7, "level 7", false));
        Level level0 = new Level(0, platforms, 100, 100, "Level-select");
        return level0;
    }

    public static Level level1(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLUE, "normal" , 400, 300, 0, 500, 40));
        platforms.add(new Platform(Color.BLUE, "normal", 20, 400, 0, 400, 30));
        platforms.add(new Platform(Color.BLUE, "normal", 1000, 200, 0, 400, 30));
        platforms.add(new Platform(Color.BLUE, "normal", 795, 500, 0, 600, 20));
        platforms.add(new Platform(Color.GREEN, "finish", 600, 450, 0, 80, 20));
        Level level1 = new Level(1, platforms, 100, 100, "First");
        return level1;
    }

    public static Level level2(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLUE, "normal" , 20, 200, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 200, 200, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 400, 200, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 650, 300, 0, 75, 20));
        platforms.add(new Platform(Color.GREEN, "finish", 850, 250, 0, 50, 20));
        Level level2 = new Level(2, platforms, 30, 100, "sea-blue");
        return level2;
    }

    public static Level level3(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.RED, "normal" , 20, 1000, 0, 50, 20));
        platforms.add(new Platform(Color.RED, "normal" , 120, 900, 0, 80, 20));
        platforms.add(new Platform(Color.RED, "normal" , 320, 850, 0, 50, 20));
        platforms.add(new Platform(Color.RED, "normal" , 160, 730, 0, 50, 20));
        platforms.add(new Platform(Color.RED, "normal" , 320, 600, 0, 100, 20));
        platforms.add(new Platform(Color.RED, "normal" , 380, 500, 0, 50, 20));
        platforms.add(new Platform(Color.RED, "normal" , 220, 500, 0, 50, 20));
        platforms.add(new Platform(Color.RED, "normal" , 120, 400, 0, 10, 5));
        platforms.add(new Platform(Color.GREEN, "finish" , 5, 270, 0, 10, 10));
        platforms.add(new Platform(Color.RED, "normal" , 590, 440, 0, 50, 20));
        platforms.add(new Platform(Color.RED, "normal" , 725, 345, 0, 50, 20));
        platforms.add(new Platform(Color.GREEN, "finish", 850, 250, 0, 50, 20));
        Level level3 = new Level(3, platforms, 20, 920, "Up");
        return level3;
    }

    public static Level level4(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLUE, "normal" , 20, 200, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 200, 200, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 400, 200, 0, 55, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 695, 300, 0, 50, 20));
        platforms.add(new Platform(Color.GREEN, "finish", 850, 250, 0, 50, 20));
        Level level4 = new Level(4, platforms, 30, 100, "sea-blue again?");
        return level4;
    }

    public static Level level5(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLUE, "normal" , 20, 200, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 200, 300, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 400, 400, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 650, 500, 0, 50, 20));
        platforms.add(new Platform(Color.GREEN, "finish", 900, 600, 0, 50, 20));
        Level level5 = new Level(5, platforms, 30, 100, "grass-green");
        return level5;
    }

    public static Level level6(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLUE, "normal" , 20, 200, 0, 50, 20));
        platforms.add(new Platform(Color.red, "normal", 670, 1000, 0, 120, 5));
        platforms.add(new Platform(Color.GREEN, "finish", 900, 1000, 0, 50, 20));
        Level level6 = new Level(6, platforms, 30, 100, "the drop");
        return level6;
    }

    public static Level level7(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLUE, "normal" , 220, 400, 0, 100, 20));
        platforms.add(new Platform(Color.RED, "normal", 310, 0, 0, 10, 400));
        platforms.add(new Platform(Color.BLUE, "normal", 320, 670, 0, 100, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 570, 600, 0, 50, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 720, 500, 0, 40, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 870, 400, 0, 30, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 1020, 300, 0, 20, 20));
        platforms.add(new Platform(Color.BLUE, "normal", 1170, 200, 0, 10, 20));
        platforms.add(new Platform(Color.GREEN, "finish", 1350, 100, 0, 1, 20));
        platforms.add(new Platform(Color.GREEN, "finish", 1700, 1000, 0, 500, 500));
        Level level7 = new Level(7, platforms, 230, 350, "hard jumps");
        return level7;
    }
}
