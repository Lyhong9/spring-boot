package homework.polymorphism.methodOverloading;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println(cal.add(10, 20));

        System.out.println(cal.add(10.5, 20.5));

    }
}
