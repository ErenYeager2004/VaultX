package views.signupForms;

import com.toedter.calendar.JDateChooser;
import exceptions.*;
import models.User;
import utilities.Utils;
import views.SignUp;
import views.style.RoundedButton;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SignUpPage1 extends JPanel {
    private final JTextField firstName, middleName, lastName;
    private final JTextField fFirstName, fMiddleName, fLastName;
    private final JTextField emailAddress, phoneNo;
    private final JTextField permanentAddress;
    private final JTextField pinCode;
    private final JDateChooser dateChooser;
    private final JRadioButton male, female;
    private final JRadioButton single, married;
    private final JComboBox<String> stateComboBox;
    private final JComboBox<String> cityComboBox;
    private final JComboBox<String> nationalityBox;
    private final JButton next;

    // Constructor accepts callback for "Next" action
    public SignUpPage1(SignUp mainFrame) {
        setLayout(null);
        setBackground(new Color(222, 255, 228));

        int jLabelX = 60;
        int jLabelY = 170;
        int jLabelWidth = 150;
        int jLabelHeight = 30;
        int jTextFeildX = 225;
        int jTextFeildY = 170;
        int nameFieldWidth = 130;
        int nameFieldHeight = 30;

        // --- Header ---
        Image bank = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/bank.png"))
        ).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel bankLabel = new JLabel(new ImageIcon(bank));
        bankLabel.setBounds(25, 10, 100, 100);
        add(bankLabel);

        JLabel formNumber = new JLabel("Application Form no :" + Utils.getRandomNumber());
        formNumber.setBounds(170, 20, 600, 40);
        formNumber.setFont(new Font("Raleway", Font.BOLD, 32));
        add(formNumber);

        JLabel page1 = new JLabel("Page 1");
        page1.setFont(new Font("Raleway", Font.BOLD, 22));
        page1.setBounds(330, 70, 600, 30);
        add(page1);

        JLabel personalDetail = new JLabel("Personal Details");
        personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetail.setBounds(290, 90, 600, 35);
        add(personalDetail);

        // --- Form Fields ---
        JLabel name = Utils.createRequiredLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(jLabelX, jLabelY, jLabelWidth, jLabelHeight);
        add(name);

        firstName = new JTextField();
        firstName.setFont(new Font("Raleway", Font.BOLD, 14));
        firstName.setBounds(jTextFeildX, jTextFeildY, nameFieldWidth, nameFieldHeight);
        add(firstName);

        middleName = new JTextField();
        middleName.setFont(new Font("Raleway", Font.BOLD, 14));
        middleName.setBounds(jTextFeildX + 160, jTextFeildY, nameFieldWidth, nameFieldHeight);
        add(middleName);

        lastName = new JTextField();
        lastName.setFont(new Font("Raleway", Font.BOLD, 14));
        lastName.setBounds(jTextFeildX + 320, jTextFeildY, nameFieldWidth, nameFieldHeight);
        add(lastName);

        JLabel fatherName = new JLabel("Father Name:");
        fatherName.setFont(new Font("Raleway", Font.BOLD, 20));
        fatherName.setBounds(jLabelX, jLabelY + 50, 150, 30);
        add(fatherName);

        fFirstName = new JTextField();
        fFirstName.setFont(new Font("Raleway", Font.BOLD, 14));
        fFirstName.setBounds(jTextFeildX, jTextFeildY + 50, nameFieldWidth, nameFieldHeight);
        add(fFirstName);

        fMiddleName = new JTextField();
        fMiddleName.setFont(new Font("Raleway", Font.BOLD, 14));
        fMiddleName.setBounds(jTextFeildX + 160, jTextFeildY + 50, nameFieldWidth, nameFieldHeight);
        add(fMiddleName);

        fLastName = new JTextField();
        fLastName.setFont(new Font("Raleway", Font.BOLD, 14));
        fLastName.setBounds(jTextFeildX + 320, jTextFeildY + 50, nameFieldWidth, nameFieldHeight);
        add(fLastName);

        JLabel DOB = Utils.createRequiredLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(jLabelX, jLabelY + 100, 150, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(jTextFeildX, jTextFeildY + 100, nameFieldWidth, nameFieldHeight);
        add(dateChooser);

        JLabel gender = Utils.createRequiredLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(jLabelX, jLabelY + 150, 150, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 14));
        male.setBounds(jTextFeildX, jTextFeildY + 150, 60, 30);
        male.setBackground(new Color(222, 255, 228));
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        female.setBounds(jTextFeildX + 100, jTextFeildY + 150, 90, 30);
        female.setBackground(new Color(222, 255, 228));
        add(female);

        Utils.groupButtons(male, female);

        JLabel maritalStatus = Utils.createRequiredLabel("Marital Status: ");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(jLabelX, jLabelY + 200, 155, 40);
        add(maritalStatus);

        single = new JRadioButton("Single");
        single.setFont(new Font("Raleway", Font.BOLD, 14));
        single.setBounds(jTextFeildX, jTextFeildY + 200, 90, 30);
        single.setBackground(new Color(222, 255, 228));
        add(single);

        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 14));
        married.setBounds(jTextFeildX + 100, jTextFeildY + 200, 90, 30);
        married.setBackground(new Color(222, 255, 228));
        add(married);

        Utils.groupButtons(single, married);

        JLabel nationality = Utils.createRequiredLabel("Nationality: ");
        nationality.setFont(new Font("Raleway", Font.BOLD, 20));
        nationality.setBounds(jLabelX, jLabelY + 250, 150, 30);
        add(nationality);

        nationalityBox = new JComboBox<>(Utils.countries);
        nationalityBox.setFont(new Font("Raleway", Font.BOLD, 14));
        nationalityBox.setBounds(jTextFeildX, jTextFeildY + 250, nameFieldWidth, nameFieldHeight);
        nationalityBox.setSelectedItem("India");
        add(nationalityBox);

        JLabel email = Utils.createRequiredLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(jLabelX, jLabelY + 300, 150, 30);
        add(email);

        emailAddress = new JTextField();
        emailAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        emailAddress.setBounds(jTextFeildX, jTextFeildY + 300, nameFieldWidth + 90, nameFieldHeight);
        add(emailAddress);

        JLabel phoneNumber = Utils.createRequiredLabel("Phone Number: ");
        phoneNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        phoneNumber.setBounds(jLabelX, jLabelY + 350, 170, 30);
        add(phoneNumber);

        phoneNo = new JTextField();
        phoneNo.setFont(new Font("Raleway", Font.BOLD, 14));
        phoneNo.setBounds(jTextFeildX, jTextFeildY + 350, nameFieldWidth, nameFieldHeight);
        add(phoneNo);

        JLabel address = Utils.createRequiredLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(jLabelX, jLabelY + 400, 150, 30);
        add(address);

        permanentAddress = new JTextField();
        permanentAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        permanentAddress.setBounds(jTextFeildX, jTextFeildY + 400, nameFieldWidth + 150, nameFieldHeight);
        add(permanentAddress);

        JLabel stateLabel = Utils.createRequiredLabel("State: ");
        stateLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        stateLabel.setBounds(jLabelX, jLabelY + 450, 150, 30);
        add(stateLabel);

        stateComboBox = new JComboBox<>(Utils.STATES);
        stateComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        stateComboBox.setBounds(jTextFeildX, jTextFeildY + 450, nameFieldWidth + 50, nameFieldHeight);
        add(stateComboBox);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        cityLabel.setBounds(jLabelX + 350, jLabelY + 450, 100, 30);
        add(cityLabel);

        cityComboBox = new JComboBox<>();
        cityComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        cityComboBox.setBounds(jTextFeildX + 280, jTextFeildY + 450, nameFieldWidth + 50, nameFieldHeight);
        add(cityComboBox);

        Utils.linkStateCity(stateComboBox, cityComboBox);

        JLabel pincode = Utils.createRequiredLabel("Pincode: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(jLabelX, jLabelY + 500, 100, 30);
        add(pincode);

        pinCode = new JTextField();
        pinCode.setFont(new Font("Raleway", Font.BOLD, 14));
        pinCode.setBounds(jTextFeildX, jTextFeildY + 500, nameFieldWidth, nameFieldHeight);
        add(pinCode);

        // --- Next Button ---
        next = new RoundedButton(
                "Next",
                new Color(0, 153, 102),
                new Color(0, 204, 153)
        );
        next.setBounds(300, 770, 120, 40);
        add(next);

        next.addActionListener(e -> {
            try {
                User user = toUser();
                mainFrame.setUser(user);
                mainFrame.showPage("Page2");
            } catch (RequiredFieldException | InvalidEmailException | InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage(),
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });

    }

    // Getters to access entered form data
    public String getFirstName() {
        return firstName.getText().trim();
    }

    public String getMiddleName() {
        return middleName.getText().trim();
    }

    public String getLastName() {
        return lastName.getText().trim();
    }

    public String getFatherFirstName() {
        return fFirstName.getText().trim();
    }

    public String getFatherMiddleName() {
        return fMiddleName.getText().trim();
    }

    public String getFatherLastName() {
        return fLastName.getText().trim();
    }

    public String getDateOfBirth() {
        java.util.Date date = dateChooser.getDate();
        return Utils.formatToDDMMYYYY(date);
    }

    public String getGender() {
        if (male.isSelected()) return "Male";
        else if (female.isSelected()) return "Female";
        else return null;
    }

    public String getMaritalStatus() {
        if (single.isSelected()) return "Single";
        else if (married.isSelected()) return "Married";
        else return null;
    }

    public String getNationality() {
        return Objects.requireNonNull(nationalityBox.getSelectedItem()).toString();
    }

    public String getEmailAddress() {
        return emailAddress.getText().trim();
    }

    public String getPhoneNo() {
        return phoneNo.getText().trim();
    }

    public String getAddress() {
        return permanentAddress.getText().trim();
    }

    public String getState() {
        return Objects.requireNonNull(stateComboBox.getSelectedItem()).toString();
    }

    public String getCity() {
        return Objects.requireNonNull(cityComboBox.getSelectedItem()).toString();
    }

    public String getPinCode() {
        return pinCode.getText().trim();
    }

    public User toUser() throws RequiredFieldException, InvalidEmailException, InvalidPhoneException {
        Utils.validateRequired(getFirstName(), "First Name");
        Utils.validateRequired(getDateOfBirth(), "Date of Birth");
        if (getGender() == null) throw new RequiredFieldException("Gender");
        if (getMaritalStatus() == null) throw new RequiredFieldException("Marital Status");
        Utils.validateRequired(getAddress(), "Address");
        Utils.validateRequired(getState(), "State");
        if (cityComboBox.getSelectedItem() == null) {
            throw new RequiredFieldException("City");
        }
        Utils.validateRequired(getPinCode(), "Pincode");

        // ✅ Email & Phone validations
        Utils.validateEmail(getEmailAddress());
        Utils.validatePhone(getPhoneNo());
        
        User user = new User();
        user.setFirstName(getFirstName());
        user.setMiddleName(getMiddleName());
        user.setLastName(getLastName());
        user.setFatherFirstName(getFatherFirstName());
        user.setFatherMiddleName(getFatherMiddleName());
        user.setFatherLastName(getFatherLastName());
        user.setDob(getDateOfBirth()); // already parse Date
        user.setGender(getGender());
        user.setMaritalStatus(getMaritalStatus());
        user.setNationality(getNationality());
        user.setEmail(getEmailAddress());
        user.setPhoneNo(getPhoneNo());
        user.setAddress(getAddress());
        user.setState(getState());
        user.setCity(getCity());
        user.setPinCode(getPinCode());
        return user;
    }
}
