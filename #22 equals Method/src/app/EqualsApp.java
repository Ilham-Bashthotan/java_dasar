package app;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Gina";
        first = first + " " + "Suri";
        System.out.println(first);
        String second = "Gina Suri";
        System.out.println(second);
        System.out.println(first == second); // false
        String third = "Gina Suri";
        System.out.println(second == third); // true
        System.out.println(first.equals(second)); // true
    }
}
