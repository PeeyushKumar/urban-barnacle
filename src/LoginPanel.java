package main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.*;

import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

import java.awt.event.*;

import javax.swing.BorderFactory;
import java.awt.*;

public class LoginPanel extends JPanel {
    JLabel lLogin = new JLabel("Login");
    JLabel lUsername = new JLabel("Username: ");
    JLabel lPassword = new JLabel("Password: ");
    JLabel lstatus = new JLabel("");

    public JTextField textField = new JTextField(); 
    public JPasswordField passField = new JPasswordField();
    public JButton loginButton = new JButton("Login");

    Font fBig = new Font("Helvetica", Font.PLAIN, 32);
    Font fSmall = new Font("Helvetica", Font.BOLD, 16);
    Font fTiny = new Font("Helvetica", Font.BOLD, 14);

    public LoginPanel() {
        this.setPreferredSize(new Dimension(800, 500));
        this.setLayout(null);
        this.setBackground(Color.white);

        lLogin.setBounds(350, 50, 100, 40);
        lLogin.setFont(fBig);
        this.add(lLogin);
        
        lUsername.setBounds(300, 110, 150, 40);
        lUsername.setFont(fSmall);
        this.add(lUsername);

        textField.setBounds(300, 150, 200, 30);
        textField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
                System.out.println(e1.getActionCommand());
            }
        });
        textField.setFont(fTiny);
        textField.setBorder(BorderFactory.createLineBorder(new Color(220,220,220)));
        this.add(this.textField);

        lPassword.setBounds(300, 190, 150, 40);
        lPassword.setFont(fSmall);
        this.add(lPassword);

        passField.setBounds(300, 230, 200, 30);
        passField.setFont(fTiny);
        passField.setBorder(BorderFactory.createLineBorder(new Color(220,220,220)));
        this.add(this.passField);

        loginButton.setBounds(345, 290, 110, 40);
        loginButton.setBackground(new Color(37, 150, 190));
        loginButton.setForeground(Color.white);
        loginButton.setFocusable(false);
        loginButton.setBorder(BorderFactory.createEmptyBorder());
        loginButton.setActionCommand("Login");
        this.add(this.loginButton);

        lstatus.setHorizontalAlignment(SwingConstants.CENTER);
        lstatus.setBounds(0, 340, 800, 30);
        add(lstatus);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(246,248,250));
        g2d.fill(new RoundRectangle2D.Float(250, 100, 300, 280, 30, 30));
    }
}