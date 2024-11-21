package SchoolProject.gameTick;

import SchoolProject.Main;
import SchoolProject.Player.Player;

public class Gravity {
    public static void gravity(){
        Player player = Main.gameStats.getPlayer();
        if(player.getLoc().getY() > 1000){
            EndGame.levelLost();
        }
        if(player.isOnPlatform()){
            player.resetFallingDistance();
            return;
        }
        if(player.getForceUp() <= 0) {
            int fallingSpeed = player.getFallingSpeed();
            player.getLoc().setY(player.getLoc().getY() + fallingSpeed);
            player.addFallingDistance(fallingSpeed);
        }
    }
}
