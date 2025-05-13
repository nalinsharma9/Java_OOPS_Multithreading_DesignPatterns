package OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        System.out.println("Inside BoxWeight default constructor");
        this.weight=-1;

    }

    public BoxWeight(double l, double  h, double w, double weight){
        super(l,w,h);
        //to call the parent class constructor used to initialize the parent class variables
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;;
    }

    @Override
    //Access modifier of overriden method cannot be less than the modifier of base class
//    private void greet(){
      public void greet(){
        System.out.println("Greeting from BoxWeight");
    }

    @Override
    public String toString() {
        return super.toString() +
                "BoxWeight{" +
                "weight=" + weight +
                '}';
    }
}
