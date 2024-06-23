package OOPS.Static;

import java.sql.SQLOutput;

//Example to show initialization of static variables
public class StaticBlock {
    static int a =4;
    static int b;

    //static block will only run once when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        System.out.println("I am in main");
        System.out.println("Value of a: "+StaticBlock.a + " Value of b: "+StaticBlock.b);

        StaticBlock.b +=3;

        StaticBlock obj = new StaticBlock();
        System.out.println("Value of a: "+StaticBlock.a + " Value of b: "+StaticBlock.b);
    }
}
