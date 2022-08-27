package day45_Abstraction.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Cube cube = new Cube(4);
        Pentagon pentagon = new Pentagon(5,2);
        Rectangle rectangle = new Rectangle(5,4);
        Sphere sphere = new Sphere(4);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5);

        System.out.println("circle = " + circle);
        System.out.println("cube = " + cube);
        System.out.println("pentagon = " + pentagon);
        System.out.println("rectangle = " + rectangle);
        System.out.println("sphere = " + sphere);
        System.out.println("square = " + square);
        System.out.println("triangle = " + triangle);



    }
}
