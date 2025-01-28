package app;

import data.Costomer;
import data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Costomer costomer = new Costomer();
        costomer.setName("Ilham");
        costomer.setLevel(Level.PREMIUM);

        System.out.println(costomer.getName());
        System.out.println(costomer.getLevel());
        System.out.println(costomer.getLevel().getDersciption());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("VIP");
        System.out.println(level);
        // Level level2 = Level.valueOf("Salah"); // error
        Level[] levels = Level.values();

        System.out.println("Print Level:");
        for (var val : levels) {
            System.out.println(val);
        }
    }
}
