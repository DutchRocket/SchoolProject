package SchoolProject.GUI.Pauze;

import SchoolProject.Global.Location;

import java.awt.*;
import java.util.ArrayList;

public class PauzeMenu {
    ArrayList<Button> buttons;
    Color color;
    Location location;
    int height;
    int width;
    int selectedButton;

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
