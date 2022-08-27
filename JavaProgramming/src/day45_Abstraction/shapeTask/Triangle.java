package day45_Abstraction.shapeTask;

public class Triangle extends Shape implements Perimeter {

    private double side;

    public Triangle( double side) {
        super("Triangle");
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

    public double area(){
        return side * side * 1.73 / 4;
    }

    public double perimeter() {
        return 3*side;
    }

    public String toString() {
        return "Triangle{" +
                "side=" + side +
                super.toString() +
                ", perimeter=" + perimeter() +
                '}';
    }


}
