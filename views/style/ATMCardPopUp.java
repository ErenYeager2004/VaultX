package views.style;

import utilities.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class ATMCardPopUp extends JFrame {

    private int targetWidth = 360;
    private int targetHeight = 225;

    // Animated labels
    private FadeLabel cardType, bankLabel, cardNumberLabel, expiryLabel, cvvLabel, userLabel;
    String bankName, userName, cardNumber, expiry, cvv;
    public ATMCardPopUp() {
        this.bankName = Utils.bankName;
        this.cardNumber = Utils.generateATMNumber();
        this.cvv = Utils.generateCVV();
        this.expiry = Utils.generateATMExpiryDate();
        this.userName = "Debjit Saha";
        setTitle("Your ATM Card");
        setUndecorated(true);
        setSize(0, 0); // start small
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Background image
        ImageIcon cardBg = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/ATM_card.jpg"))
        );
        Image scaledImage = cardBg.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(scaledImage));
        background.setBounds(0, 0, targetWidth, targetHeight);
        background.setLayout(null);
        setContentPane(background);

        // Labels (with fade support)
        cardType = new FadeLabel("Debit Card",new Font("Raleway",Font.BOLD,16),20,30,200,20);
        bankLabel = new FadeLabel(bankName, new Font("Raleway", Font.BOLD, 19), 270, 20, 200, 20);
        cardNumberLabel = new FadeLabel(cardNumber, new Font("Consolas", Font.BOLD, 27), 35, 125, 300, 25);
        expiryLabel = new FadeLabel("VALID " + expiry, new Font("Arial", Font.PLAIN, 14), 20, 160, 150, 20);
        cvvLabel = new FadeLabel("CVV: " + cvv, new Font("Arial", Font.PLAIN, 14), 250, 160, 100, 20);
        userLabel = new FadeLabel("Mr."+ userName.toUpperCase(), new Font("Raleway", Font.BOLD, 16), 20, 190, 300, 20);


        background.add(cardType);
        background.add(bankLabel);
        background.add(cardNumberLabel);
        background.add(expiryLabel);
        background.add(cvvLabel);
        background.add(userLabel);

        // Start animation
        animatePopup();

        setVisible(true);

    }

    private void animatePopup() {
        Timer timer = new Timer(10, e -> {
            int w = getWidth();
            int h = getHeight();

            if (w < targetWidth || h < targetHeight) {
                setSize(Math.min(w + 20, targetWidth), Math.min(h + 12, targetHeight));
                setLocationRelativeTo(null);
            } else {
                ((Timer) e.getSource()).stop();
                animateText();
            }
        });
        timer.start();
    }

    private void animateText() {
        FadeLabel[] labels = {cardType, bankLabel, cardNumberLabel, expiryLabel, cvvLabel, userLabel};

        final int[] index = {0};
        Timer textTimer = new Timer(600, null); // each label every 600ms
        textTimer.addActionListener((ActionEvent e) -> {
            if (index[0] < labels.length) {
                labels[index[0]].startFadeIn();
                index[0]++;
            } else {
                ((Timer) e.getSource()).stop();
            }
        });
        textTimer.start();
    }

    // --- Custom fade-in label ---
    static class FadeLabel extends JLabel {
        private float alpha = 0f;

        public FadeLabel(String text, Font font, int x, int y, int w, int h) {
            super(text);
            setFont(font);
            setForeground(Color.WHITE);
            setBounds(x, y, w, h);
        }

        public void startFadeIn() {
            Timer fadeTimer = new Timer(40, e -> {
                alpha += 0.08f;
                if (alpha >= 1f) {
                    alpha = 1f;
                    ((Timer) e.getSource()).stop();
                }
                repaint();
            });
            fadeTimer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ATMCardPopUp::new);
    }
}
