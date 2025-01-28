package app;

import data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("ilham", "kepo");
        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.pass());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Ilham"));
        System.out.println(new LoginRequest("Ilham", "keren"));
    }
}
