package main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.BorderFactory;

public class WelcomePanel extends JPanel {
    JLabel lWelcome = new JLabel("Welcome");

    Font fBig = new Font("Helvetica", Font.PLAIN, 32);
    Font fSmall = new Font("Helvetica", Font.BOLD, 16);
    Font fTiny = new Font("Helvetica", Font.BOLD, 14);

    public WelcomePanel() {
        this.setPreferredSize(new Dimension(800, 500));
        this.setLayout(null);
        this.setBackground(Color.white);

        lWelcome.setBounds(320, 50, 160, 40);
        lWelcome.setFont(fBig);
        this.add(lWelcome);
    }
}