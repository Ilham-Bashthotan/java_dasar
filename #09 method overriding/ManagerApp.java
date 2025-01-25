public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Edi";
        manager.sayHello("Gese");
        
        VicePresident vp = new VicePresident();
        vp.name = "Kode";
        vp.sayHello("Della");
    }
}
