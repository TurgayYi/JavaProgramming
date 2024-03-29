package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        //key           value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
       // hashMap.put(5, "Isabella");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(6, null);
        hashMap.put(7, "Ahmet");
        hashMap.put(8, null);
        hashMap.put(null,"Cihad");
        hashMap.put(null,"Emre");
        hashMap.put(null,"Hulya");


        System.out.println("hashMap = " + hashMap);

        System.out.println("hashMap.get(40) = " + hashMap.get(40));


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(null,"Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);


        Map<Integer, String> treeMap = new TreeMap<>(); // key can not be null but value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");
        treeMap.put(5, "Ahmet");
       // treeMap.put(null,"Hulya");
        treeMap.put(5, null);


        System.out.println("treeMap = " + treeMap);


        Map<Integer, String> hashtable = new Hashtable<>(); //key and value both can not be null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");
        hashtable.put(5, "Ahmet");
       // treeMap.put(5, null);






    }

}
