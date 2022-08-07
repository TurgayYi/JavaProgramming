package day24_CustomMethod_Return;

import java.util.Arrays;

public class ContainsElement {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};
        int num = 1;
        
        boolean arrContainsNum = contains(arr,num);

        System.out.println("ArrContainsNum = " + arrContainsNum);
        
        

    }
    
    public static boolean contains(int[] arr, int num){
        
        boolean contains= false;

        for (int each : arr) {
            if(each == num){
                contains=true;
            }
            
        }


        return contains;
    }
    
    
    
}

/*
9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false
					
				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */