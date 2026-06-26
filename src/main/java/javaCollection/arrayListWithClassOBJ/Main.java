package javaCollection.arrayListWithClassOBJ;

import encapsulation.homework2.Brand;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Brand> brands = new ArrayList<>();

        Brand brand1 = new Brand(1,"Apple","A2026","MOBILE PHONE","CAMBODIA");
        Brand brand2 = new Brand(2,"Android","B2026","MOBILE PHONE","CAMBODIA");
        Brand brand3 = new Brand(3,"Laptop","L2026","MOBILE PHONE","CAMBODIA");
        brands.add(brand1);
        brands.add(brand2);
        brands.add(0,brand3);
        int brandSize = brands.size();
        System.out.println("Brand Size: "+ brandSize);

        System.out.println();
        Brand.header();
        for(Brand brand : brands){
            brand.display();
        }

        brands.remove(brand1);

        // After Update
        System.out.println();
        Brand.header();
        for(Brand brand : brands){
            brand.display();
        }
    }
}
