package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {

        //create a function that can check if theInteger is contained in an array

        BiPredicate<Integer[], Integer> contains = (a, b) -> {

            boolean result = false;

            for (Integer each : a) {

                if (each == b) {
                    result = true;
                    break;

                }
            }

            return result;
        };

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 90};
        boolean r1 = contains.test(arr, 7);
        System.out.println(r1);


        System.out.println("----------------------------------");

        // create a function that can check if two strings are anagram

        BiPredicate<String, String> anagram = (a, b) -> {

            String[] arr1 = a.split("");
            String[] arr2 = b.split("");

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);

        };

        boolean r3 = anagram.test("test", "test");
        System.out.println(r3);

        System.out.println("----------------------------------");

        //create a function that can print the string for given number times

        BiConsumer<String, Integer> printMultipleTimes = (a, b) -> {

            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }

        };

        printMultipleTimes.accept("Wooden Spoon", 10);


        System.out.println("----------------------------------");


        // create a function that takes first and last names and returns the formatted full name

        BiConsumer<String, String> fullName = (f, l) -> {
            String name = "";
            name = f + " " + l;

            System.out.println(name);

        };

        fullName.accept("Ali", "Can");


        System.out.println("----------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : " + v);

        }
         */

        scrumTeam1.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });


        System.out.println("----------------------------------");

        // create a function that takes two integer and returns the maximum integer

        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> (a > b) ? a : b;

        int max = maxNum.apply(100, 200);

        System.out.println(max);


        System.out.println("----------------------------------");

        // create a function that takes two integer array and merge them into a list

        BiFunction<Integer[], Integer[], List<Integer>> merge = (x, y) -> {
            List<Integer> result = new ArrayList<>();

            result.addAll(Arrays.asList(x));
            result.addAll(Arrays.asList(y));


            return result;


        };

        Integer[] a = {1, 2, 3, 4, 5};
        Integer[] b = {6, 7, 8, 9};

        List<Integer> result = merge.apply(a, b);

        System.out.println(result);


        System.out.println("----------------------------------");

        //create a function that takes a list of String and a list of integer returns aa map
        //names = {"Josh", "Daniel"}
        //score = {100,110}

        // map => {Josh = 100, Daniel = 110}


        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2 = (x, y) -> {

            Map<String, Integer> map = new LinkedHashMap<>();

            for (int i = 0; i < x.size(); i++) {

                map.put(x.get(i),y.get(i));


            }


            return map;


        };

        List<String> l1 = new ArrayList<>(Arrays.asList("Ali", "Veli","Deli","Semih"));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(100,99,88,77));

       Map<String,Integer> finalMap =  merge2.apply(l1,l2);

        System.out.println(finalMap);


    }

}
