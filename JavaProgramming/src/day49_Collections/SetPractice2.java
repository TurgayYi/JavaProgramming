package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String [] arr = {"Wooden Spoon", "Book", "Pen", "Wooden Spoon", "Wooden Spoon",
                "Milk", "Eggs", "Coke", "Paper Towels", "Wooden Spoon", "Phone"};


        arr = new HashSet<>( Arrays.asList(arr) ).toArray(new String[0]);
        /*
        Set<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(arr));

        arr = set1.toArray(set1.toArray(new String[0]));

         */


        System.out.println(Arrays.toString(arr));


        arr = new LinkedHashSet<>( Arrays.asList(arr) ).toArray(new String[0]);

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,200,300,400,500, 10,20,30,20,30,10));

        list = new ArrayList<>(new LinkedHashSet<>(list) );
        System.out.println("list = " + list);

        System.out.println("-------------------------------------");

        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

            return the fifth element after removing the duplicates
            Do not change the order of the elements
         */

        Integer[] nums = {1,1,1,4,2,2,5,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};


        LinkedHashSet<Integer> integers = new LinkedHashSet<>(Arrays.asList(nums));
        nums = integers.toArray( new Integer[0] );

        System.out.println("nums[4] = " + nums[4]);


        System.out.println("-------------------------------------");


        String str = "aaaaabbbbcccccdddeeee";

        //abcde
        //54534



        String result = ""; //a5b4c5d3e4

        for (String each : (new LinkedHashSet<>(Arrays.asList(str.split(""))))) {

            int count = Collections.frequency(Arrays.asList(str.split("")),each);
            result += each+count;

        }


        System.out.println(result);

        System.out.println("-------------------------------------");


        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John","James","Breanna", "Shay","Ahmet"));

        System.out.println("names.toArray(new String[0])[2] = " + names.toArray(new String[0])[4]);


        System.out.println("new ArrayList<>(names).get(4) = " + new ArrayList<>(names).get(4));


    }

}
