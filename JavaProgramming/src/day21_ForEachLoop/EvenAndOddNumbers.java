package day21_ForEachLoop;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,56,89,78,90,31,43,54};

        int oddCount = 0;
        int evenCount = 0;

        for (int each : arr) {

            if(each % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }


        }

        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);

    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */