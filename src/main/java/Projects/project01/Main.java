package Projects.project01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff[] staffs = new Staff[500];
        int n = 0, i, option, optionMenuUpdate;
        double isSearchID;
        int isFound;
        String isSearchPhone;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Add Staff");
            System.out.println("2. Show Staff");
            System.out.println("3. Search Staff by ID");
            System.out.println("4. Search Staff by Phone");
            System.out.println("5. Update Staff");
            System.out.println("6. Delete Staff");
            System.out.println("7. Exit Program");
            System.out.println("==========================");
            System.out.print("Input option (1-7): ");
            option = input.nextInt();
            input.nextLine();
            switch (option ) {
                case 1:
                    staffs[n] = new Staff();
                    staffs[n].input();
                    n++;
                    break;
                case 2:
                    Staff.displayHeader();
                    for (i = 0; i < n; i++) {
                        staffs[i].display();
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("========== Search Staff by ID ==========");
                    System.out.print("Enter Staff ID: ");isSearchID = input.nextDouble();
                    isFound = 0;
                    for (i = 0; i < n; i++) {
                        if (staffs[i].getId() == isSearchID) {
                            System.out.println("========== Data Found ==========");
                            staffs[i].display();
                            isFound = 1;
                            break;
                        }
                    }
                    if (isFound == 0) {
                        System.out.println("========== Staff Not Found ==========");
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("========== Search Staff by Phone ==========");
                    System.out.print("Enter Staff Phone: ");
                    input.nextLine();
                    isSearchPhone = input.nextLine();
                    isFound = 0;
                    for (i = 0; i < n; i++) {
                        if (staffs[i].getPhone().equals(isSearchPhone)) {
                            System.out.println("========== Data Found ==========");
                            staffs[i].display();
                            isFound = 1;
                            break;
                        }
                    }
                    if (isFound == 0) {
                        System.out.println("========== Staff Not Found ==========");
                    }
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("========== Update Staff ==========");
                    System.out.print("Enter Staff ID: ");isSearchID = input.nextDouble();
                    isFound = 0;
                    for (i = 0; i < n; i++) {
                        if (staffs[i].getId() == isSearchID) {
                            //process
                            System.out.println("========== Current Data ==========");
                            Staff.displayHeader();
                            staffs[i].display();
                            do {
                                System.out.println("========== Update Staff Data ==========");
                                System.out.println("1. By First Name");
                                System.out.println("2. By Last Name");
                                System.out.println("3. By Gender");
                                System.out.println("4. By Email");
                                System.out.println("5. By Address");
                                System.out.println("6. By Phone");
                                System.out.println("7. By Salary");
                                System.out.println("8. BACK");
                                System.out.print("Choice option (1-8): ");
                                optionMenuUpdate = input.nextInt();
                                input.nextLine();
                                String firstName,  lastName, gender, email, address, phone;
                                double salary;
                                switch (optionMenuUpdate) {
                                    case 1:
                                        System.out.print("Enter New First Name: ");firstName = input.nextLine();
                                        staffs[i].setFirstName(firstName);
                                        break;
                                    case 2:
                                        System.out.print("Enter New Last Name: ");lastName = input.nextLine();
                                        staffs[i].setLastName(lastName);
                                        break;
                                    case 3:
                                        System.out.print("Enter New Gender: ");gender = input.nextLine();
                                        staffs[i].setGender(gender);
                                        break;
                                    case 4:
                                        System.out.print("Enter New Email: ");email = input.nextLine();
                                        staffs[i].setEmail(email);
                                        break;
                                    case 5:
                                        System.out.print("Enter New Address: ");address = input.nextLine();
                                        staffs[i].setAddress(address);
                                        break;
                                    case 6:
                                        System.out.print("Enter New Phone: ");phone = input.nextLine();
                                        staffs[i].setPhone(phone);
                                        break;
                                    case 7:
                                        System.out.print("Enter New Salary: ");salary = input.nextDouble();
                                        staffs[i].setSalary(salary);
                                        break;
                                }
                            }while (optionMenuUpdate != 8);
                            isFound = 1;
                            break;
                        }
                    }
                    if (isFound == 0) {
                        System.out.println("========== Staff Not Found ==========");
                    }
                    System.out.println(" ");
                    break;
            }
        }while (option != 7);
    }
}
