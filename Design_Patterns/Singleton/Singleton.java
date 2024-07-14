package Design_Patterns.Singleton;

public class Singleton {

    //    ****** Thread Safe Singleton ******

    //obj is static because we will always have one objects per class
    //using volatile so that the local memory of each thread is matched with global value in real time which is shared by each thread
    //otherwise delay in global memory update can cause race condition, volatile keyword will make sure that the value of obj is same in all threads
    private static volatile Singleton obj = null;

    //making constuctor private so that no one can create object of this class
    private Singleton() {};

    //this method will return the object of this class
    public static Singleton getInstance() {
        if(obj == null) {   //optimization
            synchronized (Singleton.class) {
                if(obj == null)     //double checking
                    obj = new Singleton();
            }
        }
        return obj;
    }
}
