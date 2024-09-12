package OOPS.localPractice;

public class Stack {
    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop=-1;
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
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            array[stackTop] = element;
            System.out.println("Pushed " + element);
            return true;

    }

    public synchronized int pop(){
            if (isEmpty())
                return Integer.MIN_VALUE;

            int element = array[stackTop];
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            stackTop--;
            System.out.println("Popped " + element);
            return element;
        }

}
