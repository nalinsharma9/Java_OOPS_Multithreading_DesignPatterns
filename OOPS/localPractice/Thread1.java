package OOPS.localPractice;

public class Thread1 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5;i++)
            System.out.println("Inside " + Thread.currentThread() + " " + i);
    }
}
