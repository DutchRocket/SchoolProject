package SchoolProject.Player;

public class PlayerMovement {
    public static void playerMoveUpdate(Player player){
        playerjump(player);
    }

    public static void playerjump(Player player){
        if(player.getJump() < 1) {
            return;
        }
        if(!(player.getJumpsLeft() >= 1)){
            return;
        }
        player.getLoc().setY(player.getLoc().getY() - 2);
        player.setJump(player.getJump() - 2);
    }
}
