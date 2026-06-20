package Projects.project01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff[] staffs = new Staff[500];
        int n = 0, i, option;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Add Staff");
            System.out.println("2. Show Staff");
            System.out.println("3. Exit Program");
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
            }
        }while (option != 3);

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
