package SchoolProject.GUI.Pauze;

import SchoolProject.Game.GameStats;
import SchoolProject.Level.LoadLevel;
import SchoolProject.Main;
import SchoolProject.gameTick.EndGame;

import java.awt.event.KeyEvent;

public class PauzeMenuListener {
    public static boolean pauzeMenuListener(KeyEvent e){
        GameStats gameStats = Main.gameStats;
        if(!gameStats.isGamePauzed()){
            return false;
        }
        PauzeMenu pauzeMenu = gameStats.getPauzeMenu();
        int input = e.getKeyCode();
        switch (input) {
            case 40:
                //down
                pauzeMenu.getButtons().get(pauzeMenu.getSelectedButton()).setSelected(false);
                int nextButton = pauzeMenu.getSelectedButton()+1;
                if(nextButton > pauzeMenu.getButtons().size()-1){
                    nextButton = 0;
                }
                pauzeMenu.setSelectedButton(nextButton);
                pauzeMenu.getButtons().get(nextButton).setSelected(true);
                break;
            case 38:
                //up
                pauzeMenu.getButtons().get(pauzeMenu.getSelectedButton()).setSelected(false);
                int beforeButton = pauzeMenu.getSelectedButton()-1;
                if(beforeButton < 0){
                    beforeButton = pauzeMenu.getButtons().size()-1;
                }
                pauzeMenu.setSelectedButton(beforeButton);
                pauzeMenu.getButtons().get(beforeButton).setSelected(true);
                break;
            case 32, 10:
                //select
                Button button = pauzeMenu.getButtons().get(pauzeMenu.getSelectedButton());
                String function = button.getFunction();
                switch(function){
                    case "resume":
                        PauzeGame.pauzeGame();
                        break;
                    case "restart":
                        EndGame.levelRestart();
                        PauzeGame.pauzeGame();
                        break;
                    case "levelSelect":
                        Main.gameStats.setLevel(0);
                        LoadLevel.loadLevel(Main.gameStats.getLevels().get(Main.gameStats.getLevel()));
                        PauzeGame.pauzeGame();
                        break;
                }
                break;
        }
        return true;
    }
}
