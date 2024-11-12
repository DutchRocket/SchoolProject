package SchoolProject.gameTick;

import SchoolProject.Main;
import SchoolProject.Player.Player;

public class Gravity {
    public static void gravity(){
        Player player = Main.gameStats.getPlayer();
        if(player.getLoc().getY() > 700){
            return;
        }
        if(player.isOnPlatform()){
            return;
        }
        player.getLoc().setY(player.getLoc().getY()+0.8);
    }
}
