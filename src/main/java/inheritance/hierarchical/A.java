package inheritance.hierarchical;

public class A {
    protected int x; // Protected able use in inheritance
    protected int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int b) {
        y = b;
    }

    public int sum() {
        return x + y;
    }
}
