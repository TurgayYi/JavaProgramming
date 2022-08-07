package day28_ArrayList;

import java.util.ArrayList;

public class Task6MinNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }


        int min = list.get(0);
        for (Integer each : list) {
            if(each < min){
                min = each;
            }

        }
        System.out.println(min);

    }

}
/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */