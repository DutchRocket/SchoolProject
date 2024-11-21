package SchoolProject.Player;

import SchoolProject.Global.Location;

import java.awt.*;

public class PlayerFactory {
    public static Player createPlayerOne(){
        return new Player(Color.GREEN, "Rocket", 2, 300, 50, 50, new Location(0, 0));
    }
}
