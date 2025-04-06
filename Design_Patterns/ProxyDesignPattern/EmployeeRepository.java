package Design_Patterns.ProxyDesignPattern;

public interface EmployeeRepository {
    public void create(Employee emp);

    public void update(Employee emp);

    public void delete(Employee emp);
}
