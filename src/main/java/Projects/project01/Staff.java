package Projects.project01;

import java.util.Scanner;

public class Staff {
    private long id;
    private String firstName,
            lastName,
            gender,
            email,
            address,
            phone;
    private double salary;

    Staff() {}
    Staff(long id,
          String firstName,
          String lastName,
          String gender,
          String email,
          String address,
          String phone,
          double salary) {
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

    // Call this ONCE before printing your loop of data to act as the Excel column headers
    public static void displayHeader() {
        System.out.printf("%-8s %-15s %-15s %-10s %-25s %-15s %-15s %-12s\n",
                "ID", "First Name", "Last Name", "Gender", "Email", "Address", "Phone", "Salary");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

    // Updated display method for the individual rows
    public void display() {
        System.out.printf("%-8d %-15s %-15s %-10s %-25s %-15s %-15s $%-11.2f\n",
                id, firstName, lastName, gender, email, address, phone, salary);
    }
}