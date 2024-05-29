import java.util.function.Predicate;

public class predicateJoining {
    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println(checkLength.test("Nalin Sharma"));

        Predicate<String> checkIsEven = s -> s.length() % 2 == 0;
        System.out.println(checkLength.test("Nalin Sharma"));

        //and
        Predicate<String> checkLenghtAndIsEven = checkLength.and(checkIsEven);
        System.out.println(checkLenghtAndIsEven.test("Nalin Sharma"));

        //or
       



        //negate

    }
}
