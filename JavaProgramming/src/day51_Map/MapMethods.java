package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name  & score

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 95);
        students.put("Ali", 89);
        students.put("Alex", 86);
        students.put("Ozan", 98);
        students.put("Andriy", 07);
        students.put("Serkan", 86);

        students.put("Ali", 96);
        students.put("Ali", 86);
        students.put("Ali", 69);


        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());


        // display the score of Alex
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));


        //replace Alis score to 90

        students.replace("Ali",90);
        System.out.println("students = " + students);


        students.remove("Alex");
        System.out.println("students = " + students);

        students.remove("Ali");
        System.out.println("students = " + students);


        boolean r1 = students.containsKey("Muhtar");
        System.out.println("r1 = " + r1);

        boolean r2 = students.containsKey("Serkan");
        System.out.println("r2 = " + r2);


        boolean r3 = students.containsValue(100);
        System.out.println("r3 = " + r3);

        boolean r4 = students.containsValue(95);
        System.out.println("r4 = " + r4);


        System.out.println("students.isEmpty() = " + students.isEmpty());


        System.out.println("-----------------------------------");


        Map<String,Integer> map1 = new HashMap<>();
        map1.putAll(students);


        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);


        System.out.println("map2==map1 = " +( map2 == map1));
        System.out.println("map2.equals(map1) = " + map2.equals(map1));

        map1.clear();
        map2.clear();

        System.out.println("map2 = " + map2);
        System.out.println("map1 = " + map1);



        
    }



}
