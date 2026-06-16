package homework.inheritance.hierarchical;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start System");

        Dog dog = new Dog();
        Puppy puppy = new Puppy();

        dog.bark();
        dog.eat();

        puppy.weep();
        puppy.eat();


    }
}
