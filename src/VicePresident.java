// Contoh child dari class Manager
class VicePresident extends Manager {
    void sayHello(String name) {
        System.out.println("Hellow " + name + " My name is VP " + this.name ); // 2. Ini adalah contoh method overriding
    }
}
