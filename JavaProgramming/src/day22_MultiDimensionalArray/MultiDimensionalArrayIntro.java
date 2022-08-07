package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {
        String[] group1 = {"John", "Joes","James"};
        String[] group2 = {"John", "Joes","James"};
        String[] group3 = {"John", "Joes","James"};

        String[][] groups = new String[3][];
        groups[0] = group1;
        groups[1] =group2;
        groups[2] =group3;

        System.out.println(Arrays.toString(groups));// toString() is for one dimensional arrays only

        System.out.println(Arrays.deepToString(groups));

        System.out.println("-----------------------------------------------");

        int[][] numbers = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };

        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(numbers[2][3]);



    }
}
