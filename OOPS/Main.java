package OOPS;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Student[] students = new Student[5];
        Student st= new Student("Nikhil", 2, 90.5f);
        Student st2= new Student(st);
        System.out.println(st.name);
        System.out.println(st2.name);
    }
}
