package views;

import views.signupForms.SignUpPage1;
import views.signupForms.SignUpPage2;
import views.signupForms.SignUpPage3;

import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;

    public SignUp() {
        super("Application Form");

        // Main layout: CardLayout to switch between pages
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Add pages
        cardPanel.add(new SignUpPage1(this), "Page1");
        cardPanel.add(new SignUpPage2(this), "Page2");
        cardPanel.add(new SignUpPage3(this), "Page3");

        add(cardPanel);

        setSize(750, 870);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    // Method to switch between pages
    public void showPage(String pageName) {
        cardLayout.show(cardPanel, pageName);
    }
}
