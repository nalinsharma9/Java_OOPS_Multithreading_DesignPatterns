//Example to show how Lamda Expression helps us save lines of code if we want to call a method,
// expecting a functional Interface argument


public class LamdaUse {
    //Refer to Functional Interface functionalInterfaceDemo

    public void Do(functionalInterfaceDemo fio){
        fio.singleAbstMethod();
    }


    public static void main(String[] args) {
        //Without Lamda Expression
        ExtendDemo ext = new ExtendDemo();
        LamdaUse l = new LamdaUse();
        l.Do(ext);


        //With Lamda syntax
        //We can use Lamda syntax to pass the abstract method definition directly without need to pass an object of class implementing the interface
        l.Do(()->System.out.println("Hello from Lamda syntax"));

    }

    public static class ExtendDemo implements functionalInterfaceDemo{
        @Override
        public void singleAbstMethod(){
            System.out.println("Hello from extendDemo class");
        }
    }


}
