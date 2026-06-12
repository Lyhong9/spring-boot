package encapsulation.homework2;

import encapsulation.homework2.Brand;

public class Main {
    public static void main(String[] args) {
        Brand brand1 = new Brand(1,"Puma","PUMA0001","NEYMA is the KAK goat","Cambodia");
        Brand brand2 = new Brand();
        Brand brand3 = new Brand(brand2);

        brand1.setName("Nike");

        System.out.println(brand1.getName());
        System.out.println(brand2.getCode());
        System.out.println(brand3.getName());
    }
}
