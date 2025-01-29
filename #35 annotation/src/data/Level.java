package data;

import annotation.Fancy;

@Fancy(name = "Level", tags = {"Application", "java"})
public enum Level {
    STANDARD("STANDARD Level"),
    PREMIUM("PREMIUM Level"),
    VIP("VIP Level");

    private String description;
    Level(String desctiption) {
        this.description = desctiption;
    }
    public String getDescription() {
        return description;
    }
}
