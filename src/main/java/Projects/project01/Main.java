package Projects.project01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff[] staffs = new Staff[500];
        int n = 0, i, option;
        double isSearch;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Add Staff");
            System.out.println("2. Show Staff");
            System.out.println("3. Search Staff");
            System.out.println("4. Exit Program");
            System.out.println("==========================");
            System.out.print("Input option (1-3): ");option = input.nextInt();
            switch (option ) {
                case 1:
                    staffs[n] = new Staff();
                    staffs[n].input();
                    n++;
                    break;
                case 2:
                    for (i = 0; i < n; i++) {
                        staffs[i].display();
                    }
                    break;
                case 3:
                    System.out.println("========== Search Staff ==========");
                    System.out.print("Enter Staff ID: ");isSearch = input.nextDouble();
                    int isFound = 0;
                    for (i = 0; i < n; i++) {
                        if (staffs[i].getId() == isSearch) {
                            System.out.println("========== Data Found ==========");
                            staffs[i].display();
                            isFound = 1;
                            break;
                        }
                    }
                    if (isFound == 0) {
                        System.out.println("========== Staff Not Found ==========");
                    }
                    break;
            }
        }while (option != 4);

//        System.out.print("PLEASE INPUT Number OF STAFF: ");
//        n = input.nextInt();
//        for (i = 0; i < n; i++) {
//            System.out.println("=====================================");
//            System.out.println("         INPUT "+ n + " STAFF DATA           ");
//            System.out.println("=====================================");
//            staffs[i] = new Staff();
//            staffs[i].input();
//        }
//        System.out.println("=====================================");
//        System.out.println("          STAFF INFORMATION          ");
//        System.out.println("=====================================");
//        for (i = 0; i < n; i++) {
//            staffs[i].display();
//        }
    }
}
