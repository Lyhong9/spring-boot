package inheritance.hierarchical;

public class C extends A {
    protected int t;

    public int sumT(){
        return super.x + super.y  + t;
    }

    public void setT(int vt){
        this.t = vt;
    }
}
