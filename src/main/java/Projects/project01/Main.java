package Projects.project01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff[] staffs = new Staff[500];
        int n = 0, i, option;
        double isSearchID;
        int isFound;
        String isSearchPhone;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Add Staff");
            System.out.println("2. Show Staff");
            System.out.println("3. Search Staff by ID");
            System.out.println("4. Search Staff by Phone");
            System.out.println("5. Exit Program");
            System.out.println("==========================");
            System.out.print("Input option (1-5): ");option = input.nextInt();
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
            }
        }while (option != 5);
    }
}
