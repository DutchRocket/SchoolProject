package SchoolProject.Player;

import SchoolProject.Global.Location;

import java.awt.*;

public class PlayerFactory {
    public static Player createPlayerOne(){
        return new Player(Color.GREEN, "Rocket", 200, 300, 30, 50, new Location(0, 0));
    }
}
