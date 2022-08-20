package day43_Abstraction.shape;

public class ShapeObjects {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,5);
        System.out.println(rectangle);

        Square square = new Square(5);
        System.out.println(square);

        Circle circle = new Circle(-5);
        System.out.println(circle);




    }
}
