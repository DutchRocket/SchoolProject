package SchoolProject.gameTick;

import SchoolProject.Level.LoadLevel;
import SchoolProject.Main;

public class EndGame {
    public static void finishHit(){
        levelCompleted();
    }

    public static void levelCompleted(){
        Main.gameStats.setLevel(0);
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(Main.gameStats.getLevel()));
        System.out.println("You completed level " + Main.gameStats.getLevel());
    }

    public static void levelLost(){
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(Main.gameStats.getLevel()));
        System.out.println("You lost level " + Main.gameStats.getLevel());
    }

    public static void levelRestart(){
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(Main.gameStats.getLevel()));
    }
}
