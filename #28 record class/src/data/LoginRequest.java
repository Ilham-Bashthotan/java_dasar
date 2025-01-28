package data;

public record LoginRequest(String username, String pass) {
    public LoginRequest {
        System.out.println("membuat object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }
    public LoginRequest() {
        this("", "");
    }

    // ERROR karena field final
    // public void setUsername(String username) {
    //     this.username = username;
    // }
}
