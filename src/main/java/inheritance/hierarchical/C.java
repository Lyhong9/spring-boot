package inheritance.hierarchical;

public class C extends A {
    protected int t;

    public int sumT(){
        return x + y  + t;
    }

    public void setT(int vt){
        this.t = vt;
    }
}
