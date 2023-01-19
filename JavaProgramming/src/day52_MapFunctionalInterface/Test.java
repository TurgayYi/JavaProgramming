package day52_MapFunctionalInterface;

public class Test {

    public static void main(String[] args) {


        //function1 : create a function that can display a number is odd or even
        MfFirstFunctionalInterface oddOrEvenNumber =  (n) -> {
            if(n%2==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);

        // function2 : create a function that can check if a person is eligible to buy alcohol

        MfFirstFunctionalInterface eligibleToBuyAlcohol = (age) -> {
            if(age>= 21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }


        };

        eligibleToBuyAlcohol.apply(20);



        // function : create a function that can display the cube of a number


        MfFirstFunctionalInterface printCube;

        printCube = (n) ->{
            System.out.println(n*n*n);
        };

        printCube.apply(30);



        // function4: create a function that can check if a number is divisible by both 3 and 5

        MfFirstFunctionalInterface divisibleBy3And5 = n -> {
          if(n%15==0){
              System.out.println(n + " is divisible by 3 and 5");
          }else{
              System.out.println(n + " is not divisible by 3 and 5");
          }
        };

        divisibleBy3And5.apply(45);






    }

}
