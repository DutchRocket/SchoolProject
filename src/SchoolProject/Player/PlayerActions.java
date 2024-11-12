package SchoolProject.Player;

import SchoolProject.GameStats.GameStats;

import java.awt.event.KeyEvent;

public class PlayerActions {
    public static void onKeyPress(KeyEvent e, int keyStatus){
        char input = e.getKeyChar();
        if(keyStatus != 0){
            return;
        }
        if(input == 'w' || input == ' '){
            playerJump();
        }
        return;
    }

    public static void playerJump(){
        //player jumps
    }
}
