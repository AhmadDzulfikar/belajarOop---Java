public class ManagerApp {
    public static void main(String[] args) {
        var Manager = new Manager("Ahmad", "Intek");
        Manager.sayHello("Asep");

        var vp = new VicePresident("Mahfud MD", "Intek");
        vp.sayHello("Ganjar Pranowo");
    }
}
