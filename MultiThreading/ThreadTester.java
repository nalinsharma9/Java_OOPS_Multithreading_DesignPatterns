package MultiThreading;

import java.sql.SQLOutput;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is starting");

        //only follow this approach of extending if you don't want to extend any other class ,
        // because multiple inheritance is not supported in java
//        Thread thread1 = new Thread1("thread1");
//        thread1.start();

//        Thread thread2 = new Thread(new Thread2(), "thread2");
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 5; i++)
//                System.out.println("Inside " + Thread.currentThread() + " " + i);
//
//        }, "thread2");
//
//        thread2.start();

        Stack stack = new Stack(5);

        new Thread(() -> {
            int counter = 0;
            while(++counter < 10){
                System.out.println("Pushed: " + stack.push(100));
            }
        },"Pusher").start();

        new Thread(() -> {
            int counter = 0;
            while(++counter < 10){
                System.out.println("Popped: " + stack.pop());
            }
        },"Popper").start();

        System.out.println("Main is exiting");
    }

}
