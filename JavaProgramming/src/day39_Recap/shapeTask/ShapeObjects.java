package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(4);
        System.out.println(square);

        square.setSide(12);
        System.out.println(square);


        System.out.println("--------------------------------");

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle);

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getName());
        System.out.println(rectangle);

        System.out.println("--------------------------");

        Circle circle = new Circle(4);
        System.out.println(circle);

        circle.setRadius(10);
        circle.getRadius();

        System.out.println(circle);
        System.out.println(circle.getName());










    }



}
