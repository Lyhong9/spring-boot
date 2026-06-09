package variable;

public class Print {
    public static void main(String[] args) {
        System.out.println("================ Display Product List ================");

        String name = "Car";
        int price = 25000;
        int quantity = 100;
        System.out.printf("%-10s %-20s %10s \n", "Name", "Price", "Quantity");
        System.out.printf("%-10s %-20s %10s", name, price, quantity);
    }
}
