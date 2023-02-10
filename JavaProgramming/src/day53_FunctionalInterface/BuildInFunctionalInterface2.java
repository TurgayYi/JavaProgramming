package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {

        //create a function that can check if theInteger is contained in an array

        BiPredicate <Integer[], Integer> contains = (a,b) -> {

            boolean result = false;

            for (Integer each : a) {

                if(each ==b){
                    result = true;
                    break;

                }
            }

            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,90};
        boolean r1 = contains.test(arr,7);
        System.out.println(r1);


        System.out.println("----------------------------------");

        // create a function that can check if two strings are anagram

        BiPredicate<String,String> anagram = (a, b)  -> {

          String[] arr1 = a.split("");
          String[] arr2 = b.split("");

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);

        };

        boolean r3 = anagram.test("test","test");
        System.out.println(r3);

        System.out.println("----------------------------------");

        //create a function that can print the string for given number times

        BiConsumer<String,Integer> printMultipleTimes = (a,b) -> {

            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }

        };

        printMultipleTimes.accept("Wooden Spoon",10);



        System.out.println("----------------------------------");


        // create a function that takes first and last names and returns the formatted full name

        BiConsumer<String,String> fullName = (f, l) -> {
            String name = "";
            name = f + " " + l;

            System.out.println(name);

        };

        fullName.accept("Ali", "Can");


        System.out.println("----------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : " + v);

        }
         */

        scrumTeam1.forEach(   (k,v) -> {
            System.out.println(k + " : " + v);
        }   );







    }


}
