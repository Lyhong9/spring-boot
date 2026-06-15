package inheritance.multiLevelInheritance;

public class C extends B {
    int t;

    public int sumT(){
        return x + y + z + t;
    }

    public void setT(int vt){
        this.t = vt;
    }
}
