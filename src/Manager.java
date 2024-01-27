// 1. Contoh dari inheritance

// Contoh dari parent
class Manager extends Employee{
    String company;

    Manager(String name) {
        super(name);
    }

    // 4. Super constractor (Kalau di superclassnya(parent) buat constractor, maka di childnya harus dipanggil juga ) 
    // Manager(String name){
    //     this.name = name;
    // }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }
    
    void sayHello(String name) {
        System.out.println("Hello " + name + " My name is Manager " + this.name + " from " + this.company);
    };
}


