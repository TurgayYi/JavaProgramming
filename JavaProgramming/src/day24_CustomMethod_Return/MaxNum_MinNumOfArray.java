package day24_CustomMethod_Return;

public class MaxNum_MinNumOfArray {

    public static void main(String[] args) {

        int [] numbers = {3, 5, 6, 2, 91, 1, 0, -76};

        int maxNumberOfArray = maxNumber(numbers);
        int minNumberOfArray = minNumber(numbers);

        System.out.println("minNumberOfArray = " + minNumberOfArray);
        System.out.println("maxNumberOfArray = " + maxNumberOfArray);


    }

    public static int maxNumber(int[] numbers){

        int maxNumber = numbers[0];

        for (int each : numbers) {
            if(each > maxNumber){
                maxNumber = each;
            }

        }

        return maxNumber;
    }

    public static int minNumber(int[] numbers){
        int minNumber = numbers[0];
        for (int each : numbers) {

            if(each<minNumber){

                minNumber = each;
            }

        }


        return minNumber;
    }



}

/*
	2. create a method that can return the maximum number from an array of integers

	3. create a method that can return the minimum number from an array of integers
 */