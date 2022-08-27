package day45_Abstraction.shapeTask;

public class Circle extends Shape implements Perimeter{
    private double radius;
    public final static double pi = 3.14;
    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid radius " + radius);
        }
        this.radius = radius;
    }

    public double area() {
        return  radius*radius*pi;
    }


    public double perimeter() {
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                super.toString() +
                " perimeter=" + perimeter() +
                '}';
    }


}
