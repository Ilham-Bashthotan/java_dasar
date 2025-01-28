package app;

import data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product("Vivobook", 15000000);
        Product product2 = new Product("Vivobook", 15000000);
        System.out.println(product1.equals(product2));
    }
}
