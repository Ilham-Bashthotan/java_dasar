package app;

import data.CreateUserRequest;
import util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Ilham");
        request.setPass("Ilham");
        // request.setName("Ilham");
        System.out.println("Behasil");
        ValidationUtil.validationReflection(request);
    }
}
