package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {


    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //  1 who has the maximum and minimum salary?

        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;

        String name1 = "";
        String name2 = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

           int eachSalary = entry.getValue();

           if(eachSalary < minSalary){

               minSalary = eachSalary;
               name1 = entry.getKey();

           }

           if(eachSalary > maxSalary){
               maxSalary = eachSalary;
               name2 = entry.getKey();

           }



        }
        System.out.println("minSalary = " + minSalary);
        System.out.println("name1 = " + name1);

        System.out.println("maxSalary = " + maxSalary);
        System.out.println("name2 = " + name2);


        System.out.println("----------------------------------------------------------");

        //how many employees has the salary between 120k ~ 150K?

        int count = 0;

        for (Map.Entry<String, Integer> eachEmployee : map.entrySet()) {

            int eachSalary = eachEmployee.getValue();

            if(eachSalary >= 120000 && eachSalary <= 150000){
                count++;
            }


        }

        System.out.println("count = " + count);


        System.out.println("----------------------------------------------------------");


        //   1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> pairs : map.entrySet()) {

            if (pairs.getValue() < 118000){
                System.out.println(pairs.getKey());
            }


        }

        System.out.println("----------------------------------------------------------");


        // 1.5 increase the salary employee by 10K if the current salary of employee is less than 120K

        System.out.println("map = " + map);

        for (Map.Entry<String, Integer> pairs : map.entrySet()) {

            if (pairs.getValue() < 120000){

                pairs.setValue(pairs.getValue() + 10000);

            }


        }
        System.out.println("map = " + map);


    }

}
