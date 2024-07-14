package Design_Patterns.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

//        Singleton obj1 = Singleton.getInstance();
//        System.out.println(obj1);
//        Singleton obj2 = Singleton.getInstance();
//        System.out.println(obj2);

//        ********** Thread Safe Singleton **********

//        new Thread(() -> {
//            final Singleton obj1 = Singleton.getInstance();
//            System.out.println(obj1);
//        }, "Thread1").start();
//
//        new Thread(() -> {
//            final Singleton obj2 = Singleton.getInstance();
//            System.out.println(obj2);
//        }, "Thread2").start();

        //we need to use executor service to call the singleton class at the same time by diff threads

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> {Singleton obj1 = Singleton.getInstance();
            System.out.println(obj1);
        });
        executor.execute(() -> {Singleton obj1 = Singleton.getInstance();
            System.out.println(obj1);
        });


    }
}
