package views;

import models.User;  // import your User model
import views.signupForms.SignUpPage1;
import views.signupForms.SignUpPage2;
import views.signupForms.SignUpPage3;

import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {

    private final CardLayout cardLayout;
    private final JPanel cardPanel;
    private User user; // 👉 store single User object here

    public SignUp() {
        super("Application Form");

        // Initialize the User object (empty for now)
        user = new User();

        // Main layout: CardLayout to switch between pages
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Add pages
        cardPanel.add(new SignUpPage1(this), "Page1");
        cardPanel.add(new SignUpPage2(this,user), "Page2");
        cardPanel.add(new SignUpPage3(this,user), "Page3");

        add(cardPanel);

        setSize(750, 870);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        showPage("Page2");
        setVisible(true);
    }

    // Method to switch between pages
    public void showPage(String pageName) {
        if (pageName.equals("Page2")) {
            // remove existing Page2 if exists
            for (Component c : cardPanel.getComponents()) {
                if (c instanceof SignUpPage2) {
                    cardPanel.remove(c);
                    break;
                }
            }
            // create Page2 with the current user
            SignUpPage2 page2 = new SignUpPage2(this, user);
            cardPanel.add(page2, "Page2");
        }
        cardLayout.show(cardPanel, pageName);
    }

    // get User object accessors
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
