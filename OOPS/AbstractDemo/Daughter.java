package OOPS.AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("Daughter's career is Doctor");
    }

    @Override
    void partner() {
        System.out.println("Daughter's partner is John");
    }
}
