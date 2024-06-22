package OOPS.Static;

public class Main {
    public static void main(String[] args) {
        Human nalin = new Human(26, 10000, "Nalin", false);
        Human Rahul = new Human(34, 40000, "Rahul", true);

        System.out.println(nalin.name);
        System.out.println(Rahul.name);
        System.out.println(Human.population);
    }
}
