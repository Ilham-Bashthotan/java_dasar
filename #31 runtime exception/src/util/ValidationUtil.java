package util;

import data.LoginRequest;
import error.BlankException;

public class ValidationUtil {
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.pass() == null) {
            throw new NullPointerException("pass is null");
        } else if (loginRequest.pass().isBlank()) {
            throw new BlankException("pass is blank");
        }
    }
}
