/*
    Private means the access is allowed in the same class only.
    Public means the access is allowed in the same package only.
    Default modifier means the access is allowed in the same package only.
 */

package OOPS.AccessControl;

public class Main {
    public static void main(String[] args) {
        A a = new A(10, "Hello");
//        Not a good practice to allow access to internal data members directly.
//        We can use access modifiers to restrict access to data members.
//        a.arr[0] = 10;

        //Even though arr object is private it can be still modified by using setter method.
        //Hence, we use final keyword mostly for internal objects to avoid such scenarios and prevent modification.
//        int[] arr2 = new int[10];
//        a.setArr(arr2);

    }
}
