package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        System.out.println("-------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size = list.size();
        
        list.removeAll(Arrays.asList(0));
        
        int newSize = list.size();
        
        int totalNumberOfZeros = size-newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);

        }

        System.out.println(list);

        System.out.println("---------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list1) {
            if(each != 0){
                result.add(each);
            }
        }

        for (Integer each : list1) {
            if(each == 0){
                result.add(each);
            }

        }

        System.out.println(result);

        System.out.println("----------------------------------------");

        String str = "ABCD123$%#&456EFG!";
        char[] arr = str.toCharArray();


        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();


        for (char each : arr) {

            if(Character.isLetter(each)){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }

        }

        System.out.println("letters = " + letters);

        System.out.println("digits = " + digits);

        System.out.println("specialChars = " + specialChars);


       Character [] arrayLetter = letters.toArray(new Character[0]);

       Character[] arrayDigits = digits.toArray(new Character[0]);

       Character[] arraySpecialChars = specialChars.toArray(new Character[0]);

        System.out.println(Arrays.toString(arrayDigits));
        System.out.println(Arrays.toString(arrayLetter));
        System.out.println(Arrays.toString(arraySpecialChars));


        System.out.println("---------------------------------");
        
        String s = "ABCD123$%#&456EFG!";
        
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i <s.length() ; i++) {
            chars.add(s.charAt(i));
            
        }
        
        ArrayList<Character> letters1 = new ArrayList<>(chars);// add all the characters
        System.out.println("letters1 = " + letters1);
        letters1.removeIf(p-> !Character.isLetter(p));//remove the characters that are not letters
        System.out.println(letters1);


        ArrayList<Character> digits1 = new ArrayList<>(chars);// add all the characters
        digits1.removeIf(p-> !Character.isDigit(p));
        System.out.println(digits1);


        ArrayList<Character> specialChars1 = new ArrayList<>(chars);
        specialChars1.removeAll(digits1);
        specialChars1.removeAll(letters1);
        System.out.println(specialChars1);





    }

}
/*
1-Write a program that can swap the first and last elements of an ArrayList


2- Write a program that can move all the zeros to the last indexes of ArrayList
    [1,0,2,0,3,0,4,0]
    [1, 2, 3, 4, 0, 0, 0, 0]

    3. Write a program that can extract the special characters, digits and letters from a string and stores
    then in separate Arrays

    str = "ABCD123$%#&456EFG!"
        [1, 2, 3, 4, 5, 6]
        [A, B, C, D, E, F, G]
        [$, %, #, &, !]


 */