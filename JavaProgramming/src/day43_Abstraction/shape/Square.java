package day43_Abstraction.shape;

public final class Square extends Shape{

    public double side;

    public Square(double side) {
        if(side<= 0){
            throw new RuntimeException("Invalid side");
        }
        this.side = side;
    }




    public double area() {
        return side * side;
    }



    public double perimeter() {
        return 4 * side;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';



    }


}
