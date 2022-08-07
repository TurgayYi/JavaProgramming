package day38_Inheritance.shapeTask;

public class Circle extends Shape{

    public int r;
    public static double pi = 3.14;


    public Circle(int r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double area() {
        return pi * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * pi *r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
