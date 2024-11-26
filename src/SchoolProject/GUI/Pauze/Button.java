package SchoolProject.GUI.Pauze;

import SchoolProject.Global.Location;

import java.awt.*;

public class Button {
    Location loc;
    int height;
    int width;
    String text;
    Location textLocation;
    Color textColor;
    Color color;
    boolean selected;
    String function;
    Font textFont;

    public Button() {
        this.loc = new Location(0,0);
        this.height = 10;
        this.width = 10;
        this.text = "text";
        this.textColor = Color.BLACK;
        this.color = Color.lightGray;
        this.selected = false;
        this.function = null;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Location getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Location textLocation) {
        this.textLocation = textLocation;
    }

    public Font getTextFont() {
        return textFont;
    }

    public void setTextFont(Font textFont) {
        this.textFont = textFont;
    }
}
