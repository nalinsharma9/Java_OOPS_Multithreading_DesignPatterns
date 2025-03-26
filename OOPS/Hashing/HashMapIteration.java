package OOPS.Hashing;

import java.util.HashMap;
import java.util.Map;

/*
Map<String, Object> map = ...;

for (String key : map.keySet()) {
    // ...
}

for (Object value : map.values()) {
    // ...
}

for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}
 */

public class HashMapIteration {

    public static void main(String[] args){
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "aabbbcc";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int freq = map.getOrDefault(ch,0);
            map.put(ch,freq+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry);
            Character key = entry.getKey();
            Integer value = entry.getValue();
        }

    }
}
