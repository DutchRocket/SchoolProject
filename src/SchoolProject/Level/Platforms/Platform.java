package SchoolProject.Level.Platforms;

import java.awt.*;

public class Platform {
    Color color;
    String type;
    int x;
    int y;
    int rotation;
    int w;
    int h;
    boolean collision;

    public Platform(Color color, String type, int x, int y, int rotation, int w, int h, boolean collision) {
        this.color = color;
        this.type = type;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.w = w;
        this.h = h;
        this.collision = collision;
    }

    public Platform(Color color, String type, int x, int y, int rotation, int w, int h) {
        this.color = color;
        this.type = type;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.w = w;
        this.h = h;
        this.collision = true;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
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

    public boolean isCollision() {
        return collision;
    }

    public void setCollision(boolean collision) {
        this.collision = collision;
    }
}
