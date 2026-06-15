package inheritance.hierarchical;

public class B extends A {
    protected int z;

    public int sum(){
        return x + y + z;
    }

    public int getZ(){
        return z;
    }

    public void setZ(int vz){
        z = vz;
    }

    public int superA(){
        return super.sum(); // use for superclass A method sum
    }
}
