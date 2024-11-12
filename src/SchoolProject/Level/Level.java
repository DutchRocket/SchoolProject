package SchoolProject.Level;

import SchoolProject.Level.Object.Platform;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.HashMap;

public class Level {
    int levelNumber;
    ArrayList<Platform> platforms;
    int timer;
    int spawnX;
    int spawnY;

    public Level(int levelNumber, ArrayList<Platform> platforms, int spawnX, int spawnY) {
        this.levelNumber = levelNumber;
        this.platforms = platforms;
        this.timer = 0;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
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
}
