package SchoolProject.gameTick;

import SchoolProject.Level.Level;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Main;

public class EndGame {
    public static void finishHit(Level level){
        levelCompleted(level);
    }

    public static void levelCompleted(Level level){
        if(Main.gameStats.getLevels().size()>level.getLevelNumber()+1) {
            Main.gameStats.getLevels().get(level.getLevelNumber() + 1).setLocked(false);
        }
        System.out.println("You completed level " + Main.gameStats.getLevel());
        Main.gameStats.setLevel(0);
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(Main.gameStats.getLevel()));
    }

    public static void levelLost(){
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(Main.gameStats.getLevel()));
        System.out.println("You lost level " + Main.gameStats.getLevel());
    }

    public static void levelRestart(){
        LoadLevel.loadLevel(Main.gameStats.getLevels().get(Main.gameStats.getLevel()));
    }
}
