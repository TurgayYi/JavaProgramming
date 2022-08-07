package day35_Encapsulation.encapsulation;

public class Circle {


    private  double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){

        if( radius <= 0 ){
            return;

        }
        this.radius = radius;

    }


    public double calcArea(double radius){
        return pi*radius*radius;
    }

    public double calcPerimeter(double radius){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area=" + calcArea(radius) +
                "Perimeter=" + calcPerimeter(radius)+
                '}';
    }


}
