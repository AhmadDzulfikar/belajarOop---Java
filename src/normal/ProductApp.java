package normal;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Semangka", 20000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
