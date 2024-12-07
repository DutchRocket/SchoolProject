package SchoolProject.Level.Platforms;

import java.awt.*;

public class LevelTeleporter extends Platform {

    int level;
    String levelInfo;
    boolean locked = false;

    public LevelTeleporter(Color color, String type, int x, int y, int rotation, int w, int h, int level, String levelInfo, boolean collision) {
        super(color, type, x, y, rotation, w, h, collision);
        this.level = level;
        this.levelInfo = levelInfo;
    }

    public LevelTeleporter(Color color, String type, int x, int y, int rotation, int w, int h, int level, String levelInfo) {
        super(color, type, x, y, rotation, w, h);
        this.level = level;
        this.levelInfo = levelInfo;
    }

    public int getLevel() {
        return level;
    }

    public String getLevelInfo() {
        return levelInfo;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
