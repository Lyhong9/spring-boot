package encapsulation.fromlearn;

public class Product {
    private int id;
    private String name;
    private double price;

    // Constructor with parameters
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Default Constructor
    public Product() {
        this.id = 0;
        this.name = "Unknown";
        this.price = 0.0;
    }

    //Copy Constructor
    public Product(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAll(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
