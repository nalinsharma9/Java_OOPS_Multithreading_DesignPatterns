package Design_Patterns.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Latte();
        System.out.println(coffee1.getCost());

        Coffee coffee2 = new ExtraSugar(new Latte());
        System.out.println(coffee2.getCost());

        Coffee coffee3 = new ExtraMilk(new ExtraSugar(new Latte()));
        System.out.println(coffee3.getCost());

    }
}
