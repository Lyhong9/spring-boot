package oop;

import java.util.Scanner;

class Test{
    private int x; // private can't call another class
    private int y;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");x = sc.nextInt();
        System.out.print("Enter Y: ");y = sc.nextInt();
    }

    public void Output(){
        System.out.println("Result Sum: " + (x+y));
        System.out.println("Result Min: " + (x-y));
        System.out.println("Result MUL: " + (x*y));
        System.out.println("Result DEV: " + (x/y));
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Create an object from a class
        Test obj1 = new Test();
        Test obj2 = new Test();

        obj1.Input(); // access class member
        obj1.Output(); // access class member

        obj2.Input();
        obj2.Output();
    }
}
