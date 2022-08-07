package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];


        for (int number : numbers) {
            if(number>max){
                max =number;
            }


        }
        System.out.println(max);

    }

}
/*
        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if(num>max){           // if(numbers[i]){ // if there is element in the array that is grater than the current max
                max = num;         // max = numbers[i]} // assigning greater number to variable max
            }

        }
        System.out.println(max);
 */