package day26_CustomMethpdsPractise;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,5,6,8,8,8,8,9};

        String[] result = removeDuplicates(arr);

        System.out.println(Arrays.toString(result));

    }



    public static String[] removeDuplicates(int[] array){
        String str ="" + array[0] ;

        for (int i = 1; i < array.length; i++) {
            String each = ""+ array[i];
            if( !(str.contains(each)) ){
                str +=","+each;
            }


        }


        String[] result = str.split(",");
        return result;


    }
};