package encapsulation.homework2;

import encapsulation.homework2.Brand;

public class Brand {
    private int id;
    private String name,code,description,fromCountry;

    // Constructor with parameter
    public Brand(int id, String name, String code, String description, String fromCountry) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.fromCountry = fromCountry;
    }

    // Default Constructor
    public Brand() {
        this.id = 1;
        this.name = "Nike";
        this.code = "NIKE0001";
        this.description = "CR7 is the king goat";
        this.fromCountry = "Cambodia";
    }

    // Copy Constructor
    public Brand(Brand brand) {
        this.id = brand.getId();
        this.name = brand.getName();
        this.code = brand.getCode();
        this.description = brand.getDescription();
        this.fromCountry = brand.getFromCountry();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public static void header(){
        System.out.printf("%-5s %-15s %-10s %-15s %15s\n","ID","Name","code","description","fromCountry");
    }

    public void display() {
        System.out.printf("%-5s %-15s %-10s %-15s %15s\n",id,name,code,description,fromCountry);
    }
}
