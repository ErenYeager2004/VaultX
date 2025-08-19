package views.signupForms;
import utilities.Utils;
import views.SignUp;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class SignUpPage2 extends JPanel {

    private final JComboBox<String> religions;
    private final JComboBox<String> categories;
    public SignUpPage2(SignUp frame1) {

        int jLabelX = 60;
        int jLabelY = 170;
        int jLabelWidth = 150;
        int jLabelHeight = 30;
        int jTextFeildX = 225;
        int jTextFeildY = 170;
        int nameFieldWidth = 130;
        int nameFieldHeight = 30;

        setLayout(null);
        setBackground(new Color(252,208,76));

        Image bank = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/bank.png"))
        ).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel bankLabel = new JLabel(new ImageIcon(bank));
        bankLabel.setBounds(25, 10, 100, 100);
        add(bankLabel);

        JLabel page1 = new JLabel("Page 2");
        page1.setFont(new Font("Raleway", Font.BOLD, 22));
        page1.setBounds(330, 70, 600, 30);
        add(page1);

        JLabel personalDetail = new JLabel("Additional Details");
        personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetail.setBounds(290, 90, 600, 35);
        add(personalDetail);

        JLabel religion = new JLabel("Religion :");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(jLabelX, jLabelY, jLabelWidth, jLabelHeight);
        add(religion);

        religions = new JComboBox<>(Utils.religion);
        religions.setFont(new Font("Raleway", Font.BOLD, 15));
        religions.setBackground(new Color(252,208,76));
        religions.setBounds(jTextFeildX, jTextFeildY, nameFieldWidth, nameFieldHeight);
        religions.setSelectedItem(Utils.religion[0]);
        add(religions);

        JLabel category = new JLabel("Category :");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(jLabelX, jLabelY + 50, 150, 30);
        add(category);

        categories = new JComboBox<>(Utils.category);
        categories.setFont(new Font("Raleway", Font.BOLD, 15));
        categories.setBackground(new Color(252,208,76));
        categories.setBounds(jTextFeildX, jTextFeildY+50, nameFieldWidth, nameFieldHeight);
        categories.setSelectedItem(Utils.category[0]);
        add(categories);
    }

}
