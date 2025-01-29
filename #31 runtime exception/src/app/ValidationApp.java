package app;

import data.LoginRequest;
import util.ValidationUtil;

public interface ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        // bisa tanpa try catch
        // tetap error 
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("berhasil");
    }
}
