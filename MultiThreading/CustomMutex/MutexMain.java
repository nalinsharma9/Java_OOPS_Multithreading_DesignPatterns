package MultiThreading.CustomMutex;

public class MutexMain {
    public static void main(String[] args) {
        CustomMutex mutex = CustomMutex.getInstance();
        Thread t1 = new Thread(() -> {
            try {
                mutex.acquire();
                System.out.println("Thread 1 acquired the lock");
                Thread.sleep(1000);
                mutex.release();
                System.out.println("Thread 1 released the lock");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                mutex.acquire();
                System.out.println("Thread 2 acquired the lock");
                Thread.sleep(1000);
                mutex.release();
                System.out.println("Thread 2 released the lock");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}
