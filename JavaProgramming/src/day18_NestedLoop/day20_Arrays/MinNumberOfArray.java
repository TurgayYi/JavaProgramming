package day18_NestedLoop.day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {1, 45, 3, 0,-9};

        int min = numbers[0];


        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] < min){
                min = numbers[i];

            }

        }
        System.out.println(min);


    }

}
