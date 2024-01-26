public class contohPerson {
    public static void main(String[] args) {

        // Contoh Object Java
        var person1 = new Person("Delf", "Condet"); // Contoh penggunaan constructor

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.religion);

        person1.sayHello("Samiranadifa Azzahra");

        System.out.println();
        
        Person person2 = new Person("Difa", "Cibubur");
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.religion);
        person2.sayHello("Ahmad Dzulfikar As Shavy");
        // Person person3;
        // person3 = new Person();

        System.out.println();

        Person person3 = new Person("Umay");
        System.out.println(person3.name);

        System.out.println();
        
        Person person4 = new Person();
        person4.name = "Rahima";
        System.out.println(person4.name);

    }
}
