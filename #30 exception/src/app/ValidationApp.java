package app;

import data.LoginRequest;
import error.ValidationException;
import util.ValidationUtil;

public interface ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "Lupa");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("data error dengan pesan: " + e.getMessage());
        } finally {
            System.out.println("selalu di exc");
        }
    }
}
