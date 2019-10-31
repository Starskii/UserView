package GUIForms;

import javax.swing.*;

public class Lobby {
    private JPanel lobbyPanel;
    private JTextArea chatBox;
    private JButton playButton;
    private JButton quitButton;
    private JButton optionsButton;
    private JTextField userChatText;
    private JButton sendButton;

    public Lobby(){
        chatBox.setEditable(false);
    }

    public JButton getPlayButton(){
        return playButton;
    }
    public JButton getOptionsButton(){return optionsButton;}
    public JButton getSendButton(){return sendButton;}
    public JButton getQuitButton(){return quitButton;}

    public JPanel getLobbyPanel(){
        return lobbyPanel;
    }

}
