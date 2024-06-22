package OOPS.Static;

public class Human {
    //properties not related to objects are declared as static variables
    //a static member(variable or methods) can be accessed without instance of the class
    static long population = 0;

    int age;
    int salary;
    String name;
    boolean married;

    public Human(int age, int salary, String name, boolean married){
        Human.population++;
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;

    }

}
