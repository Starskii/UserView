package GUIForms;

import javax.swing.*;
import java.awt.*;

public class Game {
    private JPanel gamePanel;
    private JButton quitButton;
    private JPanel boardPanel;
    private JButton[][] board = new JButton[6][7];

    public Game() {

    }

    public JPanel getGamePanel(){
        return gamePanel;
    }
    public JButton[][] getBoard(){return board;}
    public JButton getQuitButton(){return quitButton;}

    private void createUIComponents() {
        // TODO: place custom component creation code here
        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(0,7));
        for(int row = 0; row < 6; row++){
            for(int col = 0; col < 7; col++){
                board[row][col] = new JButton("Col: " + col + ", Row: " + (5-row));
                boardPanel.add(board[row][col],col);
            }
        }
    }
}
