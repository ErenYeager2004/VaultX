package models;

public class User {
    private String formNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String fatherFirstName;
    private String fatherMiddleName;
    private String fatherLastName;
    private String dob;
    private String gender;
    private String maritalStatus;
    private String nationality;
    private String email;
    private String phoneNo;
    private String address;
    private String state;
    private String city;
    private String pinCode;
    private String religion;
    private String category;
    private String income;
    private String occupation;
    private Boolean havePanCard;
    private String panCardNo;
    private String aadhaarCardNo;
    private Boolean isSenior;
    private Boolean isSpeciallyAbled;
    private String resident;
    private String alterNumber;


    // 👉 Generate Getters & Setters (IDE can do this)
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFatherFirstName() { return fatherFirstName; }
    public void setFatherFirstName(String fatherFirstName) { this.fatherFirstName = fatherFirstName; }
    public String getFatherMiddleName() { return fatherMiddleName; }
    public void setFatherMiddleName(String fatherMiddleName) { this.fatherMiddleName = fatherMiddleName; }
    public String getFatherLastName() { return fatherLastName; }
    public void setFatherLastName(String fatherLastName) { this.fatherLastName = fatherLastName; }
    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getMaritalStatus() { return maritalStatus; }
    public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus; }
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNo() { return phoneNo; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getPinCode() { return pinCode; }
    public void setPinCode(String pinCode) { this.pinCode = pinCode; }
    public String getFormNo() {
        return formNo;
    }
    public void setFormNo(String formNo) {
        this.formNo = formNo;
    }
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Boolean isHavePanCard() {
        return havePanCard;
    }

    public void setHavePanCard(Boolean havePanCard) {
        this.havePanCard = havePanCard;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public void setPanCardNo(String panCardNo) {
        this.panCardNo = panCardNo;
    }

    public String getAadhaarCardNo() {
        return aadhaarCardNo;
    }

    public void setAadhaarCardNo(String aadhaarCardNo) {
        this.aadhaarCardNo = aadhaarCardNo;
    }

    public Boolean isSenior() {
        return isSenior;
    }

    public void setSenior(Boolean senior) {
        isSenior = senior;
    }

    public Boolean isSpeciallyAbled() {
        return isSpeciallyAbled;
    }

    public void setSpeciallyAbled(Boolean speciallyAbled) {
        isSpeciallyAbled = speciallyAbled;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getAlterNumber() {
        return alterNumber;
    }

    public void setAlterNumber(String alterNumber) {
        this.alterNumber = alterNumber;
    }
}
