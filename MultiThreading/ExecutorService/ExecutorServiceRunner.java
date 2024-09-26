package MultiThreading.ExecutorService;


//Executor Service class basics for Multithreading

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Thread Thread1 = new Thread(() -> {
            System.out.println("Running thread: " + "Thread1");
            System.out.println("Completed thread: " + "Thread1");
        },"Thread1");

        Thread Thread2 = new Thread(() -> {
            System.out.println("Running thread: "+ "Thread2");
            System.out.println("Completed thread: " + "Thread2");
        },"Thread2");

        executorService.execute(Thread1);
        executorService.execute(Thread2);

        //Main Thread task
        System.out.println("Main thread task started");
        for(int i = 0 ; i<50; i++){
            System.out.println(i);
        }

        System.out.println("Main thread task finished");


        executorService.shutdown();
    }
}
