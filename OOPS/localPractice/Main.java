package OOPS.localPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        System.out.println("MultiThreading");

//        Thread thread1 = new Thread(new Thread1(), "Thread1");
//        thread1.start();

        Stack s = new Stack(5);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                s.push(i);
        }, "Thread1");
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                s.pop();
        }, "Thread1");
        thread2.start();

    }
}
