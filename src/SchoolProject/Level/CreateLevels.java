package SchoolProject.Level;

import SchoolProject.GameStats.GameStats;
import SchoolProject.Level.Object.Platform;
import SchoolProject.Main;

import javax.xml.stream.Location;
import java.awt.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class CreateLevels {
    public static void createLevels(){
        GameStats gameStats = Main.gameStats;
        gameStats.getLevels().add(level1());
    }

    public static Level level1(){
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform(Color.BLUE, "normal" , 10, 10, 0, 500, 40  ));
        platforms.add(new Platform(Color.BLACK, "normal", 20, 20, 0, 400, 30));
        Level level1 = new Level(1, platforms, 100, 100);
        return level1;
    }
}
