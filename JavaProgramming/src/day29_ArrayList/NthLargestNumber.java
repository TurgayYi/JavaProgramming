package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));

        int n = 5;

        for (int i = 1; i < 5; i++) {

            arrayList.removeIf(p-> Collections.max(arrayList)==p);

        }

        int max = Collections.max(arrayList);

        System.out.println(max);




    }
}
/*

1. write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
 */