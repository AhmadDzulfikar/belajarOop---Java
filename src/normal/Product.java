// 8. Ini adalah contoh package, berguna untuk mengelompokkan
package normal;

// 9. Belajar access modifier:
public class Product { // a. Public (bisa diakses dimana saja seperti di package lain maupun di luar package)
    // protected String name; // b. protected hanya bisa di akses di package ini dan turunan classnya
    public String name;
    // protected int price;
    public int price;
    //private String kualitas; // c. private gabisa di access di luar file ini (contoh: file ProductApp)

    // Product(String name, int price) { //d. contoh no modifier, ini tidak bisa di akses di selain package ini 
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
