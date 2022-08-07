package day20_Arrays;

import java.util.Arrays;

public class ArraysPractise {

    public static void main(String[] args) {

        // store the elements : 10, 20, 50, 70

        int [] numbers = {10, 20, 50, 70};

        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------");


        // create a variable that can contain 5 scores

        int [] score = new int[5];

        score[0] = 23;
        score[1]=43;
        score[score.length-1] = 95;
        score[2] = 55;

        System.out.println(Arrays.toString(score));

        System.out.println("--------------------------------------------");

        String[] months = {"Jan", "Feb", "Mar","Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};//0~11(length-1)

        for (int i = 0; i < months.length; i++) {

            System.out.println(months[i]);

        }

        System.out.println("----------------------------------");

        for (int i = months.length-1; i >=0 ; i--) {

            System.out.println(months[i]);

        }


    }
}
