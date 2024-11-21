package SchoolProject.gameTick;

import SchoolProject.Main;
import SchoolProject.Player.PlayerMovement;
import SchoolProject.Player.PlayerPlatformCollision;

public class GameEvents {
    public static boolean gameTick(){
        Gravity.gravity();
        PlayerPlatformCollision.platformCollisionCheck();
        PlayerMovement.playerMoveUpdate(Main.gameStats.getPlayer());
        return true;
    }
}
