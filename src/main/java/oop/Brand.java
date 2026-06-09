package oop;

import java.util.Scanner;

public class Brand {
    Scanner input = new Scanner(System.in);
    private int id;
    private String name,code,description,fromCountry;

    public void Input(){
        System.out.print("Enter ID: ");id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Name: ");name = input.nextLine();
        System.out.print("Enter Code: ");code = input.nextLine();
        System.out.print("Enter Description: ");description = input.nextLine();
        System.out.print("Enter From Country: ");fromCountry = input.nextLine();
    }

    public void Output(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Description: " + description);
        System.out.println("From Country: " + fromCountry);
    }

}
