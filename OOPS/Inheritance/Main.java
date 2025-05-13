package OOPS.Inheritance;

public class Main {

    public static void main(String[] args) {
//        Box b1 = new Box(5,10,4);
//        System.out.println(b1);

//        BoxWeight bw1 = new BoxWeight();
//        System.out.println(bw1);

//        l is a private member, so it cannot be accessed from outside the class
//        System.out.println(bw1.l);

//        BoxWeight bw2 = new BoxWeight(5,10,4, 20);
//        System.out.println(bw2);

        Box b2 = new BoxWeight(5,10,4, 20); //child class constructor is called
        System.out.println(b2);

//        System.out.println(b2.weight);    //Access and the method signature is decided by the type of reference variable hence we can access only the members of Box class
//        System.out.println(b2.run);       //Child class object searches for parent method if the method is not found in child

        //b3 tries to find run() method in BoxWeight class but since it's not their it calls run() of parent class.
        Box b3 = new BoxWeight();
        b3.run();

        //BoxWeight has access to the weight but box class cannot initialize weight property. No keyword to call child class constructor
        // hence the error.
//        BoxWeight bw3 = new Box(5,10,4);


    }



}
