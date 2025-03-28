package MultiThreading.CustomMutex;

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
//        if (isLocked) {
        while (isLocked) {          //while is critical to check condition again after the thread is awakened,
            this.wait();            // because maybe multiple threads were waiting to be awakened, and they did not check the condition again
        }
        isLocked = true;
    }

    public synchronized void release() {
        isLocked = false;
        this.notifyAll();
    }
}
