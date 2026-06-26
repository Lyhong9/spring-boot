package javaCollection.ArrayList;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lyhong");
        names.add("Vathana");
        names.add("Khan");
        names.add("Phasuk");
        names.add(2,"King");
        names.remove("Phasuk");
        System.out.println("\nGet First: "+names.getFirst());
        System.out.println("\nGet First: "+names.getLast());
        System.out.println("\nGet First: "+names.get(2));
        System.out.println("\nGet First: "+names.set(1, "Kakda"));

        int isFound = names.indexOf("LOL");
        if (isFound == -1) {
            System.out.println("Not found");
        }else {
            System.out.println("\nFind index: "+ isFound);
        }


        System.out.println();
        for (String name: names){
            System.out.println("Print all: " + name);
        }
    }
}
