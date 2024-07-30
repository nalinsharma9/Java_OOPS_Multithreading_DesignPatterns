package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Static or Compile Time polymorphism  using Overloading
//        Same name but different signature of method

        Shapes s = new Shapes();
        s.area();
        s.area("Hello");


//        Dynamic or Run Time polymorphism using Overriding
//        Same name and same signature of method but the implementation is decided on runtime based on object



        //Method signature is decided by the reference type hence can't pass different arguments
//        Shapes r1 = new Rectangle();
//        r1.area(1,2);

        Shapes c = new Circle();
        c.area(1);

        Shapes s1 = new Square();
        s1.area(2);

//       Static methods can be inherited but cannot be overriden, because it depends on class name and not objects.

    }



}
