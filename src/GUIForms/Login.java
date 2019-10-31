package GUIForms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel loginPanel;
    private JTextField userLogin;
    private JPasswordField userPassword;
    private JButton loginButton;
    private JButton createAccountButton;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblStatus;

    public Login(){

    }
    public JPanel getLoginPanel(){
        return loginPanel;
    }
    public JButton getLoginButton(){
        return loginButton;
    }
    public JButton getCreateAccountButton() {
        return createAccountButton;
    }
    public void setStatus(String status){
        lblStatus.setText(status);
    }

    public boolean verifyCredentials(){
        //TO DO: Needs to legitimately verify credentials
        if(userLogin.getText().equals("Admin"))
            return true;
        else
            return false;
    }
}




