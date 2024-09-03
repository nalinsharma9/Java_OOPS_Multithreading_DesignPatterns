package OOPS.AbstractDemo;

public class Son extends Parent {
    public Son(int age){
        super(age);
    }

    @Override
    void normalMethod(){
        System.out.println("Normal Method in Son class");
    }
    @Override
    void career() {
        System.out.println("Son's career is Software Developer");
    }

    @Override
    void partner() {
        System.out.println("Son's partner is Jane");
    }
}
