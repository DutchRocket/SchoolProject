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
    int forceUp;
    int forceLeft;
    int forceRight;
    boolean movingLeft;
    boolean movingRight;
    boolean movingJump;
    int fallingDistance = 0;

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
        this.forceUp = 0;
        this.forceLeft = 0;
        this.forceRight = 0;
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

    public int getForceUp() {
        return forceUp;
    }

    public void setForceUp(int forceUp) {
        this.forceUp = forceUp;
    }

    public int getForceLeft() {
        return forceLeft;
    }

    public void setForceLeft(int forceLeft) {
        this.forceLeft = forceLeft;
    }

    public int getForceRight() {
        return forceRight;
    }

    public void setForceRight(int forceRight) {
        this.forceRight = forceRight;
    }

    public int getMaxJumps() {
        return maxJumps;
    }

    public void setMaxJumps(int maxJumps) {
        this.maxJumps = maxJumps;
    }

    public boolean isMovingLeft() {
        return movingLeft;
    }

    public void setMovingLeft(boolean movingLeft) {
        this.movingLeft = movingLeft;
    }

    public boolean isMovingRight() {
        return movingRight;
    }

    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
    }

    public boolean isMovingJump() {
        return movingJump;
    }

    public void setMovingJump(boolean movingJump) {
        this.movingJump = movingJump;
    }

    public int getJumpSpeed() {
        return 7 * this.getForceUp() / this.jumpHeight;
    }

    public int getFallingSpeed() {
        return Math.min(4, 1 + this.fallingDistance / 10);
    }

    public void resetFallingDistance() {
        this.fallingDistance = 0;
    }

    public void addFallingDistance(int fallingSpeed) {
        this.fallingDistance += fallingSpeed;
    }
}
