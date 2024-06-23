package OOPS.Static;

public class Main {
    public static void main(String[] args) {
//        Human nalin = new Human(26, 10000, "Nalin", false);
//        Human Rahul = new Human(34, 40000, "Rahul", true);
//
//        System.out.println(nalin.name);
//        System.out.println(Rahul.name);
//        System.out.println(Human.population);
    }

    //this is not dependant on an instance
    static void fun(){
        // you can't access non-static stuff without referencing their instance in a static context
        //greeting();

        //here I am referencing an instance
        Main obj = new Main();
        obj.greeting();
        System.out.println("Hello from fun");
    }

    //fun2 is non-static, so we know it will have an instance of Main, hence greeting will be
    // accessed automatically using that instance.
    void fun2(){
        greeting();
    }


    //we know something which is not static belongs to an instance hence it can't be accessed by static methods.
    void greeting(){
        //static members can be accessed by instance methods.
        //fun();
        System.out.println("Hello from greeting");
    }

}
