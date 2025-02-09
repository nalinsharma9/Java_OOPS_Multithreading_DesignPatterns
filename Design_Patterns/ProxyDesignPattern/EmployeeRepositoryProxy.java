package Design_Patterns.ProxyDesignPattern;

public class EmployeeRepositoryProxy implements EmployeeRepository {
    EmployeeRepositoryImpl empRepo;

    public EmployeeRepositoryProxy() {
        this.empRepo = new EmployeeRepositoryImpl();
    }

    public void create(String role, Employee emp) {
        if (role.equals("ADMIN")) {
            empRepo.create(role, emp);
        } else {
            System.out.println("Access denied");
        }
    }


    public void update(String role, Employee emp) {
        if (role.equals("ADMIN") || (role.equals("USER"))) {
            empRepo.update(role, emp);
        } else {
            System.out.println("Access Denied");
        }
    }


    public void delete(String role, Employee emp) {
        if (role.equals("ADMIN")) {
            empRepo.delete(role, emp);
        } else {
            System.out.println("Access denied");
        }
    }
}
