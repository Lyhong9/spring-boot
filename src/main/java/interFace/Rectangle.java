package interFace;

class Rectangle implements Shape {
    double width, height;

    Rectangle( double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
