package data;

import annotation.Fancy;

@Fancy(name = "Car", tags = {"Application", "java"})
public interface Car {
    void drive();
    int getTier();
    default boolean isBig() {return false;};
}
