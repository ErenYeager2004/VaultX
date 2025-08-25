package utilities;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import exceptions.*;
import models.User;

public class Utils {
    public static String bankName = "VaultX";
    private static final Random random = new Random();
    public static String getRandomNumber(){
       long first4 = (random.nextLong() % 9000L) + 1000L;
       return " "+Math.abs(first4);
    }

    public static void groupButtons(JRadioButton... buttons) {
        ButtonGroup buttonGroup = new ButtonGroup();
        for (JRadioButton btn : buttons) {
            buttonGroup.add(btn);
        }
    }

    public static String[] countries = {
            "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina",
            "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados",
            "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana",
            "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon",
            "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo",
            "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica",
            "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia",
            "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana",
            "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary",
            "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan",
            "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon",
            "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi",
            "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico",
            "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar",
            "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria",
            "North Korea", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama",
            "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania",
            "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines",
            "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles",
            "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa",
            "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland",
            "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga",
            "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine",
            "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu",
            "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
    };

    public static boolean isValidEmail(String email){
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (email == null) return false;
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPhoneNumber(String number){
        String PHONE_PATTERN = "^[6-9][0-9]{9}$";
        if (number == null) return false;
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static final String[] STATES = {
            "Andaman and Nicobar", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",
            "Chandigarh", "Chhattisgarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi",
            "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand",
            "Karnataka", "Kerala", "Ladakh", "Lakshadweep", "Madhya Pradesh", "Maharashtra",
            "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Puducherry", "Punjab",
            "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh",
            "Uttarakhand", "West Bengal"
    };

    public static final Map<String, String[]> CITIES_MAP = new HashMap<>();

    static {
        CITIES_MAP.put("Andhra Pradesh", new String[]{"Amaravati","Chittoor","Guntur","Kakinada","Kurnool","Nellore","Rajahmundry","Tirupati","Vijayawada","Visakhapatnam"});
        CITIES_MAP.put("Arunachal Pradesh", new String[]{"Aalo","Bomdila","Itanagar","Pasighat","Roing","Seppa","Tawang","Tezu","Ziro"});
        CITIES_MAP.put("Assam", new String[]{"Bongaigaon","Dibrugarh","Guwahati","Jorhat","Nagaon","Silchar","Tezpur","Tinsukia"});
        CITIES_MAP.put("Bihar", new String[]{"Agra","Bhagalpur","Gaya","Muzaffarpur","Patna","Purnia","Darbhanga","Munger","Begusarai","Buxar"});
        CITIES_MAP.put("Chhattisgarh", new String[]{"Ambikapur","Bilaspur","Durg","Jagdalpur","Korba","Raigarh","Rajnandgaon","Raipur"});
        CITIES_MAP.put("Goa", new String[]{"Bicholim","Cortalim","Margao","Panaji","Quepem","Sanguem","Vasco da Gama"});
        CITIES_MAP.put("Gujarat", new String[]{"Ahmedabad","Anand","Bhavnagar","Jamnagar","Junagadh","Nadiad","Rajkot","Surat","Vadodara"});
        CITIES_MAP.put("Haryana", new String[]{"Ambala","Chandigarh","Faridabad","Gurugram","Hisar","Karnal","Panipat","Rohtak","Sonipat","Yamunanagar"});
        CITIES_MAP.put("Himachal Pradesh", new String[]{"Bilaspur","Dharamsala","Hamirpur","Kangra","Mandi","Shimla","Solan"});
        CITIES_MAP.put("Jharkhand", new String[]{"Bokaro","Chaibasa","Dhanbad","Deoghar","Giridih","Hazaribagh","Jamtara","Jamshedpur","Ranchi","Dumka"});
        CITIES_MAP.put("Karnataka", new String[]{"Ballari","Bengaluru","Belagavi","Davangere","Hubli","Mangaluru","Mysuru","Shimoga","Tumakuru","Udupi"});
        CITIES_MAP.put("Kerala", new String[]{"Alappuzha","Kannur","Kochi","Kottayam","Kozhikode","Malappuram","Palakkad","Pathanamthitta","Thiruvananthapuram","Thrissur"});
        CITIES_MAP.put("Madhya Pradesh", new String[]{"Bhopal","Chhindwara","Gwalior","Indore","Jabalpur","Khandwa","Rewa","Sagar","Satna","Ujjain"});
        CITIES_MAP.put("Maharashtra", new String[]{"Amravati","Aurangabad","Kolhapur","Mumbai","Nagpur","Nanded","Nashik","Pune","Solapur","Thane"});
        CITIES_MAP.put("Manipur", new String[]{"Bishnupur","Churachandpur","Imphal","Jiribam","Senapati","Tamenglong","Thoubal","Ukhrul"});
        CITIES_MAP.put("Meghalaya", new String[]{"Baghmara","Jowai","Mairang","Shillong","Tura","Williamnagar"});
        CITIES_MAP.put("Mizoram", new String[]{"Aizawl","Hnahthial","Khawzawl","Kolasib","Lawngtlai","Lunglei","Mamit","Saitual","Serchhip"});
        CITIES_MAP.put("Nagaland", new String[]{"Kiphire","Kohima","Longleng","Mokokchung","Mon","Phek","Tuensang","Wokha","Zunheboto"});
        CITIES_MAP.put("Odisha", new String[]{"Balasore","Baripada","Bargarh","Bhubaneswar","Cuttack","Jeypore","Phulbani","Rourkela","Sambalpur"});
        CITIES_MAP.put("Punjab", new String[]{"Amritsar","Bathinda","Chandigarh","Fatehgarh Sahib","Hoshiarpur","Jalandhar","Ludhiana","Mohali","Pathankot"});
        CITIES_MAP.put("Rajasthan", new String[]{"Ajmer","Alwar","Bikaner","Bhilwara","Churu","Jaipur","Jodhpur","Kota","Sikar","Udaipur"});
        CITIES_MAP.put("Sikkim", new String[]{"Gangtok","Gyalshing","Mangan","Namchi","Rabdentse"});
        CITIES_MAP.put("Tamil Nadu", new String[]{"Chennai","Coimbatore","Dindigul","Erode","Madurai","Salem","Tiruchirappalli","Tirunelveli","Tiruvannamalai","Vellore"});
        CITIES_MAP.put("Telangana", new String[]{"Adilabad","Hyderabad","Karimnagar","Mahabubnagar","Nizamabad","Ramagundam","Sircilla","Warangal"});
        CITIES_MAP.put("Tripura", new String[]{"Agartala","Amarpur","Belonia","Dharmanagar","Jirania","Kailashahar","Kanchanpur","Kumarghat","Ranirbazar","Udaipur"});
        CITIES_MAP.put("Uttar Pradesh", new String[]{"Agra","Aligarh","Allahabad","Bareilly","Ghaziabad","Kanpur","Lucknow","Meerut","Noida","Varanasi"});
        CITIES_MAP.put("Uttarakhand", new String[]{"Almora","Dehradun","Haldwani","Haridwar","Nainital","Pauri","Ramnagar","Rishikesh","Roorkee"});
        CITIES_MAP.put("West Bengal", new String[]{"Asansol","Bardhaman","Durgapur","Howrah","Jalpaiguri","Kalyani","Kolkata","Malda","Siliguri"});
        CITIES_MAP.put("Andaman and Nicobar", new String[]{"Port Blair"});
        CITIES_MAP.put("Chandigarh", new String[]{"Chandigarh"});
        CITIES_MAP.put("Dadra and Nagar Haveli", new String[]{"Silvassa"});
        CITIES_MAP.put("Daman and Diu", new String[]{"Daman","Diu"});
        CITIES_MAP.put("Delhi", new String[]{"Dwarka","New Delhi","Rohini"});
        CITIES_MAP.put("Jammu and Kashmir", new String[]{"Jammu","Srinagar"});
        CITIES_MAP.put("Ladakh", new String[]{"Kargil","Leh"});
        CITIES_MAP.put("Lakshadweep", new String[]{"Kavaratti"});
        CITIES_MAP.put("Puducherry", new String[]{"Karaikal","Puducherry"});

        // Sort cities alphabetically for each state
        for(String state : CITIES_MAP.keySet()){
            String[] cities = CITIES_MAP.get(state);
            Arrays.sort(cities);
            CITIES_MAP.put(state, cities);
        }

        // Optional: Sort STATES array alphabetically too
        Arrays.sort(STATES);
    }

    public static void linkStateCity(JComboBox<String> stateComboBox, JComboBox<String> cityComboBox) {
        stateComboBox.addActionListener(e -> {
            String selectedState = (String) stateComboBox.getSelectedItem();
            cityComboBox.removeAllItems();
            if (selectedState != null && CITIES_MAP.containsKey(selectedState)) {
                for (String city : CITIES_MAP.get(selectedState)) {
                    cityComboBox.addItem(city);
                }
            }
        });
    }

    public static String formatToDDMMYYYY(Date date) {
        if (date == null) return null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (email == null || !isValidEmail(email)) {
            throw new InvalidEmailException(email);
        }
    }
    public static void validatePhone(String phone) throws InvalidPhoneException {
        if (phone == null || !isValidPhoneNumber(phone)) {
            throw new InvalidPhoneException(phone);
        }
    }
    public static void validateRequired(String value, String fieldName) throws RequiredFieldException {
        if (value == null || value.trim().isEmpty()) {
            throw new RequiredFieldException(fieldName);
        }
    }

    public static JLabel createRequiredLabel(String text) {
        return new JLabel("<html>" + text + " <font color='red'>*</font></html>");
    }

    public static String[] religion = {
            "Hindu",
            "Muslim",
            "Sikh",
            "Cristian",
            "Other"
    };

    public static String[] category = {
            "General",
            "OBC",
            "SC",
            "ST",
            "Other"
    };

    public static String[] incomes = {
            "Null",
            "< 1.5 lakh",
            "< 3 lakh",
            "5 lakh",
            "Upto 10 lakh",
            "Above 10 lakh"
    };

    public static String[] occupations = {
            "Salaried (Private Sector)",
            "Salaried (Government)",
            "Self-Employed / Business",
            "Student",
            "Retired",
            "House Wife",
            "Unemployed",
            "Farmer / Agriculture",
            "Professional (Doctor, Lawyer, Engineer, etc.)"
    };

    public static String[] relationship = {
            "Father",
            "Mother",
            "Brother",
            "Sister",
            "Others"
    };
    public static void bindRadioWithTextField(JRadioButton yesButton, JRadioButton noButton, JTextField textField) {
        textField.setEnabled(false); // default disabled

        yesButton.addActionListener(e -> {
            textField.setEnabled(true);
            textField.setText("");
        });

        noButton.addActionListener(e -> {
            textField.setEnabled(false);
            textField.setText(""); // cleared for DB (treated as NULL)
        });
    }
    public static String[] residentStatus = {
            "Owned",
            "Rented",
            "Paying Guest",
            "Company Provided",
            "Hostel/Other"
    };

    public static void setFieldVisibility(JRadioButton Yes,JRadioButton No,JPanel panel){
        Yes.addActionListener(e->panel.setVisible(true));
        No.addActionListener(e->panel.setVisible(false));
    }
    public static String generateATMNumber(){
        String bin = "411111";
        StringBuilder cardNo = new StringBuilder(bin);
        for(int i=0;i<9;i++){
            cardNo.append(random.nextInt(10));
        }
        int checkDigit = getCheckDigit(cardNo.toString());
        cardNo.append(checkDigit);

        return formatCardNumber(cardNo.toString());
    }
    private static int getCheckDigit(String number){
        int sum = 0;
        boolean alternate = true;
        for(int i = number.length()-1;i >=0; i--){
            int n = Integer.parseInt(number.substring(i,i+1));
            if(alternate){
                n*=2;
                if(n > 9){
                    n = (n%10)+1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (10 - (sum % 10)) % 10;
    }
    public static String generateCVV(){
        int cvv = 100 + random.nextInt(900);
        return Integer.toString(cvv);
    }
    public static String generateATMExpiryDate(){
        LocalDate expiry = LocalDate.now().plusYears(5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
        return expiry.format(formatter);
    }
    private static String formatCardNumber(String number) {
        return number.replaceAll("(.{4})(?!$)", "$1 ");
    }

    public static void initialDepositChecker(long amount) throws InitialDepositException{
        if(amount < 2000){
            throw new InitialDepositException("Deposit amount should be at least 2000");
        }
        if(amount > 100000){
            throw new InitialDepositException("Deposit amount should not exceed 1 lakh");
        }
    }

    public static final Map<String, String> branchToCode = new HashMap<>();

    static {
        branchToCode.put("VaultX Bally Main", "4001");
        branchToCode.put("VaultX Bally Bazaar", "4002");
        branchToCode.put("VaultX Belur Math Branch", "4003");
        branchToCode.put("VaultX Howrah Station Branch", "4004");
        branchToCode.put("VaultX Howrah Shibpur", "4005");
        branchToCode.put("VaultX Liluah Branch", "4006");
        branchToCode.put("VaultX Dum Dum Airport Branch", "4007");
        branchToCode.put("VaultX Salt Lake Sector V", "4008");
        branchToCode.put("VaultX Park Street Main", "4009");
        branchToCode.put("VaultX Esplanade Metro Branch", "4010");
        branchToCode.put("VaultX Shibpur Science College", "4011");
        branchToCode.put("VaultX Santragachi Railway Branch", "4012");
    }

    public static String generateCustomerId() {
        int randomNum = ThreadLocalRandom.current().nextInt(100000, 999999);
        return "CIF" + randomNum;
    }

    public static String generateAccountNumber(String branchCode) {
        long randomNum = ThreadLocalRandom.current().nextLong(10000000L, 99999999L);
        return branchCode + randomNum;
    }

    public static String generateIFSC(String branchCode) {
        int code = Integer.parseInt(branchCode);
        return "VLTX0" + String.format("%06d", code);
    }

    public static void passwordChecker(String password) throws InvalidPasswordException {
        if (password == null || password.isEmpty()) {
            throw new InvalidPasswordException("Password cannot be empty");
        }

        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password must contain at least one uppercase letter");
        }

        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password must contain at least one lowercase letter");
        }

        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least one digit");
        }

        if (!password.matches(".*[!@#$%^&*()_+\\-=[\\]{}|;:',.<>/?].*")) {
            throw new InvalidPasswordException("Password must contain at least one special character");
        }
    }

    public static void isPasswordMatch(String password,String confirmPassword) throws PasswordNotMatchException{
        if(!password.equals(confirmPassword)){
            throw new PasswordNotMatchException("Password and Confirm password didn't match");
        }
    }

}
