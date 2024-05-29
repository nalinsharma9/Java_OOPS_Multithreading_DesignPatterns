import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Test{

    public static void main(String[] args){
        
        //lamda expression to define calculate method

        /*
        Square s = (x) -> x * x;
        
        int ans=s.calculate(5);
        System.out.println(ans);
        */


        //Test test = new Test();
        //System.out.println(test.calculate(5));

        //Consumer example
        /*
        Consumer <Integer> c = (x) -> System.out.println(x);
        c.accept(5);

        BiConsumer <Integer,Integer> biC = (a,b) -> System.out.println(a+b);
        biC.accept(5, 10);
        */


        //Predicate Example

        /*
        Predicate<Integer> p = (x) -> (x%2) == 0; 
        boolean isTenEven = p.test(10);
        System.out.println(isTenEven);

        BiPredicate<String,String> biP = (s1,s2) -> s1.equals(s2);
        boolean isStringEqual = biP.test("Mukesh", "Nitesh");
        System.out.println(isStringEqual);
        */

        Function<Integer,Integer> Double = (x) -> x * 2;
        Integer result = Double.apply(10);
        System.out.println(result);

        BiFunction <Integer, Integer, Integer> mul = (a,b) -> a*b;
        Integer res = mul.apply(10,5);
        System.out.println(res);
        
        
    }
    
    /*@Override
    public int calculate(int x){
        return x*x;
    }*/
   
}
