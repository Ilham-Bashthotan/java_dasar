package ilham.application;

import ilham.data.Avanza;
import ilham.data.Car;

public class carApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
