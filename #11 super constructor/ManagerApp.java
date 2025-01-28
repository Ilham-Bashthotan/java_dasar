public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Edi");
        manager.sayHello("Budi");
        
        VicePresident vp = new VicePresident("Kode");
        vp.sayHello("Budi");
    }
}
