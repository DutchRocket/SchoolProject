package SchoolProject.Player;

import SchoolProject.Level.Object.Platform;
import SchoolProject.Main;
import SchoolProject.gameTick.EndGame;

import java.awt.*;
import java.util.ArrayList;

public class PlayerPlatformCollision {
    public static void platformCollisionCheck(){
        Player player = Main.gameStats.getPlayer();
        ArrayList<Platform> platforms = Main.gameStats.getLevels().get(Main.gameStats.getLevel()).getPlatforms();
        Rectangle playerRect = new Rectangle((int) player.getLoc().getX(), (int) player.getLoc().getY(), player.getW(), player.getH());
        boolean onPlatform = false;
        for(Platform platform : platforms){
            Rectangle platformRect = new Rectangle(platform.getX(), platform.getY(), platform.getW(), platform.getH());
            if(playerRect.intersects(platformRect)) {
                Rectangle intersect = playerRect.intersection(platformRect);
                if (intersect.getWidth() > intersect.getHeight()) {
                    if (playerRect.getY() < platformRect.getY()) {
                        //hit top of the platform
                        playerLandedOnPlatform(player, platform);
                        onPlatform = true;
                    }else{
                        //hit bottom of the platform
                        playerHitBottomPlatform(player);
                    }
                }else{
                    if(playerRect.getX() < platformRect.getX()){
                        //hit left side of the platform
                        playerHitLeftSidePlatform(player);
                    }else{
                        //hit right side of the platform
                        playerHitRightSidePlatform(player);
                    }
                }
            }
        }
        player.setOnPlatform(onPlatform);
    }

    public static void playerLandedOnPlatform(Player player, Platform platform){
        player.setJumpsLeft(player.getMaxJumps());
        if(platform.getType().equals("finish")){
            EndGame.finishHit();
        }
    }

    public static void playerHitBottomPlatform(Player player){
        player.setForceUp(0);
        player.getLoc().setY(player.getLoc().getY()+ player.getJumpSpeed());
    }

    public static void playerHitLeftSidePlatform(Player player){
        player.setForceRight(0);
        player.getLoc().setX(player.getLoc().getX()-player.getSpeed());
    }

    public static void playerHitRightSidePlatform(Player player){
        player.setForceLeft(0);
        player.getLoc().setX(player.getLoc().getX()+player.getSpeed());
    }
}
