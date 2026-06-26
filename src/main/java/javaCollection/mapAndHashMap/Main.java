package javaCollection.mapAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "value1");
        map.put(2, "value2");
        map.put(3, "value3");

        System.out.println(map.get(1));
        System.out.println(map.containsKey(2) ? "Has 2 Key" : "Has no Key");

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
