package OOPS.NestedClasses;

//Outer classes cannot be static
public class A {
//    class Test{
      static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

          Test t = new Test("Nalin");

//        Non-static Inner class cannot be reference static context directly since it is dependent on object of Outer Class
//        A a = new A();
//        Test t = a.new Test("Nalin");

          System.out.println(t.name);
    }

}


