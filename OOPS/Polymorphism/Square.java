package OOPS.Polymorphism;

public class Square extends Shapes {
    @Override
    void area(int side){
        System.out.println("Area is " + side*side);
    }
}
