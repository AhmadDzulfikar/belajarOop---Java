class Person {
    // Conthoh field (ada 3 field artinya) ntr masuk dan di print di page cpntohPerson
    String name;
    String address;
    final String religion = "islam";

    // Membuat constructor
    // Ada 3 constructor yang sama tetapi parameternya berbeda disebut constructor overloading
Person (String name, String address) {
    this.name = name;
    this.address = address;
}

Person (String name) {
    this(name, null); // Gunakan this() untuk memanggil constructor lain 
}

Person () {
}

    // Contoh method 
    void sayHello(String name) {
        System.out.println("Hello " + name + " My name is " + this.name);
    }
}
