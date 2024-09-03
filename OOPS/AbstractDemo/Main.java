package OOPS.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.partner();

        Parent daughter = new Daughter(28);
        daughter.career();
        daughter.partner();

        Parent.staticMethod();
        son.normalMethod();
        daughter.normalMethod();
    }
}
