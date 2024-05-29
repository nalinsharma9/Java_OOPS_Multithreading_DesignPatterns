public class methodRefDemo {
    public static void main(String[] args) {
        // functionalInterfaceDemo interfaceDemo = Test :: testImplementation;
        // interfaceDemo.singleAbstMethod();

        functionalInterfaceDemo f = () -> System.out.println("Test Implementation");
        f.singleAbstMethod();
        f.printName();
    }
    

    // class Test {
    //     public static void testImplementation() {
    //         System.out.println("Test Implementation");
    //     }
    // }
}
