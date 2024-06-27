//Example class to show how Method Ref is done in Java to call a method without implementing an interface

public class methodRefDemo {
    public static void main(String[] args) {
         functionalInterfaceDemo interfaceDemo = Test :: testImplementation;
         interfaceDemo.singleAbstMethod();
    }

     class Test {
         public static void testImplementation() {
             System.out.println("Test Implementation");
         }
     }
}
