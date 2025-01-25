public class PerssonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Joni";
        person1.address = "Sibitu";
        // person1.country = "Amrik"; tidak bisa di ubah kerena final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Ragat");

        Person person2 = new Person();
        person2.sayHello("Supri");
    }
}