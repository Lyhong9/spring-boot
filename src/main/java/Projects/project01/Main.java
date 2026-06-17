package Projects.project01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff[] staffs = new Staff[500];
        int n, i;
        System.out.print("PLEASE INPUT Number OF STAFF: ");
        n = input.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("=====================================");
            System.out.println("         INPUT "+ n + " STAFF DATA           ");
            System.out.println("=====================================");
            staffs[i] = new Staff();
            staffs[i].input();
        }
        System.out.println("=====================================");
        System.out.println("          STAFF INFORMATION          ");
        System.out.println("=====================================");
        for (i = 0; i < n; i++) {
            staffs[i].display();
        }
    }
}
