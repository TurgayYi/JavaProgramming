package day04_Variables;

public class Circle {
    public static void main(String[] args) {

        double radius = 16.4;
        double pi = 3.14;
        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("radius = " + radius);
        System.out.println("pi = " + pi);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}

/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI

 */