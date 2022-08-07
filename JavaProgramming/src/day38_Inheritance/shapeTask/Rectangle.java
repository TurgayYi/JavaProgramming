package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public int length, width;

    public Rectangle( int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ",length=" + length +
                ",width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';

    }


    }
