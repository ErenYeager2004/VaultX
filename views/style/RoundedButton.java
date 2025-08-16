package views.style;

import javax.swing.*;
import java.awt.*;

// Custom rounded JButton with hover & shadow
public class RoundedButton extends JButton {
    private Color normalColor;
    private Color hoverColor;
    private boolean hovered = false;

    public RoundedButton(String text, Color normalColor, Color hoverColor) {
        super(text);
        this.normalColor = normalColor;
        this.hoverColor = hoverColor;
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        setForeground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFont(new Font("Raleway", Font.BOLD, 16));

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hovered = true;
                repaint();
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                hovered = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Shadow effect
        if (hovered) {
            g2.setColor(new Color(0, 0, 0, 60)); // dark shadow
            g2.fillRoundRect(3, 5, getWidth() - 6, getHeight() - 5, 20, 20);
        } else {
            g2.setColor(new Color(0, 0, 0, 40)); // lighter shadow
            g2.fillRoundRect(3, 4, getWidth() - 6, getHeight() - 4, 20, 20);
        }

        // Button background
        g2.setColor(hovered ? hoverColor : normalColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        super.paintComponent(g);
        g2.dispose();
    }
}
