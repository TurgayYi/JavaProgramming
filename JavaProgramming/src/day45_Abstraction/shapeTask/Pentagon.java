package day45_Abstraction.shapeTask;

public class Pentagon extends Shape implements Perimeter{

    private double side;
    private double height;

    public Pentagon( double side, double height) {
        super("Pentagon");
        setHeight(height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0){
            throw new RuntimeException("Invalid height " + height);
        }
        this.height = height;
    }

    public double area() {
        return 5 * side * height / 2 ;
    }


    public double perimeter() {
        return 5*side;
    }

    public String toString() {
        return "Pentagon{" +
                "side=" + side +
                ", height=" + height +
                ", perimeter=" + perimeter() +
                super.toString() +
                '}';


    }


}
