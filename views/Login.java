package views;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends JFrame {
    private final int appWidth = 850;
    private final int appHeight = 450;

    public Login() {
        super("VaultX");

        // Load background first
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, appWidth, appHeight);
        backgroundLabel.setLayout(null); // to place components over it

        Image background = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/backbg.png"))
        ).getImage().getScaledInstance(appWidth, appHeight, Image.SCALE_SMOOTH);
        backgroundLabel.setIcon(new ImageIcon(background));

        // Bank logo
        Image bank = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/bank.png"))
        ).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel bankLabel = new JLabel(new ImageIcon(bank));
        bankLabel.setBounds(350, 10, 100, 100);

        // Card image
        Image card = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/card.png"))
        ).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel cardLabel = new JLabel(new ImageIcon(card));
        cardLabel.setBounds(630, 310, 100, 100);

        // Stylish text
        JLabel text = new JLabel("Welcome to VaultX", SwingConstants.CENTER);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Segoe UI", Font.BOLD, 40));
        text.setBounds(150, 130, 550, 50);
        text.setOpaque(false); // transparent background

        // Drop shadow effect
        JLabel shadowText = new JLabel("Welcome to VaultX", SwingConstants.CENTER);
        shadowText.setForeground(new Color(0, 0, 0, 150)); // semi-transparent black
        shadowText.setFont(new Font("Segoe UI", Font.BOLD, 40));
        shadowText.setBounds(152, 132, 550, 50);

        // Add to background
        backgroundLabel.add(shadowText);
        backgroundLabel.add(text);
        backgroundLabel.add(bankLabel);
        backgroundLabel.add(cardLabel);

        // Frame setup
        setLayout(null);
        add(backgroundLabel);
        setSize(appWidth, appHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}
