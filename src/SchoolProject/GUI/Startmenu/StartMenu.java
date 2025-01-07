package SchoolProject.GUI.Startmenu;

import SchoolProject.GUI.Button;

import java.util.ArrayList;

public class StartMenu {
    ArrayList<Button> buttons;
    int selectedButton = 0;

    public StartMenu(ArrayList<Button> buttons) {
        this.buttons = buttons;
    }

    public ArrayList<Button> getButtons() {
        return buttons;
    }

    public void setButtons(ArrayList<Button> buttons) {
        this.buttons = buttons;
    }

    public int getSelectedButton() {
        return selectedButton;
    }

    public void setSelectedButton(int selectedButton) {
        this.selectedButton = selectedButton;
    }
}
