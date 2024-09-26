package OOPS.AbstractDemo.ExtendInterface;

public class Main implements B{
    @Override
//    cannot have lower access modifier than parent
//    private void greet(){
      public void greet(){
        System.out.println("Greet");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greet();
        A.show();
    }
}
