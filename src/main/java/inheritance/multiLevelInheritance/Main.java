package inheritance.multiLevelInheritance;

public class Main {
    public static void main(String[] args) {

        B b = new B();
        b.setX(10);
        b.setY(20);
        b.setZ(100);
        System.out.println("Sum X + Y + Z: "+ b.sum()); //Overwrite Method sum

        System.out.println("Sum X * Y: " +b.superA());

        A a = new A();
        a.setX(20);
        a.setY(20);
        System.out.println("Sum X * Y: "+ a.sum());

        C c = new C();
        c.setX(10);
        c.setY(20);
        c.setZ(30);
        c.setT(40);
        System.out.println("Sum X + Y + Z + T: "+ c.sumT());
    }
}
