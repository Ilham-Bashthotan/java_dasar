package app;

import data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        HelloWorld indonesia = new HelloWorld() {
            public void sayHello() {
                System.out.println("halo");
            }
            public void sayHello(String name) {
                System.out.println("halo " + name);
            }
        };
        english.sayHello();
        english.sayHello("Ilham");
        indonesia.sayHello();
        indonesia.sayHello("Ilham");
    }
}
