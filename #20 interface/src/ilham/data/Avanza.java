package ilham.data;

public class Avanza implements Car {
    public void drive() {
        System.out.println("Avanza drive");
    }
    public int getTier() {
        return 4;
    }
    public String getBrand() {
        return "Toyota";
    }
    public boolean isMaintenence() {
        return false;
    }
}
