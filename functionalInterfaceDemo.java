@FunctionalInterface
public interface functionalInterfaceDemo {
    void singleAbstMethod();

    //default method are introduced so that we can add methods
    //in interface without necessarily implementing these methods in interface implementing classes
    //this is done to avoid compile time errors if the default methods are not overrided
    default void printName(){
        System.out.println("Nalin");
    }

    default void printName2(){
        System.out.println("John");
    }

    
} 
