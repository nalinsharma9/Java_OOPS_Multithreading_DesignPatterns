package Design_Patterns.ProxyDesignPattern;

public interface EmployeeRepository {
    public void create(String role, Employee emp);

    public void update(String role, Employee emp);

    public void delete(String role, Employee emp);
}
