class Person {
    String name;
    String address;
    final String country = "Indonesia"; 

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    Person(String name) {
        this.name = name;
    }
    Person() {
    }

    void sayHello(String name) {
        System.out.println("jalo " + name + " me nem iz " + this.name);
    }
}

