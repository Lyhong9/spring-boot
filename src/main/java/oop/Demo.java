package oop;

import java.util.Scanner;

public class Demo {
    private String name;
    private int age;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");name = sc.nextLine();
        System.out.print("Enter Age: ");age = sc.nextInt();
    }

    public void Output(){
        System.out.println("Result Name: " + name);
        System.out.println("Result Age: " + age);
    }
}
