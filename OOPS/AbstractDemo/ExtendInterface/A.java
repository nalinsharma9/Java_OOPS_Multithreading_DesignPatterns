package OOPS.AbstractDemo.ExtendInterface;

public interface A {
    //Java 8 allows default implementation which is the default body of the method in case the child class don't implement
    default void fun(){
        System.out.println("Fun");
    }

    //static methods should always have a body
    static void show(){
        System.out.println("Show");
    }
}
