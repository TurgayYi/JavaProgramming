package day18_NestedLoop.day20_Arrays;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        String output = "";

        for (int i = 0; i < arr1.length ; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if(arr1[i] ==arr2[j]){
                    output += arr1[i] + " ";
                }

            }


        }

        System.out.println(output);

    }
}
/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */