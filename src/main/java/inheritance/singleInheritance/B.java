package inheritance.singleInheritance;

public class B extends A{
    private int z;

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
