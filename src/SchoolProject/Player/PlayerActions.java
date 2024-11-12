package SchoolProject.Player;

import SchoolProject.GameStats.GameStats;
import SchoolProject.Global.Location;
import SchoolProject.Main;

import java.awt.event.KeyEvent;

public class PlayerActions {
    public static boolean onKeyPress(KeyEvent e, int keyStatus){
        int input = e.getKeyCode();
        if(keyStatus != 0){
            return false;
        }
        switch (input){
            case 87:
            case 38:
            case 0:
                playerJump();
                return true;
            case 65:
            case 37:
                playerMoveLeft();
                return true;
            case 68:
            case 39:
                playerMoveRight();
                return true;
            default:
                return false;
        }
    }

    public static void playerJump(){
        Player p = Main.gameStats.getPlayer();
        if(p.isOnPlatform() && p.getJumpsLeft() > 0) {
            p.setJumpsLeft(p.getJumpsLeft() - 1);
            p.setJump(p.jumpHeight);
        }
    }

    public static void playerMoveLeft(){
        Player p = Main.gameStats.getPlayer();
        p.getLoc().setX(p.getLoc().getX() - p.getSpeed());
    }

    public static void playerMoveRight(){
        Player p = Main.gameStats.getPlayer();
        p.getLoc().setX(p.getLoc().getX() + p.getSpeed());
    }
}
