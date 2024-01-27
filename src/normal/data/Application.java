package normal.data;

import normal.Product;

public class Application {
    public static void main(String[] args) {
        
        Product product = new Product("Durian", 30_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
