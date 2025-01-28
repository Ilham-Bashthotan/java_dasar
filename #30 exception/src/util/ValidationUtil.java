package util;

import data.LoginRequest;
import error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.pass() == null) {
            throw new NullPointerException("pass is null");
        } else if (loginRequest.pass().isBlank()) {
            throw new ValidationException("pass is blank");
        }
    }
}
