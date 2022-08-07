package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        double width = 4.5;
        double length = 8;
        double areaRectangle = width * length;
        double perimeterRectangle = 2 * (width + length);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("perimeterRectangle = " + perimeterRectangle);
        System.out.println("areaRectangle = " + areaRectangle);


    }
}

/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */