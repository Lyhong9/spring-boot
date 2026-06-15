package abStract.myCode;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ERROR! ព្រោះវាជា Abstract បង្កើតផ្ទាល់មិនបានទេ

        Animal myDog = new Dog(); // ត្រឹមត្រូវ
        Animal myCat = new Cat(); // ត្រឹមត្រូវ

        myDog.makeSound();
        myCat.makeSound();

    }
}
