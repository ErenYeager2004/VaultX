package views.signupForms;
import exceptions.InvalidEmailException;
import exceptions.InvalidPhoneException;
import exceptions.RequiredFieldException;
import models.User;
import utilities.Utils;
import views.SignUp;
import views.style.RoundedButton;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SignUpPage2 extends JPanel {
    private final JComboBox<String> religions;
    private final JComboBox<String> categories;
    private final JComboBox<String> incomes;
    private final JComboBox<String> occupations;
    private final JRadioButton yes, no;
    private final JRadioButton seniorYes, seniorNo;
    private final JTextField panField,adhaarField,additionalPhone;
    private final JRadioButton specialAbledYes, specialAbledNo;
    private final JComboBox<String> residentStatus;
    private final JButton prev,next;
    public SignUpPage2(SignUp frame1,User user) {

        int jLabelX = 100;
        int jLabelY = 170;
        int jLabelWidth = 150;
        int jLabelHeight = 30;
        int jTextFeildX = 280;
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

        JLabel formNumber = new JLabel("Application Form no :" + user.getFormNo());
        formNumber.setBounds(170, 20, 600, 40);
        formNumber.setFont(new Font("Raleway", Font.BOLD, 32));
        add(formNumber);

        JLabel page1 = new JLabel("Page 2");
        page1.setFont(new Font("Raleway", Font.BOLD, 22));
        page1.setBounds(330, 70, 600, 30);
        add(page1);

        JLabel personalDetail = new JLabel("Additional Details");
        personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetail.setBounds(280, 90, 600, 35);
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

        JLabel income = Utils.createRequiredLabel("Income :");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(jLabelX, jLabelY + 100, 150, 30);
        add(income);

        incomes = new JComboBox<>(Utils.incomes);
        incomes.setFont(new Font("Raleway", Font.BOLD, 15));
        incomes.setBackground(new Color(252,208,76));
        incomes.setBounds(jTextFeildX, jTextFeildY+100, nameFieldWidth, nameFieldHeight);
        incomes.setSelectedItem(Utils.incomes[0]);
        add(incomes);

        JLabel occupation = Utils.createRequiredLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(jLabelX, jLabelY + 150, 150, 30);
        add(occupation);

        occupations = new JComboBox<>(Utils.occupations);
        occupations.setFont(new Font("Raleway", Font.BOLD, 15));
        occupations.setBackground(new Color(252,208,76));
        occupations.setBounds(jTextFeildX, jTextFeildY+150, nameFieldWidth+185, nameFieldHeight);
        occupations.setSelectedItem(Utils.occupations[0]);
        add(occupations);

        JLabel panStatusLabel = Utils.createRequiredLabel("Do you have PAN Card?");
        panStatusLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panStatusLabel.setBounds(jLabelX, jLabelY + 200, 170, 50);
        add(panStatusLabel);

        yes = new JRadioButton("Yes");
        yes.setFont(new Font("Raleway", Font.BOLD, 14));
        yes.setBounds(jTextFeildX, jTextFeildY + 200, 90, 30);
        yes.setBackground(new Color(252,208,76));
        add(yes);

        no = new JRadioButton("No");
        no.setFont(new Font("Raleway", Font.BOLD, 14));
        no.setBounds(jTextFeildX + 100, jTextFeildY + 200, 90, 30);
        no.setBackground(new Color(252,208,76));
        add(no);

        Utils.groupButtons(yes, no);

        JLabel panLabel = new JLabel("PAN Card No :");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(jLabelX, jLabelY + 265, 160, 40);
        add(panLabel);

        panField = new JTextField();
        panField.setFont(new Font("Raleway", Font.BOLD, 15));
        panField.setBounds(jTextFeildX, jTextFeildY+270, nameFieldWidth+100, nameFieldHeight);
        panField.setBackground(new Color(238, 227, 193));
        add(panField);

        Utils.bindRadioWithTextField(yes,no,panField);

        JLabel adhaarNo = new JLabel("Aadhaar Card No:");
        adhaarNo.setFont(new Font("Raleway", Font.BOLD, 20));
        adhaarNo.setBounds(jLabelX, jLabelY + 315, 175, 40);
        add(adhaarNo);

        adhaarField = new JTextField();
        adhaarField.setFont(new Font("Raleway", Font.BOLD, 15));
        adhaarField.setBounds(jTextFeildX, jTextFeildY+320, nameFieldWidth+100, nameFieldHeight);
        adhaarField.setBackground(new Color(238, 227, 193));
        add(adhaarField);

        JLabel seniorCitizenStatus = new JLabel("Senior Citizen :");
        seniorCitizenStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizenStatus.setBounds(jLabelX, jLabelY + 365, 175, 40);
        add(seniorCitizenStatus);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorYes.setBounds(jTextFeildX, jTextFeildY + 370, 90, 30);
        seniorYes.setBackground(new Color(252,208,76));
        add(seniorYes);

        seniorNo = new JRadioButton("No");
        seniorNo.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorNo.setBounds(jTextFeildX + 100, jTextFeildY + 370, 90, 30);
        seniorNo.setBackground(new Color(252,208,76));
        add(seniorNo);

        Utils.groupButtons(seniorYes,seniorNo);

        JLabel speciallyAbledStatus = new JLabel("Specially Abled :");
        speciallyAbledStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        speciallyAbledStatus.setBounds(jLabelX, jLabelY + 415, 175, 40);
        add(speciallyAbledStatus);

        specialAbledYes = new JRadioButton("Yes");
        specialAbledYes.setFont(new Font("Raleway", Font.BOLD, 14));
        specialAbledYes.setBounds(jTextFeildX, jTextFeildY + 420, 90, 30);
        specialAbledYes.setBackground(new Color(252,208,76));
        add(specialAbledYes);

        specialAbledNo = new JRadioButton("No");
        specialAbledNo.setFont(new Font("Raleway", Font.BOLD, 14));
        specialAbledNo.setBounds(jTextFeildX + 100, jTextFeildY + 420, 90, 30);
        specialAbledNo.setBackground(new Color(252,208,76));
        add(specialAbledNo);

        Utils.groupButtons(specialAbledYes,specialAbledNo);

        JLabel residentalStatus = new JLabel("Residential :");
        residentalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        residentalStatus.setBounds(jLabelX, jLabelY + 465, 175, 40);
        add(residentalStatus);

        residentStatus = new JComboBox<>(Utils.residentStatus);
        residentStatus.setFont(new Font("Raleway", Font.BOLD, 15));
        residentStatus.setBackground(new Color(252,208,76));
        residentStatus.setBounds(jTextFeildX, jTextFeildY+470, nameFieldWidth+185, nameFieldHeight);
        residentStatus.setSelectedItem(Utils.residentStatus[0]);
        add(residentStatus);

        JLabel additionalPhoneNo = new JLabel("Alternate Number:");
        additionalPhoneNo.setFont(new Font("Raleway", Font.BOLD, 20));
        additionalPhoneNo.setBounds(jLabelX, jLabelY + 510, 175, 40);
        add(additionalPhoneNo);

        additionalPhone = new JTextField();
        additionalPhone.setFont(new Font("Raleway", Font.BOLD, 15));
        additionalPhone.setBounds(jTextFeildX, jTextFeildY+520, nameFieldWidth+100, nameFieldHeight);
        additionalPhone.setBackground(new Color(238, 227, 193));
        add(additionalPhone);

        prev = new RoundedButton(
                "Previous",
                new Color(9, 91, 215),
                new Color(56, 163, 229)
        );
        prev.setBounds(220, 770, 120, 40);
        add(prev);

        next = new RoundedButton(
                "Next",
                new Color(0, 153, 102),
                new Color(0, 204, 153)
        );
        next.setBounds(420, 770, 120, 40);
        add(next);

        next.addActionListener(e -> {
            try {
                frame1.setUser(user);
                frame1.showPage("Page3");
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

    public String getReligion(){
        return Objects.requireNonNull(religions.getSelectedItem()).toString();
    }
    public String getCategory(){
        return Objects.requireNonNull(categories.getSelectedItem()).toString();
    }
    public String getIncome(){
        return Objects.requireNonNull(incomes.getSelectedItem()).toString();
    }
    public String getOccupation(){
        return Objects.requireNonNull(occupations.getSelectedItem()).toString();
    }
    public Boolean isPanCard(){
        if(yes.isSelected()) return true;
        else if(no.isSelected()) return false;
        else return null;
    }
    public String getPanCardNo(){
        return panField.getText().trim();
    }
    public String getAadhaarCardNo(){
        return adhaarField.getText().trim();
    }
    public Boolean isSeniorCitizen(){
        if(seniorYes.isSelected()) return true;
        else if(seniorNo.isSelected()) return false;
        else return null;
    }
    public boolean isSpeciallyAbled(){
        if(specialAbledYes.isSelected()) return true;
        else if(specialAbledNo.isSelected()) return false;
        else return false;
    }
    public String getResident(){
        return Objects.requireNonNull(residentStatus.getSelectedItem()).toString();
    }
    public String alterNateNumber(){
        return additionalPhone.getText().trim();
    }

    public User toUser(){
        if(isPanCard() == null) throw new RequiredFieldException("Do you have PAN card?");
        if(isPanCard()){
            if(panField.getText() == null) throw new RequiredFieldException("PAN card");
        }
        if(adhaarField == null) throw new RequiredFieldException("Aadhaar No");
        if(isSeniorCitizen() == null) throw new RequiredFieldException("Senior Citizen");

        User user = new User();
        user.setReligion(getReligion());
        user.setCategory(getCategory());
        user.setIncome(getIncome());
        user.setHavePanCard(isPanCard());
        user.setPanCardNo(getPanCardNo());
        user.setAadhaarCardNo(getAadhaarCardNo());
        user.setSenior(isSeniorCitizen());
        user.setSpeciallyAbled(isSpeciallyAbled());
        user.setResident(getResident());
        user.setResident(getResident());

        return user;
    }
}
