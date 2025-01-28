public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Edi");
        employee.sayHello("Budi");
        
        employee = new Manager("Siska");
        employee.sayHello("Budi");
        
        employee = new VicePresident("Kaisa");
        employee.sayHello("Budi");

        sayHello(new Employee("Budi1"));
        sayHello(new Manager("Budi2"));
        sayHello(new VicePresident("Budi3"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Halo vp " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Halo manager " + manager.name);
        } else {
            System.out.println("Halo " + employee.name);
        }
    }
}
