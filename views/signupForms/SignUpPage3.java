package views.signupForms;

import models.User;
import utilities.Utils;
import views.SignUp;
import views.style.RoundedButton;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SignUpPage3 extends JPanel {

    int jLabelX = 70;
    int jLabelY = 170;
    int jLabelWidth = 170;
    int jLabelHeight = 40;
    int jTextFeildX = 240;
    int jTextFeildY = 180;
    int nameFieldWidth = 130;
    int nameFieldHeight = 30;

    private final JRadioButton savingAccount, currentAccount;
    private final JRadioButton netBanking, atmCard, chequeBook;
    private final JRadioButton nomineeYes, nomineeNo;
    private final JTextField nomineeFirstNameField, nomineeMiddleNameField, nomineeLastNameField, nomineePhoneField, nomineeAddressArea;
    private final JComboBox<String> nomineeRelationField, nomineeOccupationField;
    private final JPanel nomineePanel;
    private final JTextField initialDeposit;
    private final JComboBox<String>branches;
    private final JTextField userID;
    private final JTextField userPassword,userConfirmPasssword;
    public SignUpPage3(SignUp frame2, User user) {
        setLayout(null);
        setBackground(new Color(215, 252, 252));

        Image bank = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/bank.png"))
        ).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel bankLabel = new JLabel(new ImageIcon(bank));
        bankLabel.setBounds(25, 10, 100, 100);
        add(bankLabel);

        JLabel formNumber = new JLabel("Application Form no :" + user.getFormNo());
        formNumber.setBounds(170, 20, 600, 40);
        formNumber.setFont(new Font("Raleway", Font.BOLD, 32));
        add(formNumber);

        JLabel page1 = new JLabel("Page 3");
        page1.setFont(new Font("Raleway", Font.BOLD, 22));
        page1.setBounds(330, 65, 600, 30);
        add(page1);

        JLabel personalDetail = new JLabel("Account Details");
        personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetail.setBounds(290, 90, 600, 35);
        add(personalDetail);

        JLabel accountType = Utils.createRequiredLabel("Account Type :");
        accountType.setFont(new Font("Raleway", Font.BOLD, 20));
        accountType.setBounds(jLabelX, jLabelY, jLabelWidth, jLabelHeight);
        add(accountType);

        savingAccount = new JRadioButton("Savings Account");
        savingAccount.setFont(new Font("Raleway", Font.BOLD, 14));
        savingAccount.setBounds(jTextFeildX, jTextFeildY, 160, 30);
        savingAccount.setBackground(new Color(215, 252, 252));
        add(savingAccount);

        currentAccount = new JRadioButton("Current Account");
        currentAccount.setFont(new Font("Raleway", Font.BOLD, 14));
        currentAccount.setBounds(jTextFeildX + 180, jTextFeildY, 160, 30);
        currentAccount.setBackground(new Color(215, 252, 252));
        add(currentAccount);

        Utils.groupButtons(savingAccount, currentAccount);

        JLabel bankingServices = Utils.createRequiredLabel("Bank Services :");
        bankingServices.setFont(new Font("Raleway", Font.BOLD, 20));
        bankingServices.setBounds(jLabelX, jLabelY + 50, jLabelWidth, jLabelHeight);
        add(bankingServices);

        atmCard = new JRadioButton("ATM Card");
        atmCard.setFont(new Font("Raleway", Font.BOLD, 14));
        atmCard.setBounds(jTextFeildX, jTextFeildY + 50, 120, 30);
        atmCard.setBackground(new Color(215, 252, 252));
        add(atmCard);

        netBanking = new JRadioButton("Internet Banking");
        netBanking.setFont(new Font("Raleway", Font.BOLD, 14));
        netBanking.setBounds(jTextFeildX + 120, jTextFeildY + 50, 160, 30);
        netBanking.setBackground(new Color(215, 252, 252));
        add(netBanking);

        chequeBook = new JRadioButton("Cheque Book");
        chequeBook.setFont(new Font("Raleway", Font.BOLD, 14));
        chequeBook.setBounds(jTextFeildX + 300, jTextFeildY + 50, 160, 30);
        chequeBook.setBackground(new Color(215, 252, 252));
        add(chequeBook);

        JLabel nomineeLabel = new JLabel("Do you want a Nominee? :");
        nomineeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        nomineeLabel.setBounds(jLabelX, jLabelY + 100, jLabelWidth + 150, jLabelHeight);
        add(nomineeLabel);

        nomineeYes = new JRadioButton("Yes");
        nomineeYes.setFont(new Font("Raleway", Font.BOLD, 14));
        nomineeYes.setBounds(jTextFeildX + 100, jTextFeildY + 100, 80, 30);
        nomineeYes.setBackground(new Color(215, 252, 252));
        add(nomineeYes);

        nomineeNo = new JRadioButton("No");
        nomineeNo.setFont(new Font("Raleway", Font.BOLD, 14));
        nomineeNo.setBounds(jTextFeildX + 200, jTextFeildY + 100, 80, 30);
        nomineeNo.setBackground(new Color(215, 252, 252));
        add(nomineeNo);

        Utils.groupButtons(nomineeYes, nomineeNo);

        // ==== Nominee Panel (Hidden Initially) ====
        nomineePanel = new JPanel();
        nomineePanel.setLayout(null);
        nomineePanel.setBackground(new Color(215, 252, 252));
        nomineePanel.setBounds(jLabelX, jLabelY + 150, 650, 230);
        nomineePanel.setVisible(false);
        add(nomineePanel);

        // Nominee Name
        JLabel nomineeName = Utils.createRequiredLabel("Nominee Name :");
        nomineeName.setFont(new Font("Raleway", Font.BOLD, 20));
        nomineeName.setBounds(0, 5, 200, 30);
        nomineePanel.add(nomineeName);

        nomineeFirstNameField = new JTextField();
        nomineeFirstNameField.setFont(new Font("Raleway", Font.PLAIN, 14));
        nomineeFirstNameField.setBounds(180, 10, 120, 30);
        nomineePanel.add(nomineeFirstNameField);

        nomineeMiddleNameField = new JTextField();
        nomineeMiddleNameField.setFont(new Font("Raleway", Font.PLAIN, 14));
        nomineeMiddleNameField.setBounds(315, 10, 120, 30);
        nomineePanel.add(nomineeMiddleNameField);

        nomineeLastNameField = new JTextField();
        nomineeLastNameField.setFont(new Font("Raleway", Font.PLAIN, 14));
        nomineeLastNameField.setBounds(445, 10, 120, 30);
        nomineePanel.add(nomineeLastNameField);

        // Relationship
        JLabel nomineeRelation = Utils.createRequiredLabel("Relationship :");
        nomineeRelation.setFont(new Font("Raleway", Font.BOLD, 20));
        nomineeRelation.setBounds(0, 50, 200, 30);
        nomineePanel.add(nomineeRelation);

        nomineeRelationField = new JComboBox<>(Utils.relationship);
        nomineeRelationField.setFont(new Font("Raleway", Font.BOLD, 14));
        nomineeRelationField.setBackground(new Color(215, 252, 252));
        nomineeRelationField.setBounds(180, 50, 120, 30);
        nomineePanel.add(nomineeRelationField);

        // Phone Number
        JLabel nomineePhone = new JLabel("Phone No :");
        nomineePhone.setFont(new Font("Raleway", Font.BOLD, 20));
        nomineePhone.setBounds(0, 90, 200, 30);
        nomineePanel.add(nomineePhone);

        nomineePhoneField = new JTextField();
        nomineePhoneField.setFont(new Font("Raleway", Font.BOLD, 14));
        nomineePhoneField.setBounds(180, 93, 130, 30);
        nomineePanel.add(nomineePhoneField);

        // Address
        JLabel nomineeAddress = new JLabel("Address :");
        nomineeAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        nomineeAddress.setBounds(0, 135, 200, 30);
        nomineePanel.add(nomineeAddress);

        nomineeAddressArea = new JTextField();
        nomineeAddressArea.setFont(new Font("Raleway", Font.BOLD, 14));
        nomineeAddressArea.setBounds(180, 135, 300, 30);
        nomineePanel.add(nomineeAddressArea);

        // Occupation
        JLabel nomineeOccupation = new JLabel("Occupation :");
        nomineeOccupation.setFont(new Font("Raleway", Font.BOLD, 20));
        nomineeOccupation.setBounds(0, 180, 200, 30);
        nomineePanel.add(nomineeOccupation);

        nomineeOccupationField = new JComboBox<>(Utils.occupations);
        nomineeOccupationField.setFont(new Font("Raleway", Font.BOLD, 14));
        nomineeOccupationField.setBounds(180, 180, 300, 30);
        nomineePanel.add(nomineeOccupationField);

        JLabel initialDepositAmount = Utils.createRequiredLabel("Initial Deposit :");
        initialDepositAmount.setFont(new Font("Raleway", Font.BOLD, 20));
        initialDepositAmount.setBounds(jLabelX, jLabelY + 150, jLabelWidth + 150, jLabelHeight);
        add(initialDepositAmount);

        initialDeposit = new JTextField();
        initialDeposit.setFont(new Font("Raleway", Font.BOLD, 18));
        initialDeposit.setBounds(jTextFeildX,jTextFeildY+150,nameFieldWidth,nameFieldHeight);
        add(initialDeposit);

        JLabel branchName = Utils.createRequiredLabel("Select Branch :");
        branchName.setFont(new Font("Raleway", Font.BOLD, 20));
        branchName.setBounds(jLabelX, jLabelY + 200, jLabelWidth + 150, jLabelHeight);
        add(branchName);

        branches = new JComboBox<>(Utils.branchToCode.keySet().toArray(new String[0]));
        branches.setFont(new Font("Raleway", Font.BOLD, 14));
        branches.setBounds(jTextFeildX, jTextFeildY + 200, nameFieldWidth+150, nameFieldHeight);
        add(branches);

        JLabel userId = Utils.createRequiredLabel("UserID:");
        userId.setFont(new Font("Raleway", Font.BOLD, 20));
        userId.setBounds(jLabelX, jLabelY + 250, jLabelWidth + 150, jLabelHeight);
        add(userId);

        userID = new JTextField();
        userID.setFont(new Font("Raleway",Font.BOLD,16));
        userID.setEditable(false);
        userID.setBounds(jTextFeildX,jTextFeildY+250,nameFieldWidth,nameFieldHeight);
        add(userID);

        RoundedButton generateButton = new RoundedButton(
                "Generate",
                new Color(0, 123, 255), // normal color (blue)
                new Color(0, 90, 200)   // hover color (darker blue)
        );
        generateButton.setBounds(jTextFeildX + nameFieldWidth + 10, jTextFeildY + 250, 120, nameFieldHeight);
        add(generateButton);

        generateButton.addActionListener(e -> {
            String generatedId = Utils.generateCustomerId();
            userID.setText(generatedId);
            generateButton.setEnabled(false);
        });

        JLabel userPass = Utils.createRequiredLabel("Password :");
        userPass.setFont(new Font("Raleway", Font.BOLD, 20));
        userPass.setBounds(jLabelX, jLabelY + 300, jLabelWidth + 150, jLabelHeight);
        add(userPass);

        userPassword = new JTextField();
        userPassword.setFont(new Font("Raleway",Font.BOLD,16));
        userPassword.setBounds(jTextFeildX,jTextFeildY+300,nameFieldWidth,nameFieldHeight);
        add(userPassword);

        JLabel userConfirmPass = Utils.createRequiredLabel("Confirm Password :");
        userConfirmPass.setFont(new Font("Raleway", Font.BOLD, 20));
        userConfirmPass.setBounds(jLabelX+315, jLabelY + 300, jLabelWidth + 150, jLabelHeight);
        add(userConfirmPass);

        userConfirmPasssword = new JTextField();
        userConfirmPasssword.setFont(new Font("Raleway",Font.BOLD,16));
        userConfirmPasssword.setBounds(jTextFeildX+350,jTextFeildY+300,nameFieldWidth,nameFieldHeight);
        add(userConfirmPasssword);

        // ==== Radio Button Logic ====
        nomineeYes.addActionListener(e -> {
            nomineePanel.setVisible(true);
            int newY = nomineePanel.getY() + nomineePanel.getHeight() + 20; // Just below panel
            initialDepositAmount.setBounds(jLabelX, newY, jLabelWidth + 150, jLabelHeight);
            initialDeposit.setBounds(jTextFeildX, newY + 5, nameFieldWidth + 30, nameFieldHeight);
            branchName.setBounds(jLabelX, newY+50, jLabelWidth + 150, jLabelHeight);
            branches.setBounds(jTextFeildX, newY + 60, nameFieldWidth + 150, nameFieldHeight);
            userId.setBounds(jLabelX, newY+105, jLabelWidth + 150, jLabelHeight);
            userID.setBounds(jTextFeildX, newY + 115, nameFieldWidth , nameFieldHeight);
            generateButton.setBounds(jTextFeildX+150, newY + 115, nameFieldWidth , nameFieldHeight);
            userPass.setBounds(jLabelX, newY+155, jLabelWidth + 150, jLabelHeight);
            userConfirmPass.setBounds(jLabelX+315, newY+155, jLabelWidth + 150, jLabelHeight);
            userPassword.setBounds(jTextFeildX, newY + 165, nameFieldWidth , nameFieldHeight);
            userConfirmPasssword.setBounds(jTextFeildX+350, newY + 165, nameFieldWidth , nameFieldHeight);
            revalidate();
            repaint();
        });

        nomineeNo.addActionListener(e -> {
            nomineePanel.setVisible(false);
            initialDepositAmount.setBounds(jLabelX, jLabelY + 150, jLabelWidth + 150, jLabelHeight);
            initialDeposit.setBounds(jTextFeildX, jTextFeildY + 150, nameFieldWidth, nameFieldHeight);
            branchName.setBounds(jLabelX, jLabelY + 200, jLabelWidth + 150, jLabelHeight);
            branches.setBounds(jTextFeildX, jTextFeildY + 200, nameFieldWidth+150, nameFieldHeight);
            userId.setBounds(jLabelX, jLabelY + 250, jLabelWidth + 150, jLabelHeight);
            userID.setBounds(jTextFeildX,jTextFeildY+250,nameFieldWidth,nameFieldHeight);
            generateButton.setBounds(jTextFeildX + nameFieldWidth + 10, jTextFeildY + 250, 120, nameFieldHeight);
            userPass.setBounds(jLabelX, jLabelY + 300, jLabelWidth + 150, jLabelHeight);
            userConfirmPass.setBounds(jLabelX+315, jLabelY + 300, jLabelWidth + 150, jLabelHeight);
            userPassword.setBounds(jTextFeildX,jTextFeildY+300,nameFieldWidth,nameFieldHeight);
            userConfirmPasssword.setBounds(jTextFeildX+350,jTextFeildY+300,nameFieldWidth,nameFieldHeight);
            revalidate();
            repaint();
        });

    }

}
