package main;

import javax.swing.JFrame;
import java.awt.event.*;

import main.database.Database;

public class AppFrame extends JFrame implements ActionListener {
    LoginPanel loginPanel;
    WelcomePanel welcomePanel;

    Database db = new Database();

    public AppFrame() {
        setTitle("AppFrame");

        createPanels();
        add(loginPanel);
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void createPanels() {
        loginPanel = new LoginPanel();
        loginPanel.loginButton.addActionListener(this);

        welcomePanel = new WelcomePanel();
    }

    public boolean login() {

        String enteredUsername = loginPanel.textField.getText();
        String enteredPassword = new String(loginPanel.passField.getPassword());

        return db.validate(enteredUsername, enteredPassword);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Login" :
                if (login()) {
                    loginPanel.setVisible(false);
                    welcomePanel.setVisible(true);
                    add(welcomePanel);
                }
                else {
                    loginPanel.lstatus.setText("Incorrect Username or Password!");
                }
        }

        //System.out.println(e.getActionCommand());
    }
}