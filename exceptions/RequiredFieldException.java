package exceptions;

public class RequiredFieldException extends RuntimeException {
    public RequiredFieldException(String fieldName) {
        super(fieldName+" is required");
    }
}
