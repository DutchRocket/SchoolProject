package SchoolProject.Player;

import SchoolProject.Main;

import java.awt.event.KeyEvent;

public class PlayerActions {
    public static void onKeyPress(KeyEvent e, int keyStatus){
        int input = e.getKeyCode();
        switch (input) {
            case 87, 38, 32:
                if(keyStatus == 0) {
                    playerJump();
                }
                break;
            case 65, 37:
                if(keyStatus == 0) {
                    playerMoveLeft();
                } else if (keyStatus == 1) {
                    playerStopMoveLeft();
                }
                break;
            case 68, 39:
                if(keyStatus == 0) {
                    playerMoveRight();
                } else if (keyStatus == 1) {
                    playerStopMoveRight();
                }
                break;
        }
    }

    public static void playerJump(){
        Player p = Main.gameStats.getPlayer();
        if(p.isOnPlatform() && p.getJumpsLeft() > 0) {
            p.setJumpsLeft(p.getJumpsLeft() - 1);
            p.setForceUp(p.getJumpHeight());
        }
    }

    public static void playerMoveLeft(){
        Player p = Main.gameStats.getPlayer();
        p.setMovingLeft(true);
    }

    public static void playerMoveRight(){
        Player p = Main.gameStats.getPlayer();
        p.setMovingRight(true);
    }

    public static void playerStopMoveLeft(){
        Player p = Main.gameStats.getPlayer();
        p.setMovingLeft(false);
    }

    public static void playerStopMoveRight(){
        Player p = Main.gameStats.getPlayer();
        p.setMovingRight(false);
    }
}
