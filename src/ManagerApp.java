public class ManagerApp {
    public static void main(String[] args) {
        var Manager = new Manager();
        Manager.name = "Ahmad";
        Manager.sayHello("Asep");

        var vp = new VicePresident();
        vp.name = "Mahfud MD";
        vp.sayHello("Ganjar Pranowo");
    }
}
