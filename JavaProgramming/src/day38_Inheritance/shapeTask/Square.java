package day38_Inheritance.shapeTask;

public class Square extends Shape{

    public int side;

    public Square( int side) {
        super("square");
        this.side = side;
    }


    @Override
    public double area() {
        return side *side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ",side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';



    }
}
