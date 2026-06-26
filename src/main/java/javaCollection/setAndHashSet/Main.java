package javaCollection.setAndHashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("5");
        System.out.println("Size: "+set.size());
        for(String s : set){
            System.out.println(s);
        }
    }
}
