package abStract.teacherCode;

abstract class Shape {
    String color;

    Shape(String color){
        this.color=color;
    }

    // Normal method
    void displayInfo(){
        System.out.println("Shape color: "+ color);
    }

    // Abstract method (nobody)
    abstract double area();
}
