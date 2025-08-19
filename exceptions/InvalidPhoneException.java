package exceptions;

public class InvalidPhoneException extends RuntimeException {
    public InvalidPhoneException(String phoneNumber) {
        super("Invalid phone number: "+phoneNumber);
    }
}
