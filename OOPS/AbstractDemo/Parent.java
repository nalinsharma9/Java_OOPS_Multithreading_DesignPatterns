package OOPS.AbstractDemo;

//We cannot create objects of Abstract Classes

public abstract class Parent {
    int age;

    //We can define a constructor of abstract class, but we cannot call it
    public Parent(int age){
        this.age = age;
    }
    abstract void career();
    abstract void partner();

    //static and instance methods are allowed in Abstract classes
    void normalMethod(){
        System.out.println("Normal Method in Parent class");
    }

    static void staticMethod(){
        System.out.println("Static Method in Parent class");
    }

}
