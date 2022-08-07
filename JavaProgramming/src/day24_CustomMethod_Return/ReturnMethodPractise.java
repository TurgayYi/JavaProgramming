package day24_CustomMethod_Return;

public class ReturnMethodPractise {

    public static void main(String[] args) {
        // find the max number between 100 & 200

        int max = maxNumber(100,200);



        // multiply the max number by 2

        System.out.println(max*2);

    }

    public static int maxNumber(int num1, int num2){
        int result = 0;
        if(num1 > num2){
            result = num1;
        } else {
            result = num2;
        }
        return result;



    }




}

