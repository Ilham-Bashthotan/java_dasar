package data;

import annotation.NotBlank;

public class CreateUserRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String pass;

    @NotBlank
    private String name;
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
