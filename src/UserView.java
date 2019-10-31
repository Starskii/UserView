import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import GUIForms.*;

public class UserView {
    JPanel currentPanel = new JPanel();
    Login loginPanel = new Login();
    Verification verificationPanel = new Verification();
    Lobby lobbyPanel = new Lobby();
    Game gamePanel = new Game();
    private int xSize;
    private int ySize;
    private String title;

    private JFrame view = new JFrame("Connect N Online");



    UserView(){
        setCurrentPanelLogin();

        //      ACTION LISTENERS FOR LOGIN PAGE
        loginPanel.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(loginPanel.verifyCredentials()) {
                    setCurrentPanelLobby();
                }
                else{
                    loginPanel.setStatus("Authentication Failed");
                    update();
                }
            }
        });
        loginPanel.getCreateAccountButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        //      ACTION LISTENERS FOR LOBBY PAGE
        lobbyPanel.getPlayButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setCurrentPanelGame();
            }
        });
        lobbyPanel.getQuitButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent){
                quit();
            }
        });
        //      ACTION LISTENERS FOR GAME PAGE
        gamePanel.getQuitButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent){
                quit();
            }
        });

        for(int row = 0; row < 6; row++){
            for(int col = 0; col < 7; col++){
                gamePanel.getBoard()[row][col].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        for(int row = 0; row < 6; row++){
                            for(int col = 0; col < 7; col++){
                                if(gamePanel.getBoard()[row][col].equals(actionEvent.getSource())){
                                    System.out.println("Action performed by button: " + col + " " + (5-row));
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    private void quit(){
        System.exit(0);
    }

    private void update(){
        view.setTitle(title);
        view.setContentPane(currentPanel);
        view.setSize(xSize,ySize);
        view.setVisible(true);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.repaint();
    }

    public void setCurrentPanelGame() {
        currentPanel = gamePanel.getGamePanel();
        xSize = 1000;
        ySize = 500;
        title = "Connect N Online";
        update();
    }
    public void setCurrentPanelLobby() {
        currentPanel = lobbyPanel.getLobbyPanel();
        xSize = 800;
        ySize = 500;
        title = "Connect N Online";
        update();
    }
    public void setCurrentPanelVerification() {
        currentPanel = verificationPanel.getVerificationPanel();
        xSize = 100;
        ySize = 100;
        title = "Verifying...";
        update();
    }
    public void setCurrentPanelLogin(){
        currentPanel = loginPanel.getLoginPanel();
        xSize = 400;
        ySize = 150;
        update();
    }

   public static void main(String args[]){
        UserView userView = new UserView();
    }
}
