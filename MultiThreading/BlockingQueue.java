package MultiThreading;

/*
Producer Consumer pattern problem in multithreading.
We are trying to implement a queue where multiple threads are trying to add and poll items
from a fixed size queue continuously like a messaging queue
*/


import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q ;
    private int capacity;

    public BlockingQueue(int cap){
        q = new LinkedList<>();
        this.capacity = cap;
    }

    public boolean add(int item){
        synchronized (q) {
            //if(q.size() == capacity){          //while is necessary so that the condition is checked again when threads are awakened because maybe other
            while(q.size() == capacity) {        //threads were waiting after checking size condition, and it will start executing without checking condition
                try {
                    q.wait(); //adder1,adder2       //the thread waits until notified and resumes execution from after the line q.wait()
                } catch (InterruptedException e) {  // the thread will check condition again in an entry while loop after awakening
                    throw new RuntimeException(e);
                }
            }
            q.add(item);
            q.notifyAll();                      //awakens all threads in wait state to runnable state, but they still have to fight for lock
            return true;
        }
    }

    public int remove() {
        synchronized (q){
            //if(q.size() == 0){                  //every class extends Objects class which has wait and notify methods
            while(q.size() == 0) {
                try {
                    q.wait();                       //the thread waits until notified and resumes execution from after the line q.wait()
                } catch (InterruptedException e) {  // the thread will check condition again in an entry while loop after awakening
                    throw new RuntimeException(e);
                }
            }
            int element = q.poll();
            q.notifyAll();                      //awakens all threads in wait state to runnable state, but they still have to fight for lock
            return element;
        }
    }
}
