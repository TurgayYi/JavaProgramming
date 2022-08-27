package day45_Abstraction.shapeTask;

public class Cylinder extends Shape implements Volume,Perimeter{

    private double height;
    private double radius;

    public final static double pi = 3.14;

    public Cylinder( double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0){
            throw new RuntimeException("Invalid height " + height);
        }
        this.height = height;
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
        return (2*pi*radius*radius + 2*pi*radius*height);
    }



    public double volume() {
        return pi*radius*radius*height;
    }


    public double perimeter() {
        return 2*pi*radius;
    }

    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                super.toString()+
                ", volume=" + volume() +
                ", perimeter=" + perimeter() +
                '}';
    }


}
