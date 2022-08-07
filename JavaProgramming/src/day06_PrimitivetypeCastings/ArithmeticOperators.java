package day06_PrimitivetypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println( 10 + 10);
        System.out.println(20 - 10);
        System.out.println(10 * 20 );

        System.out.println( 100 /3); // 33
        System.out.println(10/4); //2
        System.out.println(10.0 /4); //2.5
        System.out.println((double)10 / 4); //2.5
        System.out.println(10 / 4.0); //2.5
        System.out.println(10 / (double)4); //2.5
        System.out.println(10d / 4); //2.5


        int a  = 100;
         double b = a / 6;
        System.out.println(b);

        double c = a / 6.0; // 16.6666..
        // double c = (double)a /6;

        System.out.println(c);

        System.out.println(100D); // 100.0




    }


}
/*
+ : Addition
- : Subtract
* : Multiply
/ : Division
            in math :
             10 / 4 = 2.5

             in java:
              10 /4 = 2
              10.0 / 4 = 2.5



% : Remainder


 */