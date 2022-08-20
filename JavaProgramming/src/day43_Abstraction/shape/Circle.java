package day43_Abstraction.shape;

public class Circle extends Shape{


    private double radius;
    public final double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<= 0){
            throw new RuntimeException("Invalid radius " + radius);
        }
        this.radius = radius;
    }



    public double area(){
        return pi * radius * radius;
    }
    public double perimeter(){
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ",perimeter=" + perimeter() +
                '}';
    }




}
