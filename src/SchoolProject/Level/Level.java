package SchoolProject.Level;

import SchoolProject.Level.Platforms.Platform;

import java.util.ArrayList;

public class Level {
    String name;
    int levelNumber;
    ArrayList<Platform> platforms;
    int timer;
    int spawnX;
    int spawnY;
    boolean isLocked = true;

    public Level(int levelNumber, ArrayList<Platform> platforms, int spawnX, int spawnY, String name) {
        this.levelNumber = levelNumber;
        this.platforms = platforms;
        this.timer = 0;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.name = name;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getSpawnX() {
        return spawnX;
    }

    public void setSpawnX(int spawnX) {
        this.spawnX = spawnX;
    }

    public int getSpawnY() {
        return spawnY;
    }

    public void setSpawnY(int spawnY) {
        this.spawnY = spawnY;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public ArrayList<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(ArrayList<Platform> platforms) {
        this.platforms = platforms;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
