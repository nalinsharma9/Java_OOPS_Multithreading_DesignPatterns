import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
    List<Integer> arList = new ArrayList<>();
    arList.add(10);
    arList.add(20);
    arList.add(30);

    /*
    List<Integer> newAl = new ArrayList<>();
    newAl = arList.stream().filter(i -> i > 15).collect(Collectors.toList());

    newAl.stream().forEach(x -> System.out.println(x));

    Stream s = arList.stream().filter(i -> i%2==0);
    s.forEach(x -> System.out.println(x));
     */

    Stream s = arList.stream().map(i -> i*i);
    s.forEach(x -> System.out.println(x));





    //without streams
//    List<Integer> result = findElements(arList);
//    for(Integer i : result) {
//        System.out.println(i);
//    }

    }

    //without streams
//    public static List<Integer> findElements(List<Integer> arList) {
//        List<Integer> result = new ArrayList<>();
//
//        for(Integer i : arList) {
//            if(i >15) {
//                result.add(i);
//            }
//        }
//
//        return result;
//    }
}
