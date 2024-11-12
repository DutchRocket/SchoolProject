package SchoolProject.Player;

import SchoolProject.Global.Location;

import java.awt.*;

public class Player {
    Color color;
    String character;
    int speed;
    int jumpHeight;
    int w;
    int h;
    Location loc;
    boolean onPlatform;
    int maxJumps;
    int jumpsLeft;
    int jump;

    public Player(Color color, String character, int speed, int jumpHeight, int w, int h, Location loc) {
        this.color = color;
        this.character = character;
        this.speed = speed;
        this.jumpHeight = jumpHeight;
        this.w = w;
        this.h =h;
        this.loc = loc;
        this.onPlatform = false;
        this.jumpsLeft = 1;
        this.jump = 0;
        this.maxJumps = 1;
    }



    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public boolean isOnPlatform() {
        return onPlatform;
    }

    public void setOnPlatform(boolean onPlatform) {
        this.onPlatform = onPlatform;
    }

    public int getJumpsLeft() {
        return jumpsLeft;
    }

    public void setJumpsLeft(int jumpsLeft) {
        this.jumpsLeft = jumpsLeft;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getMaxJumps() {
        return maxJumps;
    }

    public void setMaxJumps(int maxJumps) {
        this.maxJumps = maxJumps;
    }
}
