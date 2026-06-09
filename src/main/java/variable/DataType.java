package variable;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        double price;
        System.out.print("INPUT VALUE A : "); a = scanner.nextInt();
        System.out.print("INPUT VALUE B : "); b = scanner.nextInt();
        System.out.print("INPUT Price  : "); price = scanner.nextDouble();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double dev = a / b;
        System.out.println("====== SHOW RESULT =======");
        System.out.println("VALUE A = "+a);
        System.out.println("VALUE B = "+b);
        System.out.println("VALUE SUM = "+sum);
        System.out.println("VALUE SUB = "+sub);
        System.out.println("VALUE MUL = "+mul);
        System.out.println("VALUE DEV = "+dev);

        // Integer types
        byte aByte = 100;              // 1 byte
        short aShort = 30000;          // 2 bytes
        int anInt = 100000;            // 4 bytes
        long aLong = 10000000000L;     // 8 bytes (note the L)

        // Floating-point types
        float aFloat = 5.75f;          // 4 bytes (note the f)
        double aDouble = 19.99;        // 8 bytes

        // Character type
        char aChar = 'A';              // 2 bytes

        // Boolean type
        boolean isJavaFun = true;      // 1 bit

        System.out.println("aByte = "+aByte);
        System.out.println("aShort = "+aShort);

        // String
        String name = "Lyhong";
        // Array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // List (from java collection)
        java.util.List<String> fruits = new java.util.ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("Name: " + name);
        System.out.println("Numbers: " + numbers[0]);
        System.out.println("Fruits: " + fruits);
    }
}
