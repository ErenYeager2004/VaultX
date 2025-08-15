package views;
import com.toedter.calendar.JDateChooser;
import style.RoundedButton;
import utilities.Utils;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SignUp extends JFrame {
    private final int width = 750;
    private final int height = 870;

    private final int jLabelX = 60;
    private final int jLabelY = 170;
    private final int jLabelWidth = 100;
    private final int jLabelHeight = 30;
    private final int jTextFeildX = 210;
    private final int jTextFeildY = 170;
    private final int nameFieldWidth = 130;
    private final int nameFieldHeight = 30;
    private final JTextField firstName,middleName,lastName;
    private final JTextField fFirstName,fMiddleName,fLastName;
    private final JTextField emailAddress,phoneNo;
    private final JTextField permanentAddress;
    private final JTextField pinCode;
    private final JDateChooser dateChooser;
    private final JRadioButton male,female;
    private final JRadioButton single,married;
    private final JComboBox<String> stateComboBox;
    private final JComboBox<String> cityComboBox;
    private final JComboBox<String> nationalityBox;
    private final JButton next;
    public SignUp(){
        super("Application Form");

        Image bank = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/bank.png"))
        ).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel bankLabel = new JLabel(new ImageIcon(bank));
        bankLabel.setBounds(25, 10, 100, 100);
        getContentPane().setBackground(new Color(222,255,228));
        add(bankLabel);

        JLabel formNumber = new JLabel("Application Form no :"+ Utils.getRandomNumber());
        formNumber.setBounds(170,20,600,40);
        formNumber.setFont(new Font("Raleway",Font.BOLD,32));

        JLabel page1 = new JLabel("Page 1");
        page1.setFont(new Font("Raleway",Font.BOLD,22));
        page1.setBounds(330,70,600,30);
        add(page1);

        JLabel personalDetail = new JLabel("Personal Details");
        personalDetail.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetail.setBounds(290,90,600,35);

        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(jLabelX,jLabelY,jLabelWidth,jLabelHeight);
        add(name);

        firstName = new JTextField();
        firstName.setFont(new Font("Raleway",Font.BOLD,14));
        firstName.setBounds(jTextFeildX,jTextFeildY,nameFieldWidth,nameFieldHeight);
        add(firstName);

        middleName = new JTextField();
        middleName.setFont(new Font("Raleway",Font.BOLD,14));
        middleName.setBounds(jTextFeildX+160,jTextFeildY,nameFieldWidth,nameFieldHeight);
        add(middleName);

        lastName = new JTextField();
        lastName.setFont(new Font("Raleway",Font.BOLD,14));
        lastName.setBounds(jTextFeildX+320,jTextFeildY,nameFieldWidth,nameFieldHeight);
        add(lastName);

        JLabel fatherName = new JLabel("Father Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD,20));
        fatherName.setBounds(jLabelX,jLabelY+50,150,30);
        add(fatherName);

        fFirstName = new JTextField();
        fFirstName.setFont(new Font("Raleway",Font.BOLD,14));
        fFirstName.setBounds(jTextFeildX,jTextFeildY+50,nameFieldWidth,nameFieldHeight);
        add(fFirstName);

        fMiddleName = new JTextField();
        fMiddleName.setFont(new Font("Raleway",Font.BOLD,14));
        fMiddleName.setBounds(jTextFeildX+160,jTextFeildY+50,nameFieldWidth,nameFieldHeight);
        add(fMiddleName);

        fLastName = new JTextField();
        fLastName.setFont(new Font("Raleway",Font.BOLD,14));
        fLastName.setBounds(jTextFeildX+320,jTextFeildY+50,nameFieldWidth,nameFieldHeight);
        add(fLastName);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(jLabelX,jLabelY+100,150,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(jTextFeildX,jTextFeildY+100,nameFieldWidth,nameFieldHeight);
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(jLabelX,jLabelY+150,150,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway",Font.BOLD,14));
        male.setBounds(jTextFeildX,jTextFeildY+150,60,30);
        male.setBackground(new Color(222,255,228));
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway",Font.BOLD,14));
        female.setBounds(jTextFeildX+100,jTextFeildY+150,90,30);
        female.setBackground(new Color(222,255,228));
        add(female);

        Utils.groupButtons(male,female);

        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(jLabelX,jLabelY+200,150,30);
        add(maritalStatus);

        single = new JRadioButton("Single");
        single.setFont(new Font("Raleway",Font.BOLD,14));
        single.setBounds(jTextFeildX,jTextFeildY+200,90,30);
        single.setBackground(new Color(222,255,228));
        add(single);

        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway",Font.BOLD,14));
        married.setBounds(jTextFeildX+100,jTextFeildY+200,90,30);
        married.setBackground(new Color(222,255,228));
        add(married);

        Utils.groupButtons(single,married);

        JLabel nationality = new JLabel("Nationality:");
        nationality.setFont(new Font("Raleway",Font.BOLD,20));
        nationality.setBounds(jLabelX,jLabelY+250,150,30);
        add(nationality);

        nationalityBox = new JComboBox<>(Utils.countries);
        nationalityBox.setFont(new Font("Raleway", Font.BOLD, 14));
        nationalityBox.setBounds(jTextFeildX, jTextFeildY + 250, nameFieldWidth, nameFieldHeight);
        nationalityBox.setSelectedItem("India");
        add(nationalityBox);

        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(jLabelX,jLabelY+300,150,30);
        add(email);

        emailAddress = new JTextField();
        emailAddress.setFont(new Font("Raleway",Font.BOLD,14));
        emailAddress.setBounds(jTextFeildX,jTextFeildY+300,nameFieldWidth+90,nameFieldHeight);
        add(emailAddress);

        JLabel phoneNumber = new JLabel("Phone Number:");
        phoneNumber.setFont(new Font("Raleway",Font.BOLD,20));
        phoneNumber.setBounds(jLabelX,jLabelY+350,150,30);
        add(phoneNumber);

        phoneNo = new JTextField();
        phoneNo.setFont(new Font("Raleway",Font.BOLD,14));
        phoneNo.setBounds(jTextFeildX,jTextFeildY+350,nameFieldWidth,nameFieldHeight);
        add(phoneNo);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(jLabelX,jLabelY+400,150,30);
        add(address);

        permanentAddress = new JTextField();
        permanentAddress.setFont(new Font("Raleway",Font.BOLD,14));
        permanentAddress.setBounds(jTextFeildX,jTextFeildY+400,nameFieldWidth+150,nameFieldHeight);
        add(permanentAddress);

        // State label and combo box
        JLabel stateLabel = new JLabel("State:");
        stateLabel.setFont(new Font("Raleway",Font.BOLD,20));
        stateLabel.setBounds(jLabelX,jLabelY+450,150,30);
        add(stateLabel);

        stateComboBox = new JComboBox<>(Utils.STATES);
        stateComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        stateComboBox.setBounds(jTextFeildX,jTextFeildY+450, nameFieldWidth+50, nameFieldHeight);
        add(stateComboBox);

        // City label and combo box
        JLabel cityLabel = new JLabel("City:");
        cityLabel.setFont(new Font("Raleway",Font.BOLD,20));
        cityLabel.setBounds(jLabelX+350,jLabelY+450,100,30);
        add(cityLabel);

        cityComboBox = new JComboBox<>();
        cityComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        cityComboBox.setBounds(jTextFeildX+280,jTextFeildY+450, nameFieldWidth+50, nameFieldHeight);
        add(cityComboBox);

        // Link state and city dropdowns
        Utils.linkStateCity(stateComboBox, cityComboBox);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(jLabelX,jLabelY+500,100,30);
        add(pincode);

        pinCode = new JTextField();
        pinCode.setFont(new Font("Raleway",Font.BOLD,14));
        pinCode.setBounds(jTextFeildX,jTextFeildY+500,nameFieldWidth,nameFieldHeight);
        add(pinCode);

        next = new RoundedButton(
                "Next",
                new Color(0, 153, 102),  // Normal green
                new Color(0, 204, 153)   // Hover green
        );
        next.setBounds(300, 770, 120, 40);
        add(next);

        add(personalDetail);
        add(formNumber);
        setLayout(null);
        setSize(width,height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
