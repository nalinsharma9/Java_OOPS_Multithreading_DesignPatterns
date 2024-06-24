package OOPS.NestedClasses;

public class InnerClasses {
    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Nalin");
        Test b = new Test("Nikhil");

        //Name is not a static variable hence it will have diff values for diff instance.

        System.out.println(a.name);
        System.out.println(b.name);


    }
}
