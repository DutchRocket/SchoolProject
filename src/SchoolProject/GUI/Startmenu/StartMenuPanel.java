package SchoolProject.GUI.Startmenu;

import SchoolProject.GUI.Button;

import javax.swing.*;
import java.awt.*;

public class StartMenuPanel extends JPanel {
    private StartMenu startMenu;

    public StartMenuPanel(StartMenu startMenu){
        this.startMenu = startMenu;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Ensures that the panel is properly redrawn
        for (Button b : startMenu.getButtons()) {
            g.setColor(b.getColor());
            if(b.isSelected()){
                g.setColor(Color.ORANGE);
            }
            g.fillRect(b.getLoc().getX(), b.getLoc().getY(), b.getWidth(), b.getHeight());
            g.setColor(b.getTextColor());
            g.setFont(b.getTextFont());
            g.drawString(b.getText(), b.getTextLocation().getX(), b.getTextLocation().getY());
        }
    }
}
