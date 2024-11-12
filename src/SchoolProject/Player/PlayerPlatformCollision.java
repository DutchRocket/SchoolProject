package SchoolProject.Player;

import SchoolProject.Level.Object.Platform;
import SchoolProject.Main;

import java.awt.*;
import java.util.ArrayList;

public class PlayerPlatformCollision {
    public static void platformCollisionCheck(){
        Player player = Main.gameStats.getPlayer();
        ArrayList<Platform> platforms = Main.gameStats.getLevels().get(Main.gameStats.getLevel()).getPlatforms();
        Rectangle playerRect = new Rectangle((int) player.getLoc().getX(), (int) player.getLoc().getY(), player.getW(), player.getH());
        for(Platform platform : platforms){
            Rectangle platformRect = new Rectangle(platform.getX(), platform.getY(), platform.getW(), platform.getH());
            if(playerRect.intersects(platformRect)){
                player.setOnPlatform(true);
                playerLandedOnPlatform(player);
                return;
            }
        }
        player.setOnPlatform(false);
    }

    public static void playerLandedOnPlatform(Player player){
        player.setJumpsLeft(player.getMaxJumps());
    }
}
