package day33_Statics;

public class CircleTest {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.4);

        double peri= circle1.calcPerimeter();
        System.out.println(peri);

        Circle.printPi();




    }


}
