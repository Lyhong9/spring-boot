package loopStatement.homework;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id,qty;
        String name,description,category;
        double price,discount;


        System.out.print("Enter ID: ");
        id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        name = input.nextLine();

        System.out.print("Description: ");
        description = input.nextLine();

        System.out.print("Category: ");
        category = input.next();

        System.out.print("Price: ");
        price = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Quantity: ");
        qty = input.nextInt();
        input.nextLine();

        System.out.print("Enter Discount: ");
        discount = input.nextDouble();

        System.out.printf("%-5s %-20s %-20s %-15s %-10s %-10s %-10s \n","ID","Name","Description","Category","Price","Qty","Discount");
        System.out.printf("%-5s %-20s %-20s %-15s %-10s %-10s %-10s \n",id,name,description,category,price,qty,discount);
    }
}
