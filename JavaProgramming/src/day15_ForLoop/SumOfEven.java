package day15_ForLoop;

public class SumOfEven {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 101; i++) {

            if(i % 2 == 0){
                sum += i;
            }


        }
        System.out.println("sum = " + sum);

    }


}
/*
1. Write a program that can return the sum of even numbers between 1 to 100
 */