package data;

public enum Level {
    STANDART("Standart level"),
    PREMIUM("Premium level"),
    VIP("VIP level");

    private String description;
    Level(String description) {
        this.description = description;
    }
    public String getDersciption() {
        return description;
    }
}
