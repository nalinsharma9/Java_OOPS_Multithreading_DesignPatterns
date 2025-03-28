package MultiThreading.AlternateThreadPrint;

public class PrintNumber {
    private volatile Integer value;
    private volatile boolean oddTurn = true;
    private volatile boolean evenTurn = false;


    public PrintNumber(){
        value = 0;
    }

    public int getValue(){
        return this.value;
    }

    public synchronized void printOdd() throws InterruptedException {
        while(oddTurn == false){
            this.wait();
        }
        System.out.println(value + "->" + Thread.currentThread().getName());
        value++;
        oddTurn = false;
        evenTurn = true;
        this.notifyAll();
    }

    public synchronized void printEven() throws InterruptedException {
        while(evenTurn == false){
            this.wait();
        }
        System.out.println(value + "->" + Thread.currentThread().getName());
        value++;
        evenTurn = false;
        oddTurn = true;
        this.notifyAll();
    }
}
