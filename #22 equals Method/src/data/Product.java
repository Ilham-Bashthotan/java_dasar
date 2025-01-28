package data;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // public boolean equals(Object o) {
    //     if (o == this) {
    //         return true;
    //     }
    //     if (!(o instanceof Product)) {
    //         return false;
    //     }
    //     // o instanceof Product
    //     Product product = (Product) o;
    //     if (this.price != product.price) {
    //         return false;
    //     }
    //     if (this.name != null) {
    //         return this.equals(product.name);
    //     } else {
    //         return product.name == null;
    //     }
    // }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}
