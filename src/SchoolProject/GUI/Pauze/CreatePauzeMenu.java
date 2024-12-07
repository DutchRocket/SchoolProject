package SchoolProject.GUI.Pauze;

import SchoolProject.GUI.FontFactory;
import SchoolProject.Global.Location;

import java.awt.*;
import java.util.ArrayList;

public class CreatePauzeMenu {
    public static PauzeMenu createPauzeMenu(){
        PauzeMenu pauzeMenu = new PauzeMenu();
        ArrayList<Button> buttons = new ArrayList<>();
        for(int i = 0; i<3; i++) {
            Button button = new Button();
            button.setHeight(50);
            button.setLoc(new Location(500, 250+i*70));
            button.setWidth(500);
            button.setTextFont(FontFactory.createBold(35));
            switch (i){
                case 0:
                    button.setText("Resume");
                    button.setFunction("resume");
                    button.setSelected(true);
                    break;
                case 1:
                    button.setText("Restart");
                    button.setFunction("restart");
                    break;
                case 2:
                    button.setText("Return to level select");
                    button.setFunction("levelSelect");
                    break;
                default:
                    button.setText("");
                    button.setFunction(null);
            }
            button.setTextLocation(new Location(button.getLoc().getX()+10, button.getLoc().getY()+35));
            buttons.add(button);
        }
        pauzeMenu.setButtons(buttons);
        pauzeMenu.setSelectedButton(0);
        pauzeMenu.setLocation(new Location(450, 200));
        pauzeMenu.setColor(Color.darkGray);
        pauzeMenu.setHeight(100+buttons.size()*70);
        pauzeMenu.setWidth(600);
        return pauzeMenu;
    }
}
