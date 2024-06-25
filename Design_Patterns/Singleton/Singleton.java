package Design_Patterns.Singleton;

public class Singleton {

    //obj is static because we will always have one objects per class
    static Singleton obj = null;

    //making constuctor private so that no one can create object of this class
    private Singleton() {};

    //this method will return the object of this class
    public static Singleton getInstance() {
        if(obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

}
