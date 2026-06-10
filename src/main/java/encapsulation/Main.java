package encapsulation;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"iPhone", 1299.5); // Constructor with parameters
        Product product2 = new Product(2,"Samsung", 1999.5); // Constructor with parameters
        Product product3 = new Product(); // Default Constructor
        Product product4 = new Product(product1);

        product1.setId(3);
        product1.setName("Nike");
        product1.setPrice(599);
        product2.setAll(7,"Lyhong",999);

        System.out.println(product1.getId());
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());

        System.out.println();
        System.out.println(product2.getId());
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());

        System.out.println();
        System.out.println(product3.getId());
        System.out.println(product3.getName());
        System.out.println(product3.getPrice());

        System.out.println();
        System.out.println(product4.getId());
        System.out.println(product4.getName());
        System.out.println(product4.getPrice());

    }
}
