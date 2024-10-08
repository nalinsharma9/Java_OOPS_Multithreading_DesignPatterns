package OOPS.Inheritance;

public class Box {
    private double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void greet(){
        System.out.println("Greet");
    }


    @Override
    public String toString() {
        return "Box{" +
                "l=" + l +
                ", h=" + h +
                ", w=" + w +
                '}';
    }


}
