package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("--------------------");

        double[] arr2 ={1.4,2.3,3.4,4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------------");

        char [] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("--------------------");

        String[] arr4 = {"Ayse", "Fatma","Hayriye","Igor"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("--------------------");

        int[] n1 = {123,1,2,3,4,5,6};

        int max = ArraysUtility.max(n1);
        System.out.println(max);

        System.out.println("--------------------");

        double[] n2 = {1.2,2.3,3.4,4.5,5.6,6.7};
        double max2 = ArraysUtility.max(n2);

        System.out.println(max2);

        System.out.println("--------------------");

        int[] a1 = {1,2,3,4,5,6,7};
        boolean r1 = ArraysUtility.contains(a1,5);
        System.out.println(r1);

        System.out.println("--------------------");

        double[] a2 = {1.2,2.3,3.4,4.5,5.6,6.7};
        boolean r2 = ArraysUtility.contains(a2,3.5);
        System.out.println(r2);






    }

}
