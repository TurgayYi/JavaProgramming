package day28_ArrayList;

import java.util.ArrayList;

public class Task3MultiplyOddBy2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {

            if(each % 2 == 0){
                result.add(each);
            }else{
                result.add(each*2);
            }

        }
        System.out.println(result);

    }
}
/*
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
 */