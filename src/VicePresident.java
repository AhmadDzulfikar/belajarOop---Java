// Contoh child dari class Manager
class VicePresident extends Manager {

    VicePresident(String name){ 
        super(name);
    }

    VicePresident(String name, String company) {
        super(name, company);
    }

    void sayHello(String name) {
        System.out.println("Hellow " + name + " My name is VP " + this.name ); // 2. Ini adalah contoh method overriding
    }
}
