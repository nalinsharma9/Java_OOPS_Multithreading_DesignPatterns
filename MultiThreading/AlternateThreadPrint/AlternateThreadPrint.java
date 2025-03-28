package MultiThreading.AlternateThreadPrint;

/*
Implement the class to print 1 to 10 by two threads where 1 thread prints odd and other prints even in sequence.
Expected output:
0->Thread1
1->Thread2
2->Thread1
3->Thread2
 */

public class AlternateThreadPrint {
    public static void main(String[] args) {
        PrintNumber obj1 = new PrintNumber();

        Thread t1 = new Thread(() -> {
            try {
                while(obj1.getValue() < 10){
                    obj1.printOdd();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread1");

        Thread t2 = new Thread(() -> {
            try {
                while(obj1.getValue() < 10){
                    obj1.printEven();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread2");

        t1.start();
        t2.start();
    }
}
