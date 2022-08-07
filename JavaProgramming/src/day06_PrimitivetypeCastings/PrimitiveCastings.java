package day06_PrimitivetypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {


        byte a = 100;
        short b = a;
        // short b = (short)a

        int c = (int) b;
        // int c = (int)b;

        long d = c;
        // long d = (long)c

        float e = d;
        double f = e;
        System.out.println("-------------------------------------------");

        int x = 55;
        short y = (short)x;// you CANNOT directly assign short y = x--> it gives compile error
        System.out.println("y = " + y);
        System.out.println("x = " + x);


        long j = 1000000;
        //short k = j; // larger primitive type can not be assigned to small primitive type
        short k = (short)j;
        System.out.println("k = " + k);
        System.out.println("j = " + j);


        double l = 2.5;
        float m = (float)l;
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n; // 10

        System.out.println(n+ " : " + s );
        System.out.println("-------------------------------------------");

        double d1 = 20.05;
        short s1 = (short) d1;

        System.out.println( d1 + " : " + s1);


        float f1 = 30.5F;
        long l1 = (long) f1;





    }

}
