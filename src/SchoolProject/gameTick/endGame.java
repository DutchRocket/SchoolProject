package SchoolProject.gameTick;

import SchoolProject.Level.Object.Platform;
import SchoolProject.Main;
import SchoolProject.Player.Player;
import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.ArrayList;

public class endGame {
    public static void finishHit(){
        Player player = Main.gameStats.getPlayer();
        ArrayList<Platform> platforms = Main.gameStats.getLevels().get(Main.gameStats.getLevel()).getPlatforms();
        Rectangle playerRect = new Rectangle((int) player.getLoc().getX(), (int) player.getLoc().getY(), player.getW(), player.getH());
        for(Platform platform : platforms){
            if(!platform.isFinish()){
                continue;
            }
            Rectangle platformRect = new Rectangle(platform.getX(), platform.getY(), platform.getW(), platform.getH());
            if(playerRect.intersects(platformRect)){
                levelCompleted();
            }
        }
    }

    public static void levelCompleted(){
        System.out.println("You completed level " + Main.gameStats.getLevel());
    }
}
