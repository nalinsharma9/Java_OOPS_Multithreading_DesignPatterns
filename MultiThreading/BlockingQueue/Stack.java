package MultiThreading.BlockingQueue;

public class Stack {
    private int[] array;
    private int stackTop;
    //Every object can be used as lock in java
    //If we don't provide any object and mark the class method as synchronised,then the class object will be used as lock
    Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean isEmpty(){
        return stackTop < 0;
    }

    public boolean isFull(){
        return stackTop >= array.length - 1;
    }

    public synchronized boolean push(int element){
            if (isFull())
                return false;

            stackTop++;

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            array[stackTop] = element;
            return true;

    }


    public synchronized int pop(){
            if (isEmpty())
                return Integer.MIN_VALUE;

            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }

            stackTop--;
            return obj;

    }


}
