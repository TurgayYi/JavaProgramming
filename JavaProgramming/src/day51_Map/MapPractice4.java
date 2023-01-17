package day51_Map;

import java.util.*;

public class MapPractice4 {

    public static void main(String[] args) {


        ArrayList<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));


        Map< Integer, ArrayList<String>> groups = new TreeMap<>();

        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(9,group9);
        groups.put(5,group5);
        groups.put(24,group24);

        System.out.println("groups = " + groups);


        for (String eachName : groups.get(9)) {
            System.out.println(eachName);
        }


        System.out.println("-------------------------------------");

        for (Map.Entry<Integer, ArrayList<String>> entry : groups.entrySet()) {

            for (String eachNAme : entry.getValue()) {

                System.out.println("eachNAme = " + eachNAme);

            }


        }


    }
}
