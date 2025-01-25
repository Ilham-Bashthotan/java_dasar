class Person {
    String name;
    String address;
    final String country = "Indonesia"; 

    Person(String name, String address) {
        name = name; // tidak berubah
        address = address; // tidak berubah
    }
    void sayHello(String name) {
        System.out.println("jalo " + name + " me nem iz " + this.name);
    }
}