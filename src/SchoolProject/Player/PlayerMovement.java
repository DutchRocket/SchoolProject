package SchoolProject.Player;

import SchoolProject.Main;

import javax.swing.*;

public class PlayerMovement {
    public static void playerMoveUpdate(Player player){
        playerMoving(player);
        playerJump(player);
        playerMoveLeft(player);
        playerMoveRight(player);
    }

    public static void playerJump(Player player){
        if(player.getForceUp() < 1) {
            return;
        }
        int speed = player.getJumpSpeed();
        player.getLoc().setY(player.getLoc().getY() - speed);
        player.setForceUp(player.getForceUp() - 7);
    }
    public static void playerMoveLeft(Player player){
        if(player.getForceLeft() < 1) {
            return;
        }
        if(player.getLoc().getX() - player.getSpeed() < Main.gameStats.getFrame().getX()){
            player.setForceLeft(0);
            return;
        }
        player.getLoc().setX(player.getLoc().getX() - player.getSpeed());
        player.setForceLeft(player.getForceLeft() - 1);
    }
    public static void playerMoveRight(Player player){
        JFrame frame = Main.gameStats.getFrame();
        if(player.getForceRight() < 1) {
            return;
        }
        if(player.getLoc().getX() + player.getSpeed() + player.getW() > frame.getX()+frame.getWidth()){
            player.setForceRight(0);
            return;
        }
        player.getLoc().setX(player.getLoc().getX() + player.getSpeed());
        player.setForceRight(player.getForceRight() - 1);
    }

    public static void playerMoving(Player player){
        if(player.isMovingLeft()){
            player.setForceLeft(player.getForceLeft()+ 1);
        }
        if(player.isMovingRight()){
            player.setForceRight(player.getForceRight() + 1);
        }
    }
}
