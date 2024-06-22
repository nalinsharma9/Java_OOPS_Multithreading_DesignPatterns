package OOPS.Introduction;

public class FinalExample {
    public static void main(String[] args) {
        // Error: cannot reassign a value to final variable.

        final int a = 2;
        // a = 3;


        // Error: cannot reassign an object declared with final keyword.

        final Student st = new Student("Nikhil", 2, 90.5f);
        //st = new Student("Nalin", 1, 90.5f);
    }
}
