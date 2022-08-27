package day45_Abstraction.shapeTask;

public class Sphere extends Shape implements Volume{

    private double radius;
    public final static double pi = 3.14;

    public Sphere(double radius) {
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid radius "+ radius);
        }
        this.radius = radius;
    }

    public double area() {
        return 4*pi*radius*radius;
    }


    public double volume() {
        return 4*pi*radius*radius*radius/3 ;
    }

    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                super.toString()+
                " volume=" + volume() +
                '}';


    }


}
