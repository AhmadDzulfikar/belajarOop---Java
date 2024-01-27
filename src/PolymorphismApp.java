public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi Utomo");

        // 5. (Polymorphism) Ini adalah contoh dari polymorphism, harusnya tipe datanya adalah Manager tapi kita menggunakan tipe data Employee
        employee = new Manager("Oura");
        employee.sayHello("Soekarno");

        employee = new VicePresident("Jusuf Kalla");
        employee.sayHello("Soeharto");

        sayHello(new Employee("Difa"));
        sayHello(new Employee("Dzulfkar"));
        sayHello(new Employee("Ahjul"));

    }

    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;     // 6. Type check data type, mengubah tipe data dari employee ke vicePresident
            System.out.println("Hello VP " + vicePresident.name + ", ini adalah contoh kegunaan polymorphism");
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name + ", ini adalah contoh kegunaan polymorphism");
        } else {
            System.out.println("Hello Employee " + employee.name + ", ini adalah contoh kegunaan polymorphism");
        }

    }
}
