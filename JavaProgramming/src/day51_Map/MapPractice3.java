package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


        //display all the names of all employees who has the max salaries


        int maxSalary = map.get("John");

        for (Map.Entry<String, Integer> pair : map.entrySet()) {

            String eachKey = pair.getKey();
            int eachValue = pair.getValue();

            if (eachValue > maxSalary){
                maxSalary = eachValue;

            }

        }

        System.out.println("maxSalary = " + maxSalary);


        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if(pairs.getValue() == maxSalary){
                System.out.println(pairs.getKey());
            }
        }

        System.out.println("-------------------------------------");

        int maxSal = Collections.max(map.values());
        System.out.println("maxSal = " + maxSal);


    }

}
