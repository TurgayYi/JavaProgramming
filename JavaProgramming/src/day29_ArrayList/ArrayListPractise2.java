package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractise2 {

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ahmed", "Ali", "David", "Jimmy","Aaron", "David","Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);

        System.out.println("-------------------------------");

        String[] names = {"Mary", "Monica", "Nehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        System.out.println(list);

        list.removeIf(p-> p.startsWith("M"));

        System.out.println(list);

        names = list.toArray(new String[0]) ;

        System.out.println(Arrays.toString(names));






    }
}
