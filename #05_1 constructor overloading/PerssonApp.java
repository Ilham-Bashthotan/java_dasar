public class PerssonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Joni", "Sibitu");
        Person person2 = new Person("Fadel");
        Person person3 = new Person();

        System.out.println(person1.name + " " + person1.address + " " + person1.country);
        System.out.println(person2.name + " " + person2.address + " " + person2.country);
        System.out.println(person3.name + " " + person3.address + " " + person3.country);
    }
}