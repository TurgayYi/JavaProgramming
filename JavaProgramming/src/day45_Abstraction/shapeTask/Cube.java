package day45_Abstraction.shapeTask;

public class Cube extends Shape implements Volume,Perimeter{

    private double side;

    public Cube( double side) {
        super("Cube");
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
        return 6*side*side;
    }

    public double volume() {
        return side*side*side;
    }

    public double perimeter() {
        return 12*side;
    }

    public String toString() {
        return "Cube{" +
                "side=" + side +
                super.toString()+
                " volume=" + volume() +
                " perimeter=" + perimeter() +
                '}';
    }


}
