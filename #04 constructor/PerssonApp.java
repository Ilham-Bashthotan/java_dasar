public class PerssonApp {
    public static void main(String[] args) {
        var person1 = new Person("Joni", "Sibitu");
 
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Ragat");

        Person person2 = new Person("Fadel", "Jowo");
        person2.sayHello("Supri"); 
    }
}