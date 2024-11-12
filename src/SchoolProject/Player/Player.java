package SchoolProject.Player;

import java.awt.*;

public class Player {
    Color color;
    String character;
    int speed;
    int jumpHeight;
    int w;
    int h;

    public Player(Color color, String character, int speed, int jumpHeight, int w, int h) {
        this.color = color;
        this.character = character;
        this.speed = speed;
        this.jumpHeight = jumpHeight;
        this.w = w;
        this.h =h;
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
}
