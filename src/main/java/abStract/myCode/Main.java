package abStract.myCode;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ERROR! ព្រោះវាជា Abstract បង្កើតផ្ទាល់មិនបានទេ

        Animal myDog = new Dog(); // ត្រឹមត្រូវ
        Animal myCat = new Cat(); // ត្រឹមត្រូវ
        myDog.makeSound();
        myCat.makeSound();

        Shape rectangle = new Rectangle(5.0, 4.0);
        Shape circle = new Circle(3.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());

        Calculator calc = new Addition();
        int result = calc.calculate(10, 20);
        System.out.println("Result = " + result);
    }
}
