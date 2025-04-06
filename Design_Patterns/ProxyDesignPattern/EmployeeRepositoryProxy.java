package Design_Patterns.ProxyDesignPattern;

public class EmployeeRepositoryProxy implements EmployeeRepository {
    EmployeeRepositoryImpl empRepo;

    public EmployeeRepositoryProxy() {
        this.empRepo = new EmployeeRepositoryImpl();
    }

    public void create(String role, Employee emp) {
        if (role.equals("ADMIN")) {
            empRepo.create(emp);
        } else {
            System.out.println("Access denied");
        }
    }


    public void update(String role, Employee emp) {
        if (role.equals("ADMIN") || (role.equals("USER"))) {
            empRepo.update(emp);
        } else {
            System.out.println("Access Denied");
        }
    }


    public void delete(String role, Employee emp) {
        if (role.equals("ADMIN")) {
            empRepo.delete(emp);
        } else {
            System.out.println("Access denied");
        }
    }

    @Override
    public void create(Employee emp) {
        throw new UnsupportedOperationException("Direct access not allowed. Use create(String role, Employee emp) instead.");
    }

    @Override
    public void update(Employee emp) {
        throw new UnsupportedOperationException("Direct access not allowed. Use update(String role, Employee emp) instead.");
    }

    @Override
    public void delete(Employee emp) {
        throw new UnsupportedOperationException("Direct access not allowed. Use delete(String role, Employee emp) instead.");
    }

}
