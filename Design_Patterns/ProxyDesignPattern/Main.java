package Design_Patterns.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        EmployeeRepositoryProxy repo = new EmployeeRepositoryProxy();
        repo.create("ADMIN", emp);
        repo.delete("USER", emp);
    }
}
