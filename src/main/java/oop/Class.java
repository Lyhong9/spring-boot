package oop;

import java.util.Scanner;

public class Class {

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

        public void Output2(){
            Demo demo = new Demo();
            demo.Input();
            demo.Output();
        }

}
