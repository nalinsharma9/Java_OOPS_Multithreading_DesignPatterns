package Design_Patterns.ProxyDesignPattern;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void create(String role, Employee emp) {
        System.out.println("Employee created");
    }

    @Override
    public void update(String role, Employee emp) {
        System.out.println("Employee updated");
    }

    @Override
    public void delete(String role, Employee emp) {
        System.out.println("Employee deleted");
    }
}
