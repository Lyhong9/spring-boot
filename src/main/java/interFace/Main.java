package interFace;

public class Main {
    public static void main(String[] args) {
        Shape rObj = new Rectangle(10.5,10.2);
        Shape cObj = new Circle(10.5);

        System.out.println("Area of rectangle is " + rObj.area());
        System.out.println("Area of circle is " + cObj.area());
    }
}
