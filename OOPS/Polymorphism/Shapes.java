package OOPS.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in shapes");
    }

    void area(String message){
        System.out.println("Message " + message);
    }

    void area(int param){
        System.out.println("Area param " + param);
    }


}
