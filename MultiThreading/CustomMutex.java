package MultiThreading;

public class CustomMutex {

    private static CustomMutex mutex;

    public synchronized static CustomMutex getInstance() {
        if (mutex == null) {
            mutex = new CustomMutex();
        }
        return mutex;
    }


    private boolean isLocked = false;

    public synchronized void acquire() throws InterruptedException {
        while (isLocked) {
            this.wait();
        }
        isLocked = true;
    }

    public synchronized void release() {
        isLocked = false;
        this.notify();
    }
}
