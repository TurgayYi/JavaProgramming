package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore;// or float averageScore = 20.5F;
        averageScore = 20.5F;
        byte num1 = (byte)averageScore; // explicit casting

        System.out.println("num1 = " + num1); // we get 20

        short num2 = (short) averageScore; // explicit casting
        System.out.println("num2 = " + num2); //20

        int num3 = (int) averageScore;//explicit casting
        System.out.println("num3 = " + num3); //20

        long num4 = (long) averageScore; //explicit casting
        System.out.println("num4 = " + num4); // 20

        float num5 = averageScore; // no casting
        System.out.println("num5 = " + num5); //20.5

        double num6 = averageScore;//implicit casting
        System.out.println("num6 = " + num6); // 20.5


    }




}
/*
	1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */