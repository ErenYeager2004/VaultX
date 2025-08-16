package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Login extends JFrame implements ActionListener {
    private final int appWidth = 850;
    private final int appHeight = 550;

    private final JButton signIn, clear, signUp;
    private final JTextField userNameField;
    private final JPasswordField passwordField;

    // Animation variables
    private JComponent[] slideComps;
    private int[] targetY;

    public Login() {
        super("VaultX");

        // Background
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, appWidth, appHeight);
        backgroundLabel.setLayout(null);
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
        cardLabel.setBounds(630, 410, 100, 100);

        // Original Welcome text design
        JLabel text = new JLabel("Welcome to VaultX", SwingConstants.CENTER);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Segoe UI", Font.BOLD, 40));
        text.setBounds(150, 130, 550, 50);

        JLabel shadowText = new JLabel("Welcome to VaultX", SwingConstants.CENTER);
        shadowText.setForeground(new Color(0, 0, 0, 150));
        shadowText.setFont(new Font("Segoe UI", Font.BOLD, 40));
        shadowText.setBounds(152, 132, 550, 50);

        // Fields start off-screen
        int startY = appHeight + 50;

        JLabel userName = new JLabel("User Name :");
        userName.setFont(new Font("Raleway", Font.BOLD, 28));
        userName.setForeground(Color.white);
        userName.setBounds(180, startY, 375, 30);

        JLabel password = new JLabel("Pin :");
        password.setFont(new Font("Raleway", Font.BOLD, 28));
        password.setForeground(Color.WHITE);
        password.setBounds(180, startY, 375, 30);

        // Visible, rounded text field
        userNameField = new JTextField(15);
        userNameField.setBounds(380, startY, 230, 30);
        userNameField.setFont(new Font("Arial", Font.BOLD, 14));
        userNameField.setBackground(new Color(245, 245, 245));
        userNameField.setForeground(Color.BLACK);
        userNameField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true));

        passwordField = new JPasswordField(15);
        passwordField.setBounds(380, startY, 230, 30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        passwordField.setBackground(new Color(245, 245, 245));
        passwordField.setForeground(Color.BLACK);
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true));

        // Stylish gradient buttons
        signIn = createStyledButton("Sign In", new Color(0x4CAF50), new Color(0x2E7D32));
        signIn.setBounds(375, startY, 100, 35);
        signIn.addActionListener(this);

        clear = createStyledButton("Clear", new Color(0xF44336), new Color(0xB71C1C));
        clear.setBounds(515, startY, 100, 35);
        clear.addActionListener(this);

        signUp = createStyledButton("Sign Up", new Color(0x2196F3), new Color(0x0D47A1));
        signUp.setBounds(380, startY, 230, 35);
        signUp.addActionListener(this);

        // Add to background
        backgroundLabel.add(shadowText);
        backgroundLabel.add(text);
        backgroundLabel.add(bankLabel);
        backgroundLabel.add(cardLabel);
        backgroundLabel.add(userName);
        backgroundLabel.add(password);
        backgroundLabel.add(userNameField);
        backgroundLabel.add(passwordField);
        backgroundLabel.add(signIn);
        backgroundLabel.add(clear);
        backgroundLabel.add(signUp);

        // Frame setup
        setLayout(null);
        add(backgroundLabel);
        setSize(appWidth, appHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        // Slide from bottom animation
        slideComps = new JComponent[]{
                userName, password, userNameField, passwordField, signIn, clear, signUp
        };
        targetY = new int[]{
                200, 250, 200, 250, 300, 300, 350
        };
        startSlideUpAnimation();
    }

    private JButton createStyledButton(String text, Color c1, Color c2) {
        return new JButton(text) {
            private boolean hovered = false;
            private boolean pressed = false;

            {
                setFocusPainted(false);
                setContentAreaFilled(false);
                setForeground(Color.WHITE);
                setFont(new Font("Arial", Font.BOLD, 14));
                setBorder(BorderFactory.createEmptyBorder());

                addMouseListener(new MouseAdapter() {
                    @Override public void mouseEntered(MouseEvent e) { hovered = true; repaint(); }
                    @Override public void mouseExited(MouseEvent e)  { hovered = false; repaint(); }
                    @Override public void mousePressed(MouseEvent e) { pressed = true; repaint(); }
                    @Override public void mouseReleased(MouseEvent e){ pressed = false; repaint(); }
                });
            }

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int inset = pressed ? 2 : 0;
                g2.setPaint(new GradientPaint(0, 0, hovered ? c1.brighter() : c1,
                        getWidth(), getHeight(), hovered ? c2.brighter() : c2));
                g2.fillRoundRect(inset, inset, getWidth() - inset*2, getHeight() - inset*2, 15, 15);

                if (hovered) {
                    g2.setColor(new Color(255, 255, 255, 60));
                    g2.setStroke(new BasicStroke(2f));
                    g2.drawRoundRect(inset, inset, getWidth() - inset*2, getHeight() - inset*2, 15, 15);
                }

                super.paintComponent(g2);
                g2.dispose();
            }
        };
    }

    private void startSlideUpAnimation() {
        Timer timer = new Timer(15, e -> {
            boolean allDone = true;
            for (int i = 0; i < slideComps.length; i++) {
                JComponent c = slideComps[i];
                int ty = targetY[i];
                int cy = c.getY();
                if (cy > ty) {
                    int step = Math.max(1, (cy - ty) / 8); // smooth easing
                    c.setLocation(c.getX(), cy - step);
                    allDone = false;
                }
            }
            if (allDone) ((Timer) e.getSource()).stop();
        });
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            userNameField.setText("");
            passwordField.setText("");
        } else if (e.getSource() == signIn) {
            JOptionPane.showMessageDialog(this, "Sign In clicked");
        } else if (e.getSource() == signUp) {
            new SignUp();
            dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}
