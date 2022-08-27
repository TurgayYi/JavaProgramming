package day45_Abstraction.shapeTask;

public class Rectangle extends Shape implements Perimeter{

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            throw new RuntimeException("Invalid width " + width);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            throw new RuntimeException("Invalid length " + length);
        }
        this.length = length;
    }

    public double area(){
        return width*length;
    }

    public double perimeter() {
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", perimeter=" + perimeter() +
                super.toString()+
                '}';
    }


}
