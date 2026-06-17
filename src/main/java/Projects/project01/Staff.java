package Projects.project01;

import java.util.Scanner;

public class Staff {
    private long id;
    private String firstName, lastName, gender, email, address, phone;
    private double salary;

    Staff() {}
    Staff(long id, String firstName, String lastName, String gender, String email, String address, String phone, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-15s: ", "Enter ID");
        this.id = input.nextLong();
        input.nextLine(); // ជម្រះ buffer (Clear buffer) ក្រោយបញ្ចូលលេខ

        System.out.printf("%-15s: ", "Enter First Name");
        this.firstName = input.nextLine();

        System.out.printf("%-15s: ", "Enter Last Name");
        this.lastName = input.nextLine();

        System.out.printf("%-15s: ", "Enter Gender");
        this.gender = input.nextLine();

        System.out.printf("%-15s: ", "Enter Email");
        this.email = input.nextLine();

        System.out.printf("%-15s: ", "Enter Address");
        this.address = input.nextLine();

        System.out.printf("%-15s: ", "Enter Phone");
        this.phone = input.nextLine();

        System.out.printf("%-15s: ", "Enter Salary ($)");
        this.salary = input.nextDouble();

        System.out.println("=====================================");
    }

    public void display() {

        System.out.printf("%-12s: %d\n", "ID", id);
        System.out.printf("%-12s: %s\n", "First Name", firstName);
        System.out.printf("%-12s: %s\n", "Last Name", lastName);
        System.out.printf("%-12s: %s\n", "Gender", gender);
        System.out.printf("%-12s: %s\n", "Email", email);
        System.out.printf("%-12s: %s\n", "Address", address);
        System.out.printf("%-12s: %s\n", "Phone", phone);
        System.out.printf("%-12s: $%.2f\n", "Salary", salary);
        System.out.println("=====================================");
    }
}