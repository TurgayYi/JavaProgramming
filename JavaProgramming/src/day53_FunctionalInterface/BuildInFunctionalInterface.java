package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface BuildInFunctionalInterface {

    public static void main(String[] args) {


        Predicate<String> isPalindrome = (p) ->{
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");

        System.out.println("result1 = " + result1);


        Predicate<Integer> isEven = p -> p % 2 == 0;

        boolean result2 = isEven.test(44);
        System.out.println("result2 = " + result2);


        System.out.println("---------------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,5,4,6,5,6,6,7,9));
        //list.removeIf(p-> p%2 == 0);
        list.removeIf(isEven);

        System.out.println("list = " + list);

        System.out.println("------------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("level","Anna","Java","Python"));

        names.removeIf(isPalindrome);
        System.out.println("names = " + names);

        System.out.println("------------------------------------------------");


        Consumer<String> printEach = (s) ->{

            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }


        };

        printEach.accept("Java");

        System.out.println("------------------------------------------------");
        
        
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));

        /*
        for (Integer each : list2) {
            if(each %2 != 0){
                System.out.println(each);
            }
        }

         */

        list2.forEach(p-> { if(p%2 !=0) System.out.println(p); });

        System.out.println("------------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adibaya","Aygun Abbasova", "Jilili Jiwuer","Ali Ismayilov"));

        employees.forEach(
                s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") +1))
        );


        System.out.println("------------------------------------------------");

        Function<int[], List<Integer>> convertToList = ( a ) -> {
          List <Integer> result = new ArrayList<>();

          for( int each : a){
              result.add(each);
          }

          return result;

        };

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("------------------------------------------------");

        Function<List<Integer>, int[]> convertToArray= ( a ) -> {

            int[] result = new int[a.size()];

            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }

            return result;

        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] resultArray = convertToArray.apply(numbers);



    }

}
