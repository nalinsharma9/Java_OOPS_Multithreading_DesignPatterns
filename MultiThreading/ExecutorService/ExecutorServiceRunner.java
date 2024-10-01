package MultiThreading.ExecutorService;


//Executor Service class basics for Multithreading

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Thread Thread1 = new Thread(() -> {
            System.out.println();
            System.out.println("Running thread: " + "Thread1");
            for(int i = 100; i<200; i++){
                System.out.print(i);
            }
            System.out.println();
            System.out.println("Completed thread: " + "Thread1");
        },"Thread1");

        Thread Thread2 = new Thread(() -> {
            System.out.println();
            System.out.println("Running thread: "+ "Thread2");
            for(int i = 200; i<300; i++){
                System.out.print(i);
            }
            System.out.println();
            System.out.println("Completed thread: " + "Thread2");
        },"Thread2");

        Thread Thread3 = new Thread(() -> {
            System.out.println();
            System.out.println("Running thread: "+ "Thread3");
            for(int i = 300; i<400; i++){
                System.out.print(i);
            }
            System.out.println();
            System.out.println("Completed thread: " + "Thread3");
        },"Thread3");

        executorService.execute(Thread1);
        executorService.execute(Thread2);
        executorService.execute(Thread3);

        //Main Thread task
        System.out.println();
        System.out.println("Main thread task started");
        for(int i = 0 ; i<100; i++){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Main thread task finished");


        executorService.shutdown();
    }
}
