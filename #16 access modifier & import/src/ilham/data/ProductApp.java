package ilham.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Vivobook", 15000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
