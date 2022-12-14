package day45_Abstraction.shapeTask;

public class Square extends Shape implements Perimeter{

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid side " + side);
        }
        this.side = side;
    }

    public double area() {
        return side*side;
    }

    public double perimeter() {
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                " side=" + side +
                super.toString()+
                ", perimeter=" + perimeter() +
                '}';
    }

}
