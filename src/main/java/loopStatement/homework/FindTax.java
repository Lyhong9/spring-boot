package loopStatement.homework;

import java.util.Scanner;

public class FindTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Enter Gender: ");
        String gender = input.nextLine();
        System.out.print("Enter Tel: ");
        String tel = input.nextLine();
        System.out.print("Enter Base Salary: ");
        int baseSalary = input.nextInt();
        input.nextLine();
        System.out.print("Enter Bonus: ");
        int bonus = input.nextInt();

        int totalSalary = baseSalary + bonus;
        double tax;

        if (baseSalary > 2000){
            tax = baseSalary * 0.1;
        }else if (baseSalary >= 1000){
            tax = baseSalary * 0.08;
        }else if (baseSalary >= 500){
            tax = baseSalary * 0.05;
        }else if (baseSalary >= 300){
            tax = baseSalary * 0.03;
        }else {
            tax = baseSalary * 0.03;
        }
        double netSalary = totalSalary - tax;
        System.out.println("Net Salary: "+ netSalary);
    }
}
