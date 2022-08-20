package day43_Abstraction.shape;

public final class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            throw new RuntimeException("Invalid length " + length);
        }

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if(width <= 0){
            throw new RuntimeException("Invalid width " + width);
        }
        this.width = width;
    }



    public double area() {
        return length * width;
    }


    public double perimeter() {
        return 2 * (length + width);
    }


    public String toString() {
        return "Rectangle{" +
                " length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


}
