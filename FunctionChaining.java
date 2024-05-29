import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> squareMe = i ->i*i;
        System.out.println(squareMe.apply(5));

        Function<Integer, Integer> doubleIt = i ->2*i;
        System.out.println(doubleIt.apply(5));

        Function<Integer, Integer> squareAndThenDoubleIt = squareMe.andThen(doubleIt);
        System.out.println(squareAndThenDoubleIt.apply(5));

        Function<Integer, Integer> DoubleItAndThenSquareIt = squareMe.compose(doubleIt);
        System.out.println(DoubleItAndThenSquareIt.apply(5));

    }
}
