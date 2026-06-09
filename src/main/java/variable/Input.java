package variable;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productId;
        String productName, description;
        int quantity;
        double price, discount;

        System.out.println("==== INPUT PRODUCT INFORMATION =====");
        System.out.print("INPUT PRODUCT ID : "); productId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("INPUT PRODUCT NAME : "); productName = scanner.nextLine();
        System.out.print("INPUT PRODUCT DES : "); description = scanner.nextLine();
        System.out.print("INPUT PRODUCT QTY : "); quantity = scanner.nextInt();
        System.out.print("INPUT PRODUCT PRICE : "); price = scanner.nextDouble();
        System.out.print("INPUT PRODUCT DISCOUNT : "); discount = scanner.nextDouble();

// find final total and discount
        double total = quantity * price;
        double discountAmount = total * discount / 100;
        double finalTotal = total - discountAmount;

        System.out.println("====DISPLAY PRODUCT INFORMATION=====");
        System.out.println("PRODUCT ID = "+productId);
        System.out.println("PRODUCT NAME = "+productName);
        System.out.println("PRODUCT DES = "+description);
        System.out.println("PRODUCT QTY = "+quantity);
        System.out.println("PRODUCT PRICE = $"+price);
        System.out.println("PRODUCT DIS = "+discount);
        System.out.println("TOTAL = $"+total);
        System.out.println("DISCOUNT AMOUNT = $"+discountAmount);
        System.out.println("FINAL TOTAL = $"+finalTotal);
    }
}
