package Design_Patterns.ProxyDesignPattern;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void create(Employee emp) {
        System.out.println("Employee created");
    }

    @Override
    public void update(Employee emp) {
        System.out.println("Employee updated");
    }

    @Override
    public void delete(Employee emp) {
        System.out.println("Employee deleted");
    }
}
